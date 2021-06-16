package com.sqa.buyOpentcartAutomation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        tags = "@General",
        glue = "com.sqa.buyOpentcartAutomation.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class OpenCartRunner {
}
