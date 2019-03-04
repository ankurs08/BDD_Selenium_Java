package utils;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtils {
	public static WebDriver driver;
	PropertiesUtils propUtil = new PropertiesUtils();

	/***************************************************************************
	 * Initial functions
	 ***************************************************************************/

	/************************************************************************
	 * The function initiates the webdriver instance The driver input is taken from
	 * the properties file 
	 * Params: none 
	 * Return: void 
	 ******************************************************************************/
	public void initiateDriver() throws IOException {
		if (propUtil.getPropValue("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver (2).exe");
			ChromeOptions chromeOpts = new ChromeOptions();
			// only required when headless execution is required
			// chromeOpts.addArguments("--headless");
			driver = new ChromeDriver(chromeOpts);
		} else if (propUtil.getPropValue("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.22.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/****************************
	 * The function launches URL 
	 * Params: String
	 * Return: void
	 *****************************/
	public void launchURL(String url) {
		driver.get(url);
	}

	/***************************************************************************
	 * basic webelement functions
	 ***************************************************************************/

	/*********************************************************************
	 * The function clicks on the link 
	 * Params: WebElement 
	 * Return: void
	 ********************************************************************/
	public void clickLink(WebElement webE) {
		webE.click();
	}

	/*********************************************************************
	 * The function gets text from the webElement 
	 * Params: WebElement 
	 * Return: String
	 *********************************************************************/
	
	public String getText(WebElement webE) {
		return webE.getText();
	}

	/*********************************************************************
	 * The function sets text in the webElement 
	 * Params: WebElement, String 
	 * Return:void
	 *********************************************************************/
	
	public void setText(WebElement webE, String setString) {
		webE.sendKeys(setString);
	}

	/*********************************************************************
	 * The function clicks on the checkbox if not selected already 
	 * Params: List<WebElement> 
	 * Return: void
	 ********************************************************************/
	public void clickCheckBox(List<WebElement> listWebE) {
		for (WebElement ele : listWebE) {
			// check if the checkbox is already selected
			if (ele.isSelected()) {
				System.out.println("Already selected");
				continue;
			} else {
				System.out.println("new checked");
				ele.click();
			}
		}
	}

	/****************************************
	 * The function switched to a frame 
	 * Params: WebElement 
	 * Return: void
	 ***************************************/
	public void switchToFrame(WebElement webE) {
		driver.switchTo().frame(webE);
	}

	/***************************************************************************
	 * The function helps in selecting an option from dropdown using visible text
	 * Params: WebElement, String 
	 * Return: void
	 ****************************************************************************/
	public void selectFromDropDownByVisibleText(WebElement webE, String strToSelect) throws InterruptedException {
		Select sel = new Select(webE);
		sel.selectByVisibleText(strToSelect);
		Thread.sleep(3000);
	}
	
	/***************************************************************************
	 * Actions class functions
	 ***************************************************************************/

	/*******************************************************
	 * The function is to do a right click on a webelement 
	 * Params: WebElement
	 * Return: void
	 *******************************************************/
	public void doRightClick(WebElement webE) {
		Actions actions = new Actions(driver);
		actions.contextClick(webE).build().perform();
	}

	
	/***************************************************************************
	 * Alert Handling functions
	 ***************************************************************************/
	/********************************************
	 * The function is to accept JS popup 
	 * Params: none 
	 * Return: void
	 ********************************************/
	public void acceptJsPopUp() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		System.out.println("JS pop up handled");
	}

	/********************************************
	 * The function destroys the driver instance 
	 * Params: none 
	 * Returns: void
	 ********************************************/
	public void tearDown() {
		driver.quit();
	}

}
