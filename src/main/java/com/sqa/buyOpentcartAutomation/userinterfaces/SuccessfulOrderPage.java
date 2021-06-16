package com.sqa.buyOpentcartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SuccessfulOrderPage {
    public static Target ORDER_SUCCESSFUL =  Target.the("verify the order").located(By.xpath("//h1[contains(text(),'Your order has been placed!')]"));
}
