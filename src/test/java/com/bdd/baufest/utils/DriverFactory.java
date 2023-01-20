package com.bdd.baufest.utils;

import io.appium.java_client.Setting;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverFactory {

    public static WebDriver webDriver;
    public static AndroidDriver androidDriver;

    public static void startWeb() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://demoblaze.com/");
    }

    public static void quitDriver() {
        webDriver.quit();
    }

    public static void startDriver() {
        WebDriverManager wdm = WebDriverManager.chromedriver().browserVersion("108");
        wdm.setup();
        String chromePath = wdm.getDownloadedDriverPath();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("deviceName", "BISON2103132525");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appActivity", "com.wdiodemoapp.SplashActivity");
        capabilities.setCapability("noReset", false);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("chromedriverExecutable", chromePath);
        try {
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            androidDriver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
