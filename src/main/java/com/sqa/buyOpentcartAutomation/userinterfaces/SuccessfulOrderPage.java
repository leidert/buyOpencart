package com.sqa.buyOpentcartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SuccessfulOrderPage {
    public static Target LINK_HISTORY =  Target.the("verify the order").located(By.xpath("//div[@id='content']//a[2]"));
}
