package com.qa.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class getPIMEmployeeTC13 extends TestBaseTC1andTC6andTC9{
	
	OrangePages OrangeOR;	

	@BeforeMethod
	public void loadPages() {
		OrangeOR = new OrangePages(driver);
	}
	
	@Test(priority = 13)
	public void  getPIMEmployeeMenu() throws IOException, InterruptedException {
		Thread.sleep(2000);
		OrangeOR.ClickOnPIMTab();
		Assert.assertTrue(driver.getCurrentUrl().contains("pim"));
		OrangeOR.setEmployeeTextFieldInput("Linda Anderson");
		captureScreenshot(driver,"getPIMEmployeeMenu");	
		
	}

}
