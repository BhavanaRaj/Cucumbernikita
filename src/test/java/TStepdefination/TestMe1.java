package TStepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMe1 {
	WebDriver driver;
	@Given("^User has launced TestMeApp in browser$")
	public void user_has_launced_TestMeApp_in_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A08019DIRP_C2C.02.02\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
	}

	@When("^User enters valid credentials and does the login$")
	public void user_enters_valid_credentials_and_does_the_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^ensure if user has landed in the home page$")
	public void ensure_if_user_has_landed_in_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

}
