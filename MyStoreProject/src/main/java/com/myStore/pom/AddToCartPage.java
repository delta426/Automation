package com.myStore.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myStore.generic.BasePage;

public class AddToCartPage extends BasePage {
	

	@FindBy()
	private WebElement quantity;
	
	@FindBy()
	private WebElement size;
	
	@FindBy()
	private WebElement addToCart;
	
	public AddToCartPage(WebDriver driver) {
		super(driver);
	}
	public void setQuantity(String quantityOfProduct)
	{
		quantity.sendKeys(quantityOfProduct);
	}
	public void setSize(String sizeOfProduct)
	{
		size.sendKeys(sizeOfProduct);
	}
	public void clickOnAddToCart()
	{
		addToCart.click();
	}
    
}
