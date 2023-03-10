package com.bdd.baufest.mobile.locator;

import org.openqa.selenium.By;

public class MobileLocators {

    public static By NAV_OPTION_LOGIN = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    public static By OPTION_SIGN_UP = By.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup");
    public static By INPUT_SIGN_UP_EMAIL = By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]");
    public static By INPUT_SIGN_UP_PASSWORD = By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]");
    public static By INPUT_SIGN_UP_PASSWORD_CONFIRM = By.xpath("//android.widget.EditText[@content-desc=\"input-repeat-password\"]");
    public static By BUTTON_SIGN_UP = By.xpath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]");
    public static By LABEL_SIGNED_UP = By.xpath("//android.widget.TextView[@resource-id='android:id/alertTitle']");
    public static By BUTTON_SIGNED_UP = By.id("android:id/button1");
    public static By OPTION_LOGIN = By.xpath("//android.view.ViewGroup[@content-desc=\"button-login-container\"]/android.view.ViewGroup/android.widget.TextView");
    public static By INPUT_LOGIN_EMAIL = By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]");
    public static By INPUT_LOGIN_PASSWORD = By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]");
    public static By BUTTON_LOGIN = By.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]");
    public static By LABEL_LOGGED_IN = By.xpath("//android.widget.TextView[@resource-id='android:id/alertTitle']");
    public static By BUTTON_LOGGED_IN = By.id("android:id/button1");
    public static By NAV_OPTION_FORMS = By.xpath("//android.widget.Button[@content-desc=\"Forms\"]");
    public static By INPUT_TYPE_SOMETHING = By.xpath("//android.widget.EditText[@content-desc=\"text-input\"]");
    public static By TEXTVIEW_TYPED = By.xpath("//android.widget.TextView[@content-desc=\"input-text-result\"]");
    public static By SWITCH = By.xpath("//android.widget.Switch[@content-desc=\"switch\"]");
    public static By SWITCH_STATUS = By.xpath("//android.widget.TextView[@content-desc=\"switch-text\"]");
    public static By DROPDOWN = By.xpath("//android.view.ViewGroup[@content-desc=\"Dropdown\"]/android.view.ViewGroup/android.widget.EditText");
    public static By DROPDOWN_ELEMENT(String element) {
        return By.xpath(String.format("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='%s']", element));
    }
    public static By BUTTON_ACTIVE = By.xpath("//android.view.ViewGroup[@content-desc=\"button-Active\"]");
    public static By BUTTON_STATUS = By.id("android:id/message");
    public static By BUTTON_ACTIVATED = By.id("android:id/button1");
    public static By NAV_OPTION_WEBVIEW = By.xpath("//android.widget.Button[@content-desc=\"Webview\"]");
    public static By WEBVIEW = By.xpath("//android.webkit.WebView");
    public static By BUTTON_SEARCH = By.xpath("//button[@class='DocSearch DocSearch-Button']");
    public static By INPUT_SEARCH = By.xpath("//input[@id='docsearch-input']");
    public static By BUTTON_CANCEL = By.xpath("//button[@class='DocSearch-Cancel']");
    public static By NAV_BAR = By.xpath("//button[@aria-label='Toggle navigation bar']");
    public static By OPTION_DOCS = By.xpath("//ul[@class='menu__list']/descendant::a[contains(text(), 'Docs')]");
    public static By OPTION_API = By.xpath("//ul[@class='menu__list']/descendant::a[contains(text(), 'API')]");
    public static By CLOSE_NAV_BAR = By.xpath("//button[@aria-label='Close navigation bar']");
    public static By BACK_TO_MENU = By.xpath("//button[@class='clean-btn navbar-sidebar__back']");
    public static By P_TEXT = By.xpath("//p[@class='hero__subtitle']");
    public static By H3_TEXT = By.xpath("//h3[contains(text(), 'Test in Real Environments')]");
    public static By H3_TEXT_1 = By.xpath("//h3[contains(text(), 'Based on Web Standards')]");
    public static By H3_TEXT_2 = By.xpath("//h3[contains(text(), 'Committed Community')]");
    public static By HOME_APK = By.xpath("//div[@class='navbar-sidebar__brand']/child::a[@class='navbar__brand']");
}
