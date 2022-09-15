package com.myStore.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage 
{

	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyTitle(String title)
	{
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
      try
      {
	        wait.until(ExpectedConditions.titleContains(title));
	        Reporter.log("Title is present",true);
      }catch(Exception e)
      {
    	  Reporter.log("Title is not present",true);
    	  Assert.fail();
      }
	}
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	      try
	      {
		        wait.until(ExpectedConditions.visibilityOf(element));
		        Reporter.log("Element is present",true);
	      }catch(Exception e)
	      {
	    	  Reporter.log("Element is not present",true);
	    	  Assert.fail();
	      }
	}
}
