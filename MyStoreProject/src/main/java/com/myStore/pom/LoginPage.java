package com.myStore.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myStore.generic.BasePage;

public class LoginPage extends BasePage {

	
	

	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(name="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement signInButton;
	
	@FindBy(name="email_create")
	private WebElement emailForNewAccount;
	
	@FindBy(name="SubmitCreate")
	private WebElement createAccountButton;
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		
	}
	public HomePage doLogin(String usename,String pwd)
	{
		userName.sendKeys(usename);
		password.sendKeys(pwd);
		signInButton.click();
		return new HomePage(driver);
	}
	public AccountCreationPage createNewAccount(String email)
	{
		emailForNewAccount.sendKeys(email);
		createAccountButton.click();
		return new AccountCreationPage();
	}
	//method overloading for negative testing
	public void doLogin()
	{
		userName.sendKeys();
		password.sendKeys();
		signInButton.click();
	}
	//
	public void doLogin(String un)
	{
		userName.sendKeys(un);
		password.sendKeys();
		signInButton.click();
		
	}
	
}
