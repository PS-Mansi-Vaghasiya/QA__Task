package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
    features = "C:\\Users\\mansi.vaghasiya\\Downloads\\BDD_Framework-master\\BDD_Framework-master1\\features\\myinfo.feature",
    glue = {"stepDefinitions", "hooks"},
    tags ="@Login",
    monochrome = true,
    plugin = {
        "pretty",
        "html:target/cucumber.html",
        "json:target/cucumber.json",
        "junit:target/cucumber-results.xml",
        "utilities.ExtentReportListener"
    }
)
public class TestngTestRunner extends AbstractTestNGCucumberTests {
}

