package com.sqa.buyOpentcartAutomation.stepdefinitions;

import com.sqa.buyOpentcartAutomation.exeptions.ExceptionAnswer;
import com.sqa.buyOpentcartAutomation.models.PurchaseData;
import com.sqa.buyOpentcartAutomation.questions.VerifyOrder;
import com.sqa.buyOpentcartAutomation.questions.VerifyProduct;
import com.sqa.buyOpentcartAutomation.tasks.*;
import com.sqa.buyOpentcartAutomation.userinterfaces.HomeOpencartPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BuyOpenCartEstepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor leider = Actor.named("Leider");

    @Before
    public void setUp(){
        leider.can(BrowseTheWeb.with(hisBrowser));
        leider.wasAbleTo(Open.browserOn(new HomeOpencartPage()));
    }

    @Given("^that enter of the opencart page it made the search for a computer (.*)$")
    public void thatEnterOfTheOpencartPageItMadeTheSearchForAComputerDell(String brand) {
        leider.attemptsTo(ProductSearch.inTheApp(brand));
    }

    @And("^enter the product$")
    public void enterTheProduct() {
    leider.attemptsTo(ReviewProduct.inTheSearchResult());
    }

    @When("^added it to cart$")
    public void addedItToCart() {
        leider.attemptsTo(AddProduct.inTheCart());
    }

    @And("^verifying that it is the chosen computer$")
    public void verifyingThatItIsTheChosenComputer(List<PurchaseData> purchaseData) {
        leider.should(seeThat(VerifyProduct.inTheCartPage(purchaseData.get(0))));
    }

    @And("^that heading to checkout$")
    public void thatHeadingToCheckout() {
        leider.attemptsTo(GoToCheckOut.inTheCartPage());
    }

    @And("^proceed with the payment$")
    public void proceedWithThePayment(List<PurchaseData> purchaseData){
        leider.attemptsTo(CompleteCheckout.inTheCheckOut(purchaseData.get(0)));
    }

    @Then("^verifying that the purchase order is confirmed$")
    public void verifyingThatThePurchaseOrderIsConfirmed(List<PurchaseData> purchaseData) {
        leider.should(seeThat(VerifyOrder.inTheOrder(purchaseData.get(0)))
                .orComplainWith(ExceptionAnswer.class, ExceptionAnswer.ORDER_ERROR));
    }
}
