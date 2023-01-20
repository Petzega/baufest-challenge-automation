package com.bdd.baufest.utils;

import io.appium.java_client.TouchAction;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Set;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class AndroidUtils {

    public static void doSleep(long waitingTime) {
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static WebElement doWaitVisibiliTyOfElementLocated(long waitingTime, By path) {
        return new WebDriverWait(DriverFactory.androidDriver, Duration.ofSeconds(waitingTime)).until(ExpectedConditions.visibilityOfElementLocated(path));
    }
    public static void doClickElement(long waitingTime, By path) {
        doWaitVisibiliTyOfElementLocated(waitingTime, path).click();
    }

    public static void setTextElement(long waitingTime, By path, String text) {
        WebElement element = doWaitVisibiliTyOfElementLocated(waitingTime, path);
        element.clear();
        element.sendKeys(text);
    }

    public static String getTextElement(long waitingTime, By path) {
        return doWaitVisibiliTyOfElementLocated(waitingTime, path).getText();
    }

    public static boolean validateElement(long waitingTime,By path) {
        boolean validator = true;
        try {
            doWaitVisibiliTyOfElementLocated(waitingTime, path);
        } catch (Exception e) {
            return false;
        }
        return validator;
    }

    public static void assertText(long waitingTime, By path, String value) {
        doSleep(3000);
        Assert.assertEquals(getTextElement(waitingTime, path), value);
    }

    public static void assertContainsText(long waitingTime, By path, String value) {
        Assert.assertTrue(getTextElement(waitingTime, path).contains(value));
    }

    public static String getDataTable(DataTable dataTable, String value) {
        return dataTable.asMaps(String.class, String.class).get(0).get(value);
    }

    public static void contextWebview() {
        Set<String> contextNames = DriverFactory.androidDriver.getContextHandles();
        for (String contextName : contextNames) {
            System.out.println(contextName);
            if (contextName.contains("WEBVIEW")){
                DriverFactory.androidDriver.context(contextName);
            }
        }
    }

    public static void doVerticalSwipeToElement(WebElement startElement, WebElement endElement) {
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
        new TouchAction(DriverFactory.androidDriver)
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
    }

    public static void returnNativeApp() {
        DriverFactory.androidDriver.context("NATIVE_APP");
    }
}
