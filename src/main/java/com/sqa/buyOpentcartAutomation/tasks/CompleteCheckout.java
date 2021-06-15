package com.sqa.buyOpentcartAutomation.tasks;

import com.sqa.buyOpentcartAutomation.models.PurchaseData;
import static com.sqa.buyOpentcartAutomation.userinterfaces.CheckOutPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteCheckout implements Task {

    private PurchaseData purchaseData;

    public CompleteCheckout(PurchaseData purchaseData) {
        this.purchaseData = purchaseData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(purchaseData.getEmailUser()).into(INPUT_EMAIL_CHECKOUT),
                Enter.theValue(purchaseData.getPassword()).into(INPUT_PASSWORD_CHECKOUT),
                Click.on(BUTTON_LOGIN_CHECKOUT),
                Click.on(BUTTON_CONTINUE_BILLING_DETAILS),
                Click.on(BUTTON_CONTINUE_DELIVERY_DETAILS),
                Click.on(BUTTON_CONTINUE_DELIVERY_METHOD),
                Click.on(CHECKBOX_CONDITIONS),
                Click.on(BUTTON_CONTINUE_PAYMENT_METHOD),
                Click.on(BUTTON_CONFIRM_ORDER)
        );

    }
    public  static CompleteCheckout inTheCheckOut(PurchaseData purchaseData){
        return instrumented(CompleteCheckout.class, purchaseData);
    }
}
