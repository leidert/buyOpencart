package com.sqa.buyOpentcartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchResultPage {
    public static Target PRODUCT_LINK =  Target.the("click in the product link").located(By.xpath("//div[@class= 'caption']//a"));
    public static Target NULL_RESULT =  Target.the("click in the product link").located(By.xpath("//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]"));

}
