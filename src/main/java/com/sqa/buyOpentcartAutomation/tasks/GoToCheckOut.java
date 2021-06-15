package com.sqa.buyOpentcartAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.sqa.buyOpentcartAutomation.userinterfaces.CartPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;

public class GoToCheckOut implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CHECKOUT),
                Click.on(BUTTON_CONFIGURATION_RESTRICTION),
                Click.on(LINK_ACCESS_RESTRICTION)
        );
    }

    public static GoToCheckOut inTheCartPage() {
        return instrumented(GoToCheckOut.class);
    }
}
