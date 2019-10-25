package CuCumber1.Cuc1;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\bhavani.a.baskaran\\eclipse\\HANDSON\\Cuc1\\src\\resource\\java\\F4.feature",
tags="@productTest",
plugin= {"html/target/Reports"})

public class RunnerF4 {
 
}
