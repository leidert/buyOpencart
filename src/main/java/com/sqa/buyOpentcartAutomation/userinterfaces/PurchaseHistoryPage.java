package com.sqa.buyOpentcartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PurchaseHistoryPage {
    public static Target SEE_ORDER =  Target.the("verify the order").located(By.xpath("//tbody/tr[1]//a"));
}
