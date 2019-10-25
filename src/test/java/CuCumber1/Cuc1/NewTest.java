//StepDefinationClass F1

package CuCumber1.Cuc1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTest {
	int a;
	int b;
	int sum=0;
	@Given("^Intialise two input values$")
	public void intialise_two_input_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException()
		a=10;
		b=20;
	}

	@When("^perform addition and save to variable$")
	public void perform_addition_and_save_to_variable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 sum=a+b;
	}

	@Then("^display the sum in console$")
	public void display_the_sum_in_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("The sum of two numbers is"+sum);
		Assert.assertEquals(30, sum);
	}
}
