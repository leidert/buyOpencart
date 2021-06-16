package com.sqa.buyOpentcartAutomation.questions;

import com.sqa.buyOpentcartAutomation.models.PurchaseData;
import static com.sqa.buyOpentcartAutomation.userinterfaces.CartPage.PRODUCT_NAME;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class VerifyProduct implements Question<Boolean> {
    private final PurchaseData purchaseData;

    public VerifyProduct(PurchaseData purchaseData) {
        this.purchaseData = purchaseData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (Text.of(PRODUCT_NAME).viewedBy(actor).asString().equals(purchaseData.getBrand()))
            return true;
        else
            return false;
    }
    public static VerifyProduct inTheCartPage(PurchaseData purchaseData){
        return new VerifyProduct(purchaseData);
    }
}
