package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/features",
//        glue = {"steps","hooks"},
//        tags = "@success_login"
//)
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "ssrc/test/resources/features/products.feature",
        glue = {"steps","hooks"},
        tags = "@user_can_add_product"
)
public class RunnerLoginTest {
}
