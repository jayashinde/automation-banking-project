package org.example.Testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"}
        ,glue = {"org/example/pageDefinitions"}
        ,tags = " @SC01"

)
public class TestRunner {
}
