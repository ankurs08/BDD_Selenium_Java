package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.WebUtils;

public class Dropdown {
	private WebDriver driver;
	public WebUtils webUtils = new WebUtils();

	public Dropdown() {
		this.driver = WebUtils.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#dropdown")
	WebElement dropdown;
	
	public void selectOption() throws InterruptedException {
		webUtils.selectFromDropDownByVisibleText(dropdown, "Option 1" );		
	}

}
