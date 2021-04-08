package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePages {

	@FindBy(xpath="//input[@id='txtUsername']")
	@CacheLookup
	WebElement UnameTextField;

	public void setUnameTextFieldInput(String Username) {
		UnameTextField.sendKeys(Username);
	}

	@FindBy(xpath="//input[@id='txtPassword']")
	@CacheLookup
	WebElement PwdTextField;

	public void setPwdTextFieldInput(String Password) {
		PwdTextField.sendKeys(Password);
	}

	@FindBy(xpath="//input[@id='btnLogin']")
	@CacheLookup
	WebElement SubmitButton;
	public void ClickOnSubmitButton() {

		SubmitButton.click();
	}

	@FindBy(xpath="//b[contains(text(),'Dashboard')]")
	@CacheLookup
	WebElement Dashboard;
	public void ClickOnDashboardTab() {

		Dashboard.click();
	}
	
	public String getDashBoardConfirmation() {

		return Dashboard.getText();
	}

	@FindBy(xpath="//b[contains(text(),'Admin')]")
	@CacheLookup
	WebElement Admin;
	public void ClickOnAdminTab() {

		Admin.click();
	}

	public String getTextOnAdmin() {

		return Admin.getText();
	}

	@FindBy(xpath="//a[@id='menu_admin_viewJobTitleList']")
	@CacheLookup
	WebElement JobTitle;
	public void getJobMenu() {
		JobTitle.click();
	}

	@FindBy(xpath="//b[contains(text(),'Leave')]")
	@CacheLookup
	WebElement Leave;
	public void ClickOnLeaveTab() {

		Leave.click();
	}

	public String getTextOnLeave() {

		return Leave.getText();
	}
	
	@FindBy(xpath="//b[contains(text(),'Directory')]")
	@CacheLookup
	WebElement Directory;
	public void ClickOnDirectoryTab() {

		Directory.click();
	}

	public String getTextOnDirectory() {

		return Directory.getText();
	}
	
	
	@FindBy(xpath="//b[contains(text(),'Maintenance')]")
	@CacheLookup
	WebElement Maintenance;
	public void ClickOnMaintenanceTab() {

		Maintenance.click();
	}

	public String getTextOnMaintenance() {

		return Maintenance.getText();
	}

	@FindBy(xpath="//b[contains(text(),'PIM')]")
	@CacheLookup
	WebElement PIM;
	public void ClickOnPIMTab() {

		PIM.click();
	}

	public String getTextOnPIM() {

		return PIM.getText();
	}
	
	
	
	@FindBy(xpath="//input[@id='empsearch_employee_name_empName']")
	@CacheLookup
	WebElement EmployeeField;

	public void setEmployeeTextFieldInput(String Employeename) {
		EmployeeField.clear();
		EmployeeField.sendKeys(Employeename);
	}

	@FindBy(xpath="//b[contains(text(),'Time')]")
	@CacheLookup
	WebElement Time;
	public void ClickOnTimeTab() {

		Time.click();
	}

	public String getTextOnTime() {

		return Time.getText();
	}

	@FindAll(@FindBy(xpath="/a"))
	@CacheLookup
	List<WebElement> AllLinks;

	public List<WebElement> getAllLinks() {

		return AllLinks;
	}

	@FindAll(@FindBy(xpath="/img"))
	@CacheLookup
	List<WebElement> AllImages;

	public List<WebElement> getAllImages() {

		return AllImages;
	}


	@FindAll(@FindBy(xpath="//input[contains(@name,'txt')]"))
	@CacheLookup
	List<WebElement> AllTextBoxs;
	public List<WebElement> getAllTextBoxs()
	{
		return AllTextBoxs;
	}

	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	@CacheLookup
	WebElement UserManagement;
	public String getUserManagementDropDown() {
		return UserManagement.getText();
	}
	
	public void getUserManagementClick() {
		UserManagement.click();
	}
	
	@FindBy(xpath="//a[@id='menu_admin_Job']")
	@CacheLookup
	WebElement Job;
	public String getJobDropDown() {
		return Job.getText();
	}
	public void getJobClick() {
		Job.click();
	}
	
	@FindBy(xpath="//a[@id='menu_admin_Organization']")
	@CacheLookup
	WebElement Organization;
	public String getOrganizationDropDown() {
		return Organization.getText();
	}
	
	public void getOrganizationClick() {
		Organization.click();
	}
	
	@FindBy(xpath="//a[@id='menu_admin_Qualifications']")
	@CacheLookup
	WebElement Qualifications;
	public String getQualificationsDropDown() {
		return Qualifications.getText();
	}
	
	public void getQualificationsClick() {
		Qualifications.click();
	}
	

	WebDriver driver;

	public OrangePages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
