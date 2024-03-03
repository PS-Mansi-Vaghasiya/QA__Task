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
import pageObjects.MissingScheduleinterviewdetails;
import pageObjects.RejectPageObjects;
import utilities.BaseClass;
public class MissingScheduleinterviewdetailsstepdef {
	WebDriver driver;
	Properties prop;
	Logger logger;
	MissingScheduleinterviewdetails scheduleinterviewPageObjects;

	public MissingScheduleinterviewdetailsstepdef() {
		this.driver = BaseClass.getDriver();

		this.logger = BaseClass.getLogger();
		this.prop = BaseClass.getProperties();
	}


@Given("I am on the Dashboard page")
public void i_am_on_the_Dashboard_page() {
	scheduleinterviewPageObjects = new MissingScheduleinterviewdetails(driver);
}

@When("I navigate to the Recruitment module and begin adding a candidate")
public void i_navigate_to_the_Recruitment_module_and_begin_adding_a_candidate() {
	scheduleinterviewPageObjects.clickOnRecruitmentModule1();
	scheduleinterviewPageObjects.clickOnAddButton1();
}

@When("I submit valid candidate details and save it")
public void i_submit_valid_candidate_details_and_save_it() throws InterruptedException, IOException {
	scheduleinterviewPageObjects.entercandidatedetails();

}

@When("I shortlist the candidate and schedule an interview")
public void i_shortlist_the_candidate_and_schedule_an_interview() throws InterruptedException {
	scheduleinterviewPageObjects.clickOnShortlistButton1();
	scheduleinterviewPageObjects.clickOnScheduleInterviewButton();
}

@And("interview title and interviewer name is kept empty and fill remaining details")
public void interview_title_and_interviewer_name_is_kept_empty_and_fill_remaining_details() throws InterruptedException {
	scheduleinterviewPageObjects.selectInterviewDate();
	scheduleinterviewPageObjects.selectInterviewTime();
	scheduleinterviewPageObjects.clickonsavebutton(); Thread.sleep(3000);
	
   
}

@Then("I should receive error messages regarding interview title and interviewer name")
public void i_should_receive_error_messages_regarding_interview_title_and_interviewer_name() {
	 String actualErrorMessage = scheduleinterviewPageObjects.getText(scheduleinterviewPageObjects.errorMessage);
	    assertEquals("Required", actualErrorMessage);
}


	}

