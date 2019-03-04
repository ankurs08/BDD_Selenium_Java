package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import utils.WebUtils;

public class BasicAuth {
	private WebDriver driver;

	public BasicAuth() {
		this.driver = WebUtils.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".example>p")
	WebElement basicAuthMessage;
	
	public void verifyLoginMessage() {
		Assert.assertEquals("Congratulations! You must have the proper credentials.", 
				basicAuthMessage.getText());
		
	}
	
}
