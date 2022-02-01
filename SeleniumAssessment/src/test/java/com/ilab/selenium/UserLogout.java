package com.ilab.selenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLogout extends SetUp {
	@Test
	public void LogOut() {
		SetUp.driver.findElement(By.id("welcome")).click();
		SetUp.driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
	}

	//test
	@Test(priority = 26) 
	
	//validate User Login
	public void validateUserLogin () { 
		
		//test case and description
		test = extent.createTest("User should contain login", "validate if user contain login"); 
		
		//checking if current url contains val_login or not
		if(driver.getCurrentUrl().contains(Locators.valLogin)) {
			result = true;
		}
		else {
			result = false;
		} 
		
		//verify that the expected result and the actual result matched or not
		Assert.assertTrue(result);
		test.pass("url contain login");
	} 
	
	//test
	@Test(priority = 27)
	public void validateTitle() throws InterruptedException { 
		
		//test case and description
		test = extent.createTest("Title should be OrangeHRM", "validate that Title should be OrangeHRM");
		String actualTitle = driver.getTitle();
		String expectedTitle = InputValues.expTitle; 
		
		//verify that the expected result and the actual result matched or not
		Assert.assertEquals(actualTitle, expectedTitle); test.pass("Test Passed");
		Thread.sleep(5000);
	}



}