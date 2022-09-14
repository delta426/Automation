package com.phptravels.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.phptravels.generic.BasePage;

public class LoginPage extends BasePage{
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement emailtxtbox;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordtxtbox;
	
	@FindBy(xpath="(//button[@data-style='zoom-in'])[1]")
	private WebElement loginbutton;
	
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		
	}
    public void getEmail(String email)
    {
    	emailtxtbox.sendKeys(email);
    }
    public void getPassword(String password)
    {
    	passwordtxtbox.sendKeys(password);
    }
    public void clickLogin()
    {
    	loginbutton.click();
    }
    public void verifyLoginPage(String lp_title)
    {
  	  verifyTitle(lp_title);
    }
	
}
