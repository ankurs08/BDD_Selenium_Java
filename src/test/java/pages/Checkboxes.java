package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtils;

public class Checkboxes {
	private WebDriver driver;
	WebUtils webUtils = new WebUtils();
			

	public Checkboxes() {
		this.driver = WebUtils.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBys(@FindBy(css = "#checkboxes>input"))
	List<WebElement> listCheckBoxes;
	
	public void checkAndClick() throws InterruptedException {
		webUtils.clickCheckBox(listCheckBoxes);
	}
	
}
