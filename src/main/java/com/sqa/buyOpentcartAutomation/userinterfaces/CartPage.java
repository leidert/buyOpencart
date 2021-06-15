package com.sqa.buyOpentcartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static Target PRODUCT_NAME =  Target.the("we verify the product in the cart").located(By.xpath("//*[@id='content']//td[2]/a"));
    public static Target BUTTON_CHECKOUT =  Target.the("we verify the product in the cart").located(By.xpath("//a[@class='btn btn-primary']"));
    public static Target BUTTON_CONFIGURATION_RESTRICTION =  Target.the("enter restriction page settings").located(By.id("details-button"));
    public static Target LINK_ACCESS_RESTRICTION =  Target.the("click on the link to exit the restriction").located(By.id("proceed-link"));
}
