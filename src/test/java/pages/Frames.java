package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtils;

public class Frames {
private WebDriver driver;
public WebUtils webUtils = new WebUtils();

public Frames() {
	this.driver = WebUtils.driver;
	PageFactory.initElements(driver, this);
}

@FindBy(css="a[href='/iframe']")
WebElement iFrameLink;

public void clickIFrameLink() {
	webUtils.clickLink(iFrameLink);
}


}
