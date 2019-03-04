package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.WebUtils;

public class ContextMenu {
	private WebDriver driver;
	public WebUtils webUtils = new WebUtils();

	public ContextMenu() {
		this.driver = WebUtils.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#hot-spot")
	WebElement contextBox;
	
	public void rightClickContext() {
		webUtils.doRightClick(contextBox);
//		Actions actions = new Actions(driver);
//		actions.contextClick(contextBox).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	public void handleJSPopup() {
		webUtils.acceptJsPopUp();
		//explicit wait
		
	}
}
