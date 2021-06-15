package com.sqa.buyOpentcartAutomation.questions;

import com.sqa.buyOpentcartAutomation.models.PurchaseData;
import static com.sqa.buyOpentcartAutomation.userinterfaces.OrderInformationPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyOrder implements Question<Boolean> {

    PurchaseData purchaseData;

    public VerifyOrder(PurchaseData purchaseData) {
        this.purchaseData = purchaseData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String userName = purchaseData.getFirstNameUser()+" "+purchaseData.getLastNameUser();

        if (Text.of(NAME_ORDER_CONFIRM).viewedBy(actor).asString().substring(0,12).equals(userName) &&
                Text.of(NAME_PRODUCT_CONFIRM).viewedBy(actor).asString().equals(purchaseData.getBrand()))
            return true;
        else
            return false;
    }

    public static VerifyOrder inTheOrder(PurchaseData purchaseData){
        return new VerifyOrder(purchaseData);
    }
}
