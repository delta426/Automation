package com.myStore.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.myStore.generic.BasePage;

public class IndexPage extends BasePage{
  
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signInButton;
	
	@FindBy(xpath="//a[@class='logo img-responsive']")
	private WebElement mystoreLogo;
	
	@FindBy(id="search_query_top")
	private WebElement searchBox;
	
	@FindBy(name="submit_search")
	private WebElement searchButton;
	
	public IndexPage(WebDriver driver)
	{
		super(driver);
	}
	
	public LoginPage clickSignin()
	{
		signInButton.click();
		return new LoginPage(driver);
	}
	public void validateLogo()
	{
		boolean b=mystoreLogo.isDisplayed();
		if(b)
		{
		Reporter.log("mystoreLogo is present ",true);
		}else {
		Reporter.log("mystoreLogo is not present ",true);
		}
	}
	public SearchResultPage setSearchBox(String product)
	{
		searchBox.sendKeys(product);
		searchButton.click();
		return new SearchResultPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
