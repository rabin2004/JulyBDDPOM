package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// 1. running cucumber classes -> @RunWith
@RunWith(Cucumber.class)
// 2. using multiple cucumber options -> @CucumberOptions
@CucumberOptions(	features = "C:\\Users\\User\\eclipse-workspace\\JulyBDDPOM\\src\\test\\java\\features",
					glue = "step_definition",
					monochrome = true,
					plugin = {"pretty","html:target/htmlReport","json:target/jsonReport" })

public class Runner {

}
