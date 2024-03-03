
package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Autosuggestionclass;

import pageObjects.RejectPageObjects;
import utilities.BaseClass;

public class RejectStepDefinitions {
	WebDriver driver;
	Properties prop;
	Logger logger;
	RejectPageObjects rejectPageObjects;

	public RejectStepDefinitions() {
		this.driver = BaseClass.getDriver();

		this.logger = BaseClass.getLogger();
		this.prop = BaseClass.getProperties();

	}

	@Given("I am on Dashboard pagee")
	public void i_am_on_dashboard_pagee() {
		rejectPageObjects = new RejectPageObjects(driver);
	}

	@When("I click on Recruitment module and clicking on add buttonn")
	public void i_click_on_recruitment_module_and_clicking_on_add_buttonn() {
		rejectPageObjects.clickOnRecruitmentModule1();
		rejectPageObjects.clickOnAddButton1();
	}

	@When("I enter valid candidate details and click on save buttonn")
	public void i_enter_valid_candidate_details_and_click_on_save_buttonn() throws InterruptedException, IOException {
		rejectPageObjects.entercandidatedetails();
	}

	@When("I click on Shortlist button and save buttonn to schedule interview")
	public void i_click_on_shortlist_button_and_save_buttonn_to_schedule_interview() throws InterruptedException {
		rejectPageObjects.clickOnShortlistButton1();
		rejectPageObjects.clickOnScheduleInterviewButton();
	}

@When("I enter valid schedule interview details,click on save button,click on mark interview detials passed option,click on save buttonn")
public void i_enter_valid_schedule_interview_details_click_on_save_button_click_on_mark_interview_detials_passed_option_click_on_save_buttonn() throws InterruptedException {
	  rejectPageObjects.enterInterviewTitle("intern interview");
	  rejectPageObjects.enterInterviewer("O");
	 
	  rejectPageObjects.selectInterviewDate();
	  rejectPageObjects.selectInterviewTime();
	  rejectPageObjects.clickonsavebutton(); Thread.sleep(3000);
	  rejectPageObjects.clickOnMarkInterviewPassed();
}

	@When("click on offer job button , save button , click on Reject buttonn")
	public void click_on_offer_job_button_save_button_click_on_reject_buttonn() throws InterruptedException {
		rejectPageObjects.clickonsavebutton();
		Thread.sleep(2000);
		rejectPageObjects.clickOnOfferJobButton();
		rejectPageObjects.clickonsavebutton();
		Thread.sleep(2000);
		rejectPageObjects.rejectbutton();
	}
	
	
	
	  
	@Given("I am on the Candidate Addition page within the recruitment section")
	public void i_am_on_the_candidate_addition_page_within_the_recruitment_section() {
		rejectPageObjects = new RejectPageObjects(driver);
	}

    	
    

	@When("I input an invalid email format and an incorrect phone number format")
	public void i_input_an_invalid_email_format_and_an_incorrect_phone_number_format() {
    	rejectPageObjects.clickOnRecruitmentModule1();
    	rejectPageObjects.clickOnAddButton1();
        
        rejectPageObjects.emailinvalid();
        rejectPageObjects.contactnumberinvalid();
        
    }

	@And("I fill out the remaining required fields with appropriate data")
	public void i_fill_out_the_remaining_required_fields_with_appropriate_data() {
    }


@And("I submit the candidate information")
public void i_submit_the_candidate_information() {
      rejectPageObjects.clickonsavebutton();
    }


@Then("I should receive error messages regarding the email and phone number format")
public void i_should_receive_error_messages_regarding_the_email_and_phone_number_format() {
    	    String actualErrorMessage = rejectPageObjects.getText(rejectPageObjects.errorMessage);
    	    assertEquals("Expected format: admin@example.com", actualErrorMessage);
    	  
    	}



}
