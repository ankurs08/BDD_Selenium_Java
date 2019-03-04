package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtils;

public class Iframe {
	private WebDriver driver;
	public WebUtils webUtils = new WebUtils();

	public Iframe() {
		this.driver = WebUtils.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#tinymce")
	WebElement textInFrame;
	
	@FindBy(css="#mce_0_ifr")
	WebElement iframe;
	
	public void writeInFrame() throws InterruptedException {		
		webUtils.switchToFrame(iframe);
		webUtils.setText(textInFrame, "Iframe is active");
			
	}
}
