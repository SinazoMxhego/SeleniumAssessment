package com.ilab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddButton extends SetUp {

	@Test(priority = 12)
	public void test_case_four() {

		//clicking add button
		driver.findElement(By.id("btnAdd")).click();
	}

	//test
	@Test(priority = 13) //validating Url contain admin/viewSystemUsers
	public void ValidateUrl() {

		//test case and description
		test = extent.createTest("validate if url contain admin/viewSystemUsers", "check if url contain admin/viewSystemUsers"); //user url
		String admin_url_user = Locators.adminUrl; //checking if current url contains admin user url
		if(driver.getCurrentUrl().contains(admin_url_user)) {
			result = true;
		}
		else {
			result = false;
		} 

		//verify that the expected result and the actual result matched or not
		Assert.assertTrue(result);
		test.pass("url contain admin/viewSystemUsers");
	}

	//test
	@Test(priority = 14) //validating add user h1
	public void AddUserH1() {

		//test case and description
		test = extent.createTest("Add User H1 should display", "validate that user H1 should display"); //calling web element by id
		WebElement user_header = driver.findElement(By.id(Locators.userHeading));
		//checking if user header is displayed
		if(user_header.isDisplayed()) {
			test.pass("User H1 should is displayed");
		}
	}
}






