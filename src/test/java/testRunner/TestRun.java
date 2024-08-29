package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Feature/regestration.feature"},
		glue="stepDefenations",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty","html:test-cucumber"}
		//tags = "@WomenVeg or @MenNon-Veg"
		)

public class TestRun {
}
