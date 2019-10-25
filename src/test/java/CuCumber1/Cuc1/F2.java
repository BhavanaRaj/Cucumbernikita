package CuCumber1.Cuc1;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class F2 {
	int a,b;
	int sum=0;
	int diff=0;
	@Given("^When user inputs two values$")
	public void when_user_inputs_two_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		a=20;
		b=10;
	}

	@When("^add the two input and strore the sum$")
	public void add_the_two_input_and_strore_the_sum() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	    sum=a+b;
	}

	@Then("^display the resultant sum$")
	public void display_the_resultant_sum() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println(sum+":Addition ");
	}

	@When("^find the disfference of two input$")
	public void find_the_disfference_of_two_input() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		diff=a-b;
	}

	@Then("^display the disffernce$")
	public void display_the_disffernce() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println(diff+":Subtraction ");
	}
}
