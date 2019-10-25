package CuCumber1.Cuc1;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookF4 {
	@Before
	public void beforeScenario() {
		System.out.println("Before the scenario");
	}
	@After
	public void afterScenario() {
		System.out.println("After the scenario");
	}
	

}
