package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;


public class readDashboardHeadingTC10andTC11andTC12 extends TestBaseTC1andTC6andTC9{
	
	OrangePages OrangeOR;	

	@BeforeMethod
	public void loadPages() {
		OrangeOR = new OrangePages(driver);
	}
		
	@Test(priority = 11)
	public void  readDashboardAndtakeCaptureDashboardMenu() throws IOException, InterruptedException {
		Thread.sleep(3000);
		OrangeOR.ClickOnDashboardTab();
		boolean res = driver.getCurrentUrl().contains("dashboard");
		if(res) {
	    String Dashboard = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
		Assert.assertEquals("Dashboard", Dashboard);
		captureScreenshot(driver,"readDashboardAndtakeCaptureDashboardMenu");
		Reporter.log("User is in "+Dashboard,true);
		}else {
			captureScreenshot(driver,"readDashboardAndtakeCaptureDashboardMenu");
			Reporter.log("There are no items displayed");
			Assert.assertTrue(false);
		}
	}
	
	
	@Test(retryAnalyzer=com.qa.utilities.RetryAnalyzer.class, priority = 12)
	public void  retryAnalyzerDashboardMenu() throws IOException {
		OrangeOR.ClickOnDashboardTab();
		boolean res = driver.getCurrentUrl().contains("dashboard1");
		if(res == true) {
	    String Dashboard = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
		Assert.assertEquals("Dashboard", Dashboard);
		Reporter.log("User is in "+Dashboard,true);
		}else {
			captureScreenshot(driver,"retryAnalyzerDashboardMenu");
			Reporter.log("There are no items displayed",true);
			Assert.assertTrue(false);
		}
	}

}

