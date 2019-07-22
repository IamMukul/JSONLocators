package com.gmail.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementFinder {
	
	static public WebElement findElement(WebDriver driver, ElementInfo elementInfo) {
		WebElement element = null;
		if(elementInfo.locatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(elementInfo.locator));
		} else if(elementInfo.locatorType.equalsIgnoreCase("cssSelector")) {
			element = driver.findElement(By.cssSelector(elementInfo.locator));
		} else if(elementInfo.locatorType.equalsIgnoreCase("className")) {
			element = driver.findElement(By.className(elementInfo.locator));
		} else if(elementInfo.locatorType.equalsIgnoreCase("id")) {
			System.out.println(driver);
			element = driver.findElement(By.id(elementInfo.locator));
		} else if(elementInfo.locatorType.equalsIgnoreCase("linkText")) {
			element = driver.findElement(By.linkText(elementInfo.locator));
		} else if(elementInfo.locatorType.equalsIgnoreCase("partialLinkText")) {
			element = driver.findElement(By.partialLinkText(elementInfo.locator));
		}
		return element;
	}
}
