package com.bdd.baufest.mobile.locator;

import org.openqa.selenium.By;

public class MobileLocators {

    public static By BUTTON_LOGIN = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    public static By OPTION_SIGN_UP = By.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup");
    public static By INPUT_SIGN_UP_EMAIL = By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]");
    public static By INPUT_SIGN_UP_PASSWORD = By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]");
    public static By INPUT_SIGN_UP_PASSWORD_CONFIRM = By.xpath("//android.widget.EditText[@content-desc=\"input-repeat-password\"]");
    public static By BUTTON_SIGN_UP = By.xpath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]");
}
