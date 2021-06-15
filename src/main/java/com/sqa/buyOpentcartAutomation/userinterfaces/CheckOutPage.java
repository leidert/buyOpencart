package com.sqa.buyOpentcartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckOutPage {
    public static Target INPUT_EMAIL_CHECKOUT =  Target.the("enter the email to login").located(By.id("input-email"));
    public static Target INPUT_PASSWORD_CHECKOUT =  Target.the("enter the password to login").located(By.id("input-password"));
    public static Target BUTTON_LOGIN_CHECKOUT =  Target.the("click on the button to login").located(By.id("button-login"));
    public static Target BUTTON_CONTINUE_BILLING_DETAILS  =  Target.the("click continue to Billing Details").located(By.id("button-payment-address"));
    public static Target BUTTON_CONTINUE_DELIVERY_DETAILS  =  Target.the("click continue to Delivery Details").located(By.id("button-shipping-address"));
    public static Target BUTTON_CONTINUE_DELIVERY_METHOD  =  Target.the("click continue to Delivery Method ").located(By.id("button-shipping-method"));
    public static Target CHECKBOX_CONDITIONS  =  Target.the("click in the checkbox conditions").located(By.xpath("//input[@name = 'agree']"));
    public static Target BUTTON_CONTINUE_PAYMENT_METHOD  =  Target.the("click continue to Payment Method").located(By.id("button-payment-method"));
    public static Target BUTTON_CONFIRM_ORDER  =  Target.the("click continue to Confirm Order ").located(By.id("button-confirm"));
}
