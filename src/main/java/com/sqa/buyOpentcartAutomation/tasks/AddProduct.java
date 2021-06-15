package com.sqa.buyOpentcartAutomation.tasks;

import static com.sqa.buyOpentcartAutomation.userinterfaces.ProductPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.*;
import net.serenitybdd.screenplay.actions.Click;

public class AddProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_ADD_TO_CART),
                Click.on(BUTTON_CART),
                Click.on(THE_CART_PAGE)
        );
    }
    public static AddProduct inAddProduct(){
        return instrumented(AddProduct.class);
    }
}
