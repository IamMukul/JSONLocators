package com.gmail.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.gmail.generic.Waits;
import com.gmail.webElements.loginPage.LoginPageElements;

public class LoginPage extends LoginPageElements{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public void fillUserName(String userName) {
		//Waits.eWaitForElementToBeClickable(50, getInputUserName());
		getInputUserName().sendKeys(userName);
	}
	public void clickOnNextButton() {
		//System.out.println("Next button");
		//Waits.eWaitForElementToBeClickable(50, getButtonNext());
		getButtonNext().click();
	}
	public void fillPassword(String password) {
		//Waits.eWaitForElementToBeClickable(50, getInputPassword());
		getInputPassword().sendKeys(password);
	}
	public String getTitle() {
		return driver.getTitle();
	}
	public String getEmailErrorMessage() {
		//Waits.eWaitForVisibility(10, getTextInvalidEmailMessage());
		return getTextInvalidEmailMessage().getText();
	}
	public String getPasswordErrorMessage() {
		//Waits.eWaitForVisibility(10, getTextInvalidPasswordMessage());
		return getTextInvalidPasswordMessage().getText();
	}
	public boolean isPasswordInputFieldVisible() {
		WebElement element;
		element = Waits.eWaitForVisibility(driver, 50, getInputPassword());
		if(element!=null) {
			return true;
		}
		return false;
	}
}
