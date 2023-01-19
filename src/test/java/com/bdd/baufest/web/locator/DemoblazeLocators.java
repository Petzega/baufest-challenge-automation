package com.bdd.baufest.web.locator;

import com.bdd.baufest.utils.PublicVariables;
import org.openqa.selenium.By;

public class DemoblazeLocators {

    public static By OPTION_SIGN_UP = By.xpath("//a[@id='signin2']");
    public static By INPUT_SIGN_UP_USERNAME = By.xpath("//input[@id='sign-username']");
    public static By INPUT_SIGN_UP_PASSWORD = By.xpath("//input[@id='sign-password']");
    public static By BUTTON_SIGN_UP = By.xpath("//button[contains(text(), 'Sign up')]");
    public static By OPTION_LOG_IN = By.xpath("//a[@id='login2']");
    public static By INPUT_LOG_IN_USERNAME = By.xpath("//input[@id='loginusername']");
    public static By INPUT_LOG_IN_PASSWORD = By.xpath("//input[@id='loginpassword']");
    public static By BUTTON_LOG_IN = By.xpath("//button[contains(text(), 'Log in')]");
    public static By LABEL_USER_LOG_IN = By.xpath("//a[@id='nameofuser']");
    public static By OPTION_CATEGORY(String categoriaProducto) {
        return By.xpath(String.format("//a[@id='itemc' and contains(text(), '%s')]", categoriaProducto));
    }
    public static By OPTION_PRODUCT(String producto) {
        return By.xpath(String.format("//a[@class='hrefch' and contains(text(), '%s')]", producto));
    }
    public static By BUTTON_ADD_TO_CART = By.xpath("//a[contains(text(), 'Add to cart')]");
    public static By OPTION_CART = By.xpath("//a[@id='cartur']");
    public static By LABEL_PRODUCT_ADDED(String producto) {
        return By.xpath(String.format("//td[contains(text(), '%s')]", producto));
    }
}
