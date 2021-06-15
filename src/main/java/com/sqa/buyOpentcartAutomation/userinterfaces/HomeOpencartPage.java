package com.sqa.buyOpentcartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://opencart.abstracta.us/index.php")
public class HomeOpencartPage extends PageObject {
    public static Target INPUT_SEARCH =  Target.the("enter the word to search").located(By.xpath("//input[@class = 'form-control input-lg']"));
    public static Target BUTTON_SEARCH =  Target.the("click in the button search").located(By.xpath("//button[@class = 'btn btn-default btn-lg']"));
}
