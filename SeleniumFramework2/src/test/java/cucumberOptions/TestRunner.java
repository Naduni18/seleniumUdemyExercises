/**
 * 
 */
package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



/**
 * @author Naduni
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
	features="D:/eclipse-workspace/SeleniumFramework2/src/test/java/features",
	glue="StepDefinitions"
)
public class TestRunner {

}

///SeleniumFramework2/src/test/java/features/Login.feature