package com.sqa.buyOpentcartAutomation.questions;

import static com.sqa.buyOpentcartAutomation.userinterfaces.SearchResultPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CheckExistingProduct implements Question<Boolean> {

    private String message;

    public CheckExistingProduct(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(NULL_RESULT).viewedBy(actor).asString().equals(message);
    }
    public static CheckExistingProduct inTheResultSearch(String message){
        return new CheckExistingProduct(message);
    }
}
