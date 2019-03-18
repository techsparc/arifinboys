package StepDefinitions;

import PageFactory.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_ToolsQA {
	@Given("^I want to open website toolsqa$")
	public void i_want_to_open_website_toolsqa() throws Throwable {
	    PageFactory.openbrowser("https://www.toolsqa.com/automation-practice-form/");
	}

	@When("^I want to send firstname$")
	public void i_want_to_send_firstname() throws Throwable {
	    
	}

	@When("^I want to send lastname$")
	public void i_want_to_send_lastname() throws Throwable {
	   
	}

	@Then("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	   
	}



}
