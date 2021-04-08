package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class getPageTitleForDifferentMenusTC8 extends TestBaseTC1andTC6andTC9{
	
	OrangePages OrangeOR;	

	@BeforeMethod
	public void loadPages() {
		OrangeOR = new OrangePages(driver);
	}

	@Test(priority = 5)
	public void AdminMenu() {
		OrangeOR.ClickOnAdminTab();
		Assert.assertTrue(driver.getCurrentUrl().contains("admin"));
		
	}
	
	@Test(priority = 6)
	public void  PIMMenu() {
		OrangeOR.ClickOnPIMTab();
		Assert.assertTrue(driver.getCurrentUrl().contains("pim"));
	
	}
	
	@Test(priority = 7)
	public void  LeaveMenu() {
		OrangeOR.ClickOnLeaveTab();
		Assert.assertTrue(driver.getCurrentUrl().contains("leave"));

	}
	
	@Test(priority = 8)
	public void  DashboardMenu() {
		OrangeOR.ClickOnDashboardTab();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

	}
	
	@Test(priority = 9)
	public void  DirectoryMenu() {
		OrangeOR.ClickOnDirectoryTab();
		Assert.assertTrue(driver.getCurrentUrl().contains("directory"));

	}
	
	@Test(priority = 10)
	public void   MaintenanceMenu() {
		OrangeOR.ClickOnMaintenanceTab();
		Assert.assertTrue(driver.getCurrentUrl().contains("maintenance"));

	}

}
