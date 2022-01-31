package com.ilab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Admin extends SetUp {

	public void selenium_Test() { //click to navigate to admin tab
		driver.findElement(By.linkText(Locators.adminTab)).click();
	} //test
	@Test(priority = 7) //validating admin Url
	public void validateAdminUrl() { //test case and description
		test = extent.createTest("Url should contain admin/viewSystemUsers", "Validate that url contain admin/viewSystemUsers"); //admin url
		String admin_url = Locators.adminUrl; //checking if current url contains admin url
		if(driver.getCurrentUrl().contains(admin_url)) {
			result = true;
		}
		else {
			result = false;
		} //verify that the expected result and the actual result matched or no
		Assert.assertTrue(result);
		test.pass("url contain admin/viewSystemUsers");
	} //test
	@Test(priority = 8)
	public void validateAdd () { //test case and description
		test = extent.createTest("Add button should be displayed", "Validate that add button is displayed"); //calling web element by name
		WebElement save_btn = driver.findElement(By.name(Locators.saveBtn)); //checking if add button is displayed or not
		if(save_btn.isDisplayed()) {
			test.pass("save button is displayed");
		}
	} //test
	@Test (priority = 9)
	public void validateDelete() { //test case and description
		test = extent.createTest("Delete button should be displayed", "Validate that delete button is displayed"); //calling web element by name
		WebElement delete_btn = driver.findElement(By.name(Locators.deleteBtn)); //checking if delete button is displayed or not
		if(delete_btn.isDisplayed()) {
			test.pass("delete button is displayed");
		}
	} //test
	@Test(priority = 10)
	public void validateSearch() { //test case and description
		test = extent.createTest("Search button should be displayed", "Validate that search button is displayed"); //calling web element by name
		WebElement search_btn = driver.findElement(By.name(Locators.searchBtn)); //checking if search button is displayed or not
		if(search_btn.isDisplayed()) {
			test.pass("search button is displayed");
		}
	} //test
	@Test(priority = 11)
	public void validateReset() { //test case and description
		test = extent.createTest("Reset button should be displayed", "Validate that reset button is displayed"); //calling web element by name
		WebElement reset_btn = driver.findElement(By.name(Locators.resetBtn)); //checking if reset button is displayed or not
		if(reset_btn.isDisplayed()) {
			test.pass("reset button is displayed");
		}
	}


}
