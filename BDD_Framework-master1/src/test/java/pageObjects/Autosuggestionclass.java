package pageObjects;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Autosuggestionclass {
	    public WebDriver driver;

	    public Autosuggestionclass(WebDriver driver) {
	        this.driver = driver;
	      

	    }

	    public void selectAutoSuggestion(By inputFieldLocator, String inputText, By suggestionLocator) {
	        // Find the input field and type the search text

	    	Autosuggestionclass example = new Autosuggestionclass(driver);
example.selectAutoSuggestion(inputFieldLocator, inputText, suggestionLocator);
	  

	        WebElement inputField = driver.findElement(inputFieldLocator);
	        inputField.sendKeys(inputText);

	     
	        // Initialize Actions class
	        Actions actions = new Actions(driver);

	        // Use Actions class to navigate through the suggestions and select one
	        actions.sendKeys(Keys.ARROW_DOWN) // Navigate down to the suggestion list
	                .sendKeys(Keys.ENTER)      // Select the highlighted suggestion
	                .build()
	                .perform();
	    }
	}


