package com.bdd.baufest.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebUtils {

    public static void doSleep(long waitingTime) {
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static WebElement doWaitVisibiliTyOfElementLocated(long waitingTime, By path) {
        return new WebDriverWait(DriverFactory.webDriver, Duration.ofSeconds(waitingTime)).until(ExpectedConditions.visibilityOfElementLocated(path));
    }

    public static void doClickElement(long waitingTime, By path) {
        doWaitVisibiliTyOfElementLocated(waitingTime, path).click();
    }

    public static void setTextElement(long waitingTime, By path, String text) {
        doWaitVisibiliTyOfElementLocated(waitingTime, path).sendKeys(text);
    }

    public static String getTextElement(long waitingTime, By path) {
        return doWaitVisibiliTyOfElementLocated(waitingTime, path).getText();
    }

    public static void doScrollToElement(long waitingTime, By path) {
        JavascriptExecutor js = (JavascriptExecutor) DriverFactory.webDriver;
        js.executeScript("arguments[0].scrollIntoView();", doWaitVisibiliTyOfElementLocated(waitingTime, path));
        doSleep(2000);
    }

    public static Alert handleAlert() {
        return DriverFactory.webDriver.switchTo().alert();
    }
}
