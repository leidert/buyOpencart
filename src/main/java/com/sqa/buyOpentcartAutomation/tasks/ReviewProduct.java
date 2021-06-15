package com.sqa.buyOpentcartAutomation.tasks;

import static com.sqa.buyOpentcartAutomation.userinterfaces.SearchResultPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;

public class ReviewProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCT_LINK)
        );
    }
    public static ReviewProduct inTheSearchResult(){
        return instrumented(ReviewProduct.class);
    }
}
