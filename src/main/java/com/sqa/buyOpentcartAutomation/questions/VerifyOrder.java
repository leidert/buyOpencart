package com.sqa.buyOpentcartAutomation.questions;

import com.sqa.buyOpentcartAutomation.models.PurchaseData;
import com.sqa.buyOpentcartAutomation.userinterfaces.SuccessfulOrderPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.Assert;

public class VerifyOrder implements Question<Boolean> {

    PurchaseData purchaseData;

    public VerifyOrder(PurchaseData purchaseData) {
        this.purchaseData = purchaseData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return Text.of(SuccessfulOrderPage.ORDER_SUCCESSFUL).viewedBy(actor).asString()
                .equals(purchaseData.getOrderSuccessful());
    }

    public static VerifyOrder inTheOrder(PurchaseData purchaseData){
        return new VerifyOrder(purchaseData);
    }
}
