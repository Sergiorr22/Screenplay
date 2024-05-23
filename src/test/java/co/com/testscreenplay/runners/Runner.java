package co.com.testscreenplay.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co/com/testscreenplay/stepdefinitions",
        tags = "@loginerror",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
