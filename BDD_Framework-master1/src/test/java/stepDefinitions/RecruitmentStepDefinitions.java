package stepDefinitions;

import org.openqa.selenium.WebDriver;
import utilities.SeleniumMethods;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import  org.testng.Assert;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;
import pageObjects.RecruitmentPageObjects;
import utilities.BaseClass;

public class RecruitmentStepDefinitions {
	WebDriver driver;
	 Properties prop; 
	 Logger logger; 
     RecruitmentPageObjects recruitmentPageObjects;

    public RecruitmentStepDefinitions() {
        this.driver = BaseClass.getDriver();
		
		  this.logger = BaseClass.getLogger(); this.prop=BaseClass.getProperties();
		 
    }

    
    @Given("I am on Dashboard page")
    public void i_am_on_dashboard_page() {
    	recruitmentPageObjects = new RecruitmentPageObjects(driver);
    	}

    @When("I click on Recruitment module and clicking on add button")
    public void i_click_on_recruitment_module_and_clicking_on_add_button() {
        recruitmentPageObjects.clickOnRecruitmentModule1();
        recruitmentPageObjects.clickOnAddButton1();
    }

    @When("I enter valid candidate details and click on save button")
    public void i_enter_valid_candidate_details_and_click_on_save_button() throws InterruptedException, IOException {
        recruitmentPageObjects.entercandidatedetails();
    }

    @When("I click on Shortlist button and save button to schedule interview")
    public void i_click_on_shortlist_button_and_save_button_to_schedule_interview() throws InterruptedException {
        recruitmentPageObjects.clickOnShortlistButton1();
        recruitmentPageObjects.clickOnScheduleInterviewButton();
    }

    @When("I enter valid schedule interview details,click on save button,click on mark interview detials passed option,click on save button")
    public void i_enter_valid_schedule_interview_details_click_on_save_button_click_on_mark_interview_detials_passed_option_click_on_save_button() throws InterruptedException {
    		
    	 recruitmentPageObjects.enterInterviewTitle("intern interview");
         recruitmentPageObjects.enterInterviewer("Odis Adalwin");
         recruitmentPageObjects.selectInterviewDate();
         recruitmentPageObjects.selectInterviewTime();
         recruitmentPageObjects.clickonsavebutton();
         Thread.sleep(3000);
         recruitmentPageObjects.clickOnMarkInterviewPassed();
    }

    @When("click on offer job button , save button ,click on hire button and then click on save button")
    public void click_on_offer_job_button_save_button_click_on_hire_button_and_then_click_on_save_button() throws InterruptedException {

    	 recruitmentPageObjects.clickonsavebutton();
    	 Thread.sleep(2000);
    	recruitmentPageObjects.clickOnOfferJobButton();
        recruitmentPageObjects.clickonsavebutton();
        Thread.sleep(2000);
       
        recruitmentPageObjects.clickOnHireButton();
        recruitmentPageObjects.clickonsavebutton();
    }
    
	
	  
	  @Given("I am on the Add Candidate page in the recruitment module") public
	  void i_am_on_the_add_candidate_page_in_the_recruitment_module() {
	  recruitmentPageObjects = new RecruitmentPageObjects(driver);
	  
	  }
	  
	  @When("I fill in the Email with john.doe and contact number with cjsdnwdknda"
	  ) public void
	  i_fill_in_the_email_with_john_doe_and_contact_number_with_cjsdnwdknda()
	  throws InterruptedException, IOException {
	  recruitmentPageObjects.clickOnRecruitmentModule1();
	  recruitmentPageObjects.clickOnAddButton1();
	  
	  recruitmentPageObjects.emailinvalid();
	  recruitmentPageObjects.contactnumberinvalid();
	  
	  }
	  
	  @When("I fill in the other required fields with valid data") public void
	  i_fill_in_the_other_required_fields_with_valid_data() throws
	  InterruptedException, IOException {
	  
	  }
	  
	  @When("I click the Save button") public void i_click_the_save_button() {
	  recruitmentPageObjects.clickonsavebutton(); }
	  
	  @Then("I should see an error message stating Expected format: admin@example.com in email field and Allows numbers and only + - \\/ \\( ) in contact number"
	  ) public void errorMessageShouldAppear() {
	  
	  String actualErrorMessage =
	  recruitmentPageObjects.getText(recruitmentPageObjects.errorMessage);
	  assertEquals("Expected format: admin@example.com", actualErrorMessage);
	  
	  }
	 



     }
    		  
    		  
    
