package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtils;

public class WelcomeToInternet {
	private WebDriver driver;
	public WebUtils webUtils = new WebUtils();

	public WelcomeToInternet() {
		this.driver = WebUtils.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[href='/abtest']")
	WebElement abTestingLink;

	@FindBy(css = "a[href='/basic_auth']")
	WebElement basicAuthLink;

	@FindBy(css = "a[href='/broken_images']")
	WebElement brokenImageLink;

	@FindBy(css = "a[href='/challenging_dom']")
	WebElement challengingDomLink;

	@FindBy(css = ".example>h3")
	WebElement abTestText;

	@FindBy(css = "a[href='/checkboxes']")
	WebElement checkboxesLink;

	@FindBy(css = "a[href='/dropdown']")
	WebElement dropdownLink;

	@FindBy(css = "a[href='/context_menu']")
	WebElement contextLink;

	@FindBy(css = "a[href='/forgot_password']")
	WebElement forgotPwdLink;

	@FindBy(css = "a[href='/frames']")
	WebElement framesLink;

	@FindBy(xpath = "//input[@id='Vnd_Id']")
	WebElement test;

	public void clickOnBasicAuth() {
		webUtils.clickLink(basicAuthLink);
	}

	public void clickOnabTestingLink() {
		webUtils.clickLink(abTestingLink);
	}

	public void clickCheckboxesLink() {
		webUtils.clickLink(checkboxesLink);
	}

	public void clickDropdownLink() {
		webUtils.clickLink(dropdownLink);
	}

	public void clickContextLink() {
		webUtils.clickLink(contextLink);
	}

	public void clickForgotPwdLink() {
		webUtils.clickLink(forgotPwdLink);
	}

	public void clickFramesLink() {
		webUtils.clickLink(framesLink);
	}

	public void getAbTestingText() {
		System.out.println(webUtils.getText(abTestText));
	}

	public void launchURL() {
		webUtils.launchURL("https://the-internet.herokuapp.com");
	}

	public void test() {
		webUtils.setText(test, "Ankur");
	}

	public void loginParams() {
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
	}

}
