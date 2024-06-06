package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@all",
        features = {"./src/test/resources/Features/BuyProduct.feature"},
        glue = "StepDefinitions",
        plugin = {"summary", "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunnerTest {
}