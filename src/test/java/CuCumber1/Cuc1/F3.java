package CuCumber1.Cuc1;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class F3 {
	@Given("^user logs into amazon$")
	public void user_logs_into_amazon() throws Throwable {
	}

	@When("^user searches for the below products$")
	public void user_searches_for_the_below_products(DataTable arg1) throws Throwable {
		List<String>list=arg1.asList(String.class);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	@Then("^user purchase the selected product$")
	public void user_purchase_the_selected_product() throws Throwable {
		System.out.println("user has made the payment");
	}
}
