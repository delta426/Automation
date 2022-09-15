package com.myStore.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myStore.generic.BasePage;

public class AddToCartPage extends BasePage {
	

	@FindBy(id="quantity_wanted")
	private WebElement quantity;
	
	@FindBy(name="group_1")
	private WebElement size;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]//h2/i")
	private WebElement addToCartMessag;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedToCheckOutBtn;
	
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
		addToCartBtn.click();
	}
	public boolean validateAddtoCart()
	{
		return addToCartMessag.isDisplayed();
	}
	public OrderPage clickOnProcidToCheckout()
	{
		proceedToCheckOutBtn.click();
		return new OrderPage();
	}
}
