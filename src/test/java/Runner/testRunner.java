package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,features="features//tag_demo.Feature",glue={"login"},plugin= {"pretty","html:target/cucumber.html"},tags= {"@SmokeTest","~@RegressionTest"})
public class testRunner {

}
