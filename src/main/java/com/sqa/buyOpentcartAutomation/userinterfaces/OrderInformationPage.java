package com.sqa.buyOpentcartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OrderInformationPage {
    public static Target NAME_ORDER_CONFIRM =  Target.the("verify the name user").located(By.xpath("//table[@class = 'table table-bordered table-hover'][2]//tbody//td[1]"));
    public static Target NAME_PRODUCT_CONFIRM =  Target.the("verify the product name").located(By.xpath("//div[@class='table-responsive']//tbody/tr/td[1]"));
}
