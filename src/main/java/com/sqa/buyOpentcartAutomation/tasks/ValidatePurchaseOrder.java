package com.sqa.buyOpentcartAutomation.tasks;

import com.sqa.buyOpentcartAutomation.userinterfaces.PurchaseHistoryPage;
import com.sqa.buyOpentcartAutomation.userinterfaces.SuccessfulOrderPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ValidatePurchaseOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SuccessfulOrderPage.LINK_HISTORY),
                Click.on(PurchaseHistoryPage.SEE_ORDER)
        );
    }
    public static ValidatePurchaseOrder inValidateOrder(){
        return Tasks.instrumented(ValidatePurchaseOrder.class);
    }
}
