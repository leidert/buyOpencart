package com.sqa.buyOpentcartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static Target BUTTON_ADD_TO_CART=  Target.the("click in the button add to cart").located(By.xpath("//button[@id= 'button-cart']"));
    public static Target BUTTON_CART=  Target.the("click to go to cart").located(By.xpath("//div[@id= 'cart']/button"));
    public static Target THE_CART_PAGE=  Target.the("go to cart page").located(By.xpath("//p[@class= 'text-right']/a[1]"));
}
