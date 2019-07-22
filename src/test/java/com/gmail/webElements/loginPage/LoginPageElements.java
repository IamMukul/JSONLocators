package com.gmail.webElements.loginPage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gmail.generic.ElementFinder;
import com.gmail.generic.ElementInfo;
import com.gmail.generic.JSONFileReader;

public class LoginPageElements {
	WebDriver driver;
	final String filePath = "./src/test/resources/Locators/LoginPageLocators.json";
	final String sheetName = "Login Page"; 
	ElementFinder finder = new ElementFinder();
	List<ElementInfo> list = JSONFileReader.readLocators(filePath);
	ElementInfo elementInfo = null;
	
	private WebElement inputUserName;
	private WebElement inputPassword;
	private WebElement buttonNext;
	private WebElement textInvalidEmailMessage;
	private WebElement textInvalidPasswordMessage;
	
	public LoginPageElements(WebDriver driver) {
		super();
		this.driver = driver;
	}
	private void setInputUserName() {
		for (Iterator<ElementInfo> iterator = list.iterator(); iterator.hasNext();) {
			elementInfo = (ElementInfo) iterator.next();
			if(elementInfo.elementName.equalsIgnoreCase("InputUserName")) {
				inputUserName = ElementFinder.findElement(driver, elementInfo);
				break;
			}
		}
	}
	private void setInputPassword() {
		for (Iterator<ElementInfo> iterator = list.iterator(); iterator.hasNext();) {
			elementInfo = (ElementInfo) iterator.next();
			if(elementInfo.elementName.equalsIgnoreCase("InputPassword")) {
				inputPassword = ElementFinder.findElement(driver, elementInfo);
				break;
			}
		}
	}
	private void setButtonNext() {
		for (Iterator<ElementInfo> iterator = list.iterator(); iterator.hasNext();) {
			elementInfo = (ElementInfo) iterator.next();
			if(elementInfo.elementName.equalsIgnoreCase("ButtonNext")) {
				buttonNext = ElementFinder.findElement(driver, elementInfo);
				break;
			}
		}
		//System.out.println("setButtonNext");
	}
	private void setTextInvalidEmailMessage() {
		for (Iterator<ElementInfo> iterator = list.iterator(); iterator.hasNext();) {
			elementInfo = (ElementInfo) iterator.next();
			if(elementInfo.elementName.equalsIgnoreCase("TextInvalidEmailMessage")) {
				textInvalidEmailMessage = ElementFinder.findElement(driver, elementInfo);
				break;
			}
		}
	}
	private void setTextInvalidPasswordMessage() {
		for (Iterator<ElementInfo> iterator = list.iterator(); iterator.hasNext();) {
			elementInfo = (ElementInfo) iterator.next();
			if(elementInfo.elementName.equalsIgnoreCase("TextInvalidPasswordMessage")) {
				textInvalidPasswordMessage = ElementFinder.findElement(driver, elementInfo);
				break;
			}
		}
	}
	public WebElement getInputUserName() {
		setInputUserName();
		return inputUserName;
	}
	public WebElement getInputPassword() {
		setInputPassword();
		return inputPassword;
	}
	public WebElement getButtonNext() {
		//System.out.println("getButtonNext");
		setButtonNext();
		return buttonNext;
	}
	public WebElement getTextInvalidEmailMessage() {
		setTextInvalidEmailMessage();
		return textInvalidEmailMessage;
	}
	public WebElement getTextInvalidPasswordMessage() {
		setTextInvalidPasswordMessage();
		return textInvalidPasswordMessage;
	}
}
