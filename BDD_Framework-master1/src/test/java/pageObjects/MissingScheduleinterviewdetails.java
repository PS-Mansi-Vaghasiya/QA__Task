package pageObjects;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.google.common.io.Resources;

import io.cucumber.core.resource.Resource;
import utilities.SeleniumMethods;

public class MissingScheduleinterviewdetails extends SeleniumMethods {

	public MissingScheduleinterviewdetails(WebDriver driver) {
		super(driver);
	}

	public WebDriver driver;
	Resources Resourceclass;

	// Define your locators here private By recruitmentModuleButton =
	private By recruitmentModuleButton = By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']");
	private By addButton = By.xpath("(//button[@type='button'])[4]");
	private By firstname = By.xpath("//input[@name='firstName']");
	private By lastname = By.xpath("//input[@name='lastName']");
	private By vacancy = By.xpath("//div[@class='oxd-select-text-input']");
	private By clickonoptions = By.xpath(
			"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div[2]/div[2]/span");
	private By email = By.xpath("//div[3]//div[1]//div[1]//div[1]//div[2]//input[1]");
	private By contactnumber = By.xpath("(//input[@placeholder='Type here'])[2]");

	private By browseButtonLocator = By.xpath("//div[@class='oxd-file-button']");
	private By keywordstextbox = By.xpath("//input[@placeholder='Enter comma seperated words...']");
	private By Dateofapplication = By.xpath("//i[@class='oxd-icon bi-calendar oxd-date-input-icon']");
	private By selectdate = By.xpath("//div[@class=\"oxd-calendar-date --selected --today\"]");
	private By notes = By.xpath("//textarea[@placeholder='Type here']");
	private By saveButton = By.xpath("//*[@class='oxd-form-actions']/button[2]");
	private By shortlistbutton = By.xpath("(//button[@type='button'])[4]");

	private By scheduleinterviewbutton = By.xpath("//*[@class='oxd-layout-context']/div/form/div[2]/div[2]/button[2]");
	private By interviewtitle = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");
	private By interviewer = By.xpath("//input[@include-employees='onlyCurrent']");
	private By interviewername = By.xpath("//span[normalize-space(text()) = 'Odis Adalwin']");
	private By datebutton = By
			.xpath("(//*[@class='oxd-grid-item oxd-grid-item--gutters --offset-row-2'])[5]/div/div/div/div/input");

	private By timebutton = By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]");
	private By selecttime = By.xpath("//input[@value='PM']");
	  public By errorMessage =  By.xpath("(//span[normalize-space(text() = 'Required')])[15]");

	public void clickOnRecruitmentModule1() {
		clickOn(recruitmentModuleButton);
	}

	public void clickOnAddButton1() {
		clickOn(addButton);
	}

	public void entercandidatedetails() throws InterruptedException, IOException {

		sendKeys(this.firstname, "Mansi");
		sendKeys(this.lastname, "Vaghasiya"); //

		Thread.sleep(3000);
		clickOn(vacancy);
		Thread.sleep(3000);
		clickOn(clickonoptions);
		sendKeys(this.email, "abc@gmail.com");
		sendKeys(this.contactnumber, " 7462738811"); // Handle file upload for resume
		Thread.sleep(3000);

		sendKeys(this.keywordstextbox, "xyws"); // Handle date selection
		clickOn(Dateofapplication);

		clickOn(selectdate);
		sendKeys(this.notes, "NA");
		clickOn(saveButton);
	}

	public void clickOnShortlistButton1() throws InterruptedException {
		Thread.sleep(3000);
		clickOn(shortlistbutton);
		clickOn(saveButton);
	}

	public void clickOnScheduleInterviewButton() throws InterruptedException {
		Thread.sleep(2000);
		clickOn(scheduleinterviewbutton);
	}

	/*
	 * public void enterInterviewTitle(String title) { sendKeys(interviewtitle,
	 * "intern interview"); }
	 * 
	 * public void enterInterviewer(String interviewerName) {
	 * 
	 * 
	 * clickOn(interviewer); sendKeys(interviewer, "a"); clickOn(interviewername);
	 * 
	 * }
	 */

	public void selectInterviewDate() throws InterruptedException {
		Thread.sleep(3000);
		clickOn(datebutton);
		sendKeys(datebutton, "2024-29-02");

	}

	public void selectInterviewTime() throws InterruptedException {
		Thread.sleep(3000);
		clickOn(timebutton);
		clickOn(selecttime);
	}

	public void clickonsavebutton() {
		clickOn(saveButton);
	}
}
