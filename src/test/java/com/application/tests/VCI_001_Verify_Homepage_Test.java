package com.application.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.base.BaseTest;

public class VCI_001_Verify_Homepage_Test extends BaseTest {

    @Test
    public void verifyHomePageTitle() {
        driver.get("https://www.vci.de/startseite.jsp");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("VCI"), "Title does not contain 'VCI'");
    }

    @Test
    public void verifyHeaderElementsPresent() {
        driver.get("https://www.vci.de/startseite.jsp");
        boolean logoPresent = driver.findElements(By.cssSelector("img[alt='VCI']")).size() > 0;
        boolean navPresent = driver.findElements(By.cssSelector("nav")).size() > 0;
        Assert.assertTrue(logoPresent && navPresent, "Logo or navigation not found");
    }
}
