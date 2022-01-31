package com.ilab.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class SearchUser extends SetUp {

public void Search() {
SetUp.driver.findElement(By.id("searchSystemUser_userName")).clear();
SetUp.driver.findElement(By.id("searchSystemUser_userName")).sendKeys(InputValues.UserName);




SetUp.driver.findElement(By.id("searchBtn")).click();
}

//validate Username
public void validateUsername () {



//test case and description
test = extent.createTest("username validation", "validate that username");



//calling username by xpath
WebElement val_user = driver.findElement(By.xpath(Locators.valUsername));



//validate that username text is input.username or not
if(val_user.getText().equalsIgnoreCase(InputValues.UserName)) {
result = true;;
}
else {
result = false;
}



//verify that the expected result and the actual result matched or not
Assert.assertTrue(result);
test.pass("Test Passed");
}



//test
@Test(priority = 20)



//validate Employee Name
public void validateEmployeeName () {



//test case and description
test = extent.createTest("employee name validation", "validate that employee name");



//calling Employee Name by xpath
WebElement val_EmpNam = driver.findElement(By.xpath(Locators.valUsername));



//checking that Employee Name text is expected_EmpName or not
if(val_EmpNam.getText().equalsIgnoreCase(InputValues.expectedEmpName)) {
result = true;;
}
else {
result = false;
}



//verify that the expected result and the actual result matched or not
Assert.assertTrue(result);
test.pass("Test Passed");
}



//test
@Test(priority = 21)



//validate Status
public void validateStatus () {



//test case and description
test = extent.createTest("status enabled validation", "validate that status is enabled");



//calling validation status by xpath
WebElement val_drop_status = driver.findElement(By.xpath(Locators.valUsername));



//checking that status text is validation status or not
if(val_drop_status.getText().equalsIgnoreCase(Locators.valStatus)) {
result = true;;
}
else {
result = false;
}



//verify that the expected result and the actual result matched or not
Assert.assertTrue(result);
test.pass("Test Passed");
}



}