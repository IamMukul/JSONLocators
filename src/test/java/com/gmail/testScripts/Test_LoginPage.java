package com.gmail.testScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.gmail.generic.BaseLibrary;
import com.gmail.pageClasses.LoginPage;

public class Test_LoginPage extends BaseLibrary {
	LoginPage loginPageObj;

	@BeforeMethod
	public void initializePageObjects() {
		loginPageObj = new LoginPage(driver);
	}

	@Test
	public void userEntersInvalidUserName() {

		// Opening Login Page for accessing Gmail
		driver.get("https://www.gmail.com");

		// Entering userName into the username field
		loginPageObj.fillUserName("");

		// Clicking on next button for moving further
		loginPageObj.clickOnNextButton();
		// Check for error message
		String expectedErrorMessage = "Couldn't find your Google Account";
		String actualErrorMessage = loginPageObj.getEmailErrorMessage();
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error in getting invalid email message");
	}

	@Test
	public void userEntersValidUserNameButInvalidPassword() {

		// Opening Login Page for accessing Gmail
		driver.get("https://www.gmail.com");

		// Entering userName into the username field
		loginPageObj.fillUserName("");

		// Clicking on next button for moving further
		loginPageObj.clickOnNextButton();
		// Conducting check for visibility of password field
		boolean visiblityStatus = loginPageObj.isPasswordInputFieldVisible();
		Assert.assertTrue(visiblityStatus);

		// User enters password
		loginPageObj.fillPassword("");
		
		// Clicking on next button for moving further
		loginPageObj.clickOnNextButton();

		// Check for error message
		String expectedErrorMessage = "Wrong password. Try again or click Forgot password to reset it.";
		String actualErrorMessage = loginPageObj.getPasswordErrorMessage();
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error in getting invalid password message");
	}

	@Test
	public void userEntersCorrectCredentials() {

		// Opening Login Page for accessing Gmail
		driver.get("https://www.gmail.com");

		// Entering userName into the username field
		loginPageObj.fillUserName("");

		// Clicking on next button for moving further
		loginPageObj.clickOnNextButton();
		// Conducting check for visibility of password field
		boolean visiblityStatus = loginPageObj.isPasswordInputFieldVisible();
		Assert.assertTrue(visiblityStatus);

		// User enters password
		loginPageObj.fillPassword("");

		// Clicking on next button for moving further
		loginPageObj.clickOnNextButton();
		
	}
}
