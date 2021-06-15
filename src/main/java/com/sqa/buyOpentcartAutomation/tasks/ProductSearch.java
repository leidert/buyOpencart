package com.sqa.buyOpentcartAutomation.tasks;

import static com.sqa.buyOpentcartAutomation.userinterfaces.HomeOpencartPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductSearch implements Task {
    private String brand;

    public ProductSearch(String brand) {
        this.brand = brand;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(brand).into(INPUT_SEARCH),
                Click.on(BUTTON_SEARCH)
        );
    }
    public static ProductSearch inTheSearch(String brand){
        return instrumented(ProductSearch.class, brand);
    }
}
