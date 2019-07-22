package com.gmail.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void iWaitForSeconds(WebDriver driver, int timeInSeconds) {
		driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
	}

	public static void iWaitForMilliSeconds(WebDriver driver, int timeInMilliSeconds) {
		driver.manage().timeouts().implicitlyWait(timeInMilliSeconds, TimeUnit.MILLISECONDS);
	}

	public static void iWaitForMicroSeconds(WebDriver driver, int timeInMicroSeconds) {
		driver.manage().timeouts().implicitlyWait(timeInMicroSeconds, TimeUnit.MICROSECONDS);
	}

	public static void iWaitForNanoSeconds(WebDriver driver, int timeInSeconds) {
		driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.NANOSECONDS);
	}

	public static WebElement eWaitForVisibility(WebDriver driver, int secs, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, secs);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static boolean eWaitForVisibility(WebDriver driver, int timeInSeconds, WebElement element, String attributeName, String value) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		return wait.until(ExpectedConditions.attributeContains(element, attributeName, value));
	}

	public static WebElement eWaitForElementToBeClickable(WebDriver driver, int secs, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, secs);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
