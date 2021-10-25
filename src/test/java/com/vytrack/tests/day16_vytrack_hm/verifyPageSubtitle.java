package com.vytrack.tests.day16_vytrack_hm;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.security.auth.login.LoginContext;

public class verifyPageSubtitle extends TestBase {

     @Test
    public void pageSubtitleTest(){

         extentLogger = report.createTest("Verify page subtitle is displayed");
         extentLogger.info("Login as Store Manager");
         LoginPage login = new LoginPage();
         login.loginAsStoreManager();
         extentLogger.info("Navigate to tab:Activities, module:Calendar Events");
         DashboardPage dashboardPage = new DashboardPage();
         dashboardPage.navigateToModule("Activities","Calendar Events");
         extentLogger.info("Verify page subtitle is displayed");
         Assert.assertTrue(dashboardPage.pageSubTitle.isDisplayed(),"Verify page subtitle is displayed");

     }


}
