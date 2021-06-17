package com.sqa.buyOpentcartAutomation.stepdefinitions;

import com.sqa.buyOpentcartAutomation.exeptions.ExceptionAnswer;
import com.sqa.buyOpentcartAutomation.questions.CheckExistingProduct;
import com.sqa.buyOpentcartAutomation.userinterfaces.HomeOpencartPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchOpenCartStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor leider = Actor.named("Leider");

    @Before
    public void setUp(){
        leider.can(BrowseTheWeb.with(hisBrowser));
        leider.wasAbleTo(Open.browserOn(new HomeOpencartPage()));
    }

    @Then("^verify that the product does not exist (.*)$")
    public void verifyThatTheProductDoesNotExist(String message) {
        leider.should(seeThat(CheckExistingProduct.inTheResultSearch(message))
                .orComplainWith(ExceptionAnswer.class, ExceptionAnswer.SEARCH_ERROR));
    }
}
