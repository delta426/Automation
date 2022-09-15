package com.myStore.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.myStore.generic.BasePage;

public class HomePage extends BasePage {


	@FindBy(xpath="//span[text()='My wishlists']")
	private WebElement myWishList;
	
	@FindBy(xpath = "//span[text()='Order history and details']")
	private WebElement orderHistory;
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public void validateMyWishlist()
	{
		boolean b=myWishList.isDisplayed();
		if(b)
		{
		Reporter.log("MyWhisList is present ",true);
		}else {
		Reporter.log("MyWhisList is not present ",true);
		}
	}
	public boolean validateOrderHistory()
	{
		return orderHistory.isDisplayed();
//		boolean b=orderHistory.isDisplayed();
//		if(b)
//		{
//		Reporter.log("orderHistory is present ",true);
//		}else {
//		Reporter.log("orderHistory is not present ",true);
//		}
	}
	
	
	
}
