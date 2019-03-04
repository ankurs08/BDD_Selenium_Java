package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasicAuth;
import pages.Checkboxes;
import pages.ContextMenu;
import pages.Dropdown;
import pages.ForgotPwd;
import pages.Frames;
import pages.Iframe;
import pages.WelcomeToInternet;

public class PracticeSeleniumSteps{
	WelcomeToInternet welcomePage = new WelcomeToInternet();
	BasicAuth basicAuth = new BasicAuth();
	Checkboxes check = new Checkboxes();
	Dropdown drop = new Dropdown();
	ContextMenu context = new ContextMenu();
	ForgotPwd frgtPwd = new ForgotPwd();
	Frames frames = new Frames();
	Iframe iframe = new Iframe();
	
	@When("^I login with valid credentials$")
	public void i_login_with_valid_credentials() throws Throwable {
		// Using the credentials in the URL
		//welcomePage.loginParams();
		welcomePage.test();
		Thread.sleep(10000);
	}
	
	@Then("^I write something in the iFrame$")
	public void i_write_thing_iFrame() throws Throwable {
		iframe.writeInFrame();
	}
	

	@Then("^I should see the correct message on page$")
	public void i_should_see_correct_message_on_page() throws Throwable {
		basicAuth.verifyLoginMessage();
	}

	@When("^I navigate to the checkbox page$")
	public void i_navigate_checkbox_page() throws Throwable {
		welcomePage.clickCheckboxesLink();
	}

	@Then("^I should check both the checkboxes$")
	public void i_should_check_both_checkboxes() throws Throwable {
		check.checkAndClick();
	}
	
	@When("^I navigate to the dropdown page$")
	public void i_navigate_dropdown_page() throws Throwable {
		welcomePage.clickDropdownLink();
	}
	
	@When("^I navigate to the frames page$")
	public void i_navigate_frames_page() throws Throwable {
		welcomePage.clickFramesLink();
	}
	
	@When("^I navigate to the iFrame page$")
	public void i_navigate_iframe_page() throws Throwable {
		frames.clickIFrameLink();
	}

	@Then("^I should select Option1 from the dropdown list$")
	public void i_should_select_option_from_dropdown() throws Throwable {
		drop.selectOption();
	}
	
	@Then("^I navigate to the context menu page$")
	public void i_navigate_to_context_menu_page() throws Throwable {
		welcomePage.clickContextLink();
	}
	
	@When("^I should right click and select option$")
	public void i_right_click_select_option() throws Throwable {
		context.rightClickContext();
	}

	@Then("^I should see a javascript pop messsage$")
	public void i_should_see_js_popup() throws Throwable {
		context.handleJSPopup();
	}
	
	@When("^I navigate to the forgot password page$")
	public void i_navigate_to_forgot_password_page() throws Throwable {
		welcomePage.clickForgotPwdLink();
	}

	@Then("^I send email from the xml$")
	public void i_send_email_from_xml() throws Throwable {
		frgtPwd.fillEmailXml();
	}
	
	@Then("^I send email from the json$")
	public void i_send_email_from_json() throws Throwable {
		frgtPwd.fillEmailJson();
	}
	
	@Then("^I send email from the xls$")
	public void i_send_email_from_xls() throws Throwable {
		frgtPwd.fillEmailXls();
	}
	
	
}
