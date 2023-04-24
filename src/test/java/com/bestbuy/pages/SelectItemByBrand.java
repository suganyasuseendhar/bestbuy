package com.bestbuy.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BaseTest;

public class SelectItemByBrand extends BaseTest{

	@FindBy(xpath = "(//*[starts-with(text(),'United States')])[1]")
	WebElement us;

	public void unitedStatesButton() {

		waitForElement(us);
		clickAction(us);

	}

	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button'][@type='button']")
	WebElement menuIcon;

	public void menuClick() {

		waitForElement(menuIcon);
		clickAction(menuIcon);

	}
	
	@FindBy(xpath = "//button [text()='Brands']")
	WebElement brand;

	public void brandClick() {

		waitForElement(brand);
		clickAction(brand);

	}
	
	@FindBy(xpath = "//a [text()='Apple']")
	WebElement appleBrand;

	public void appleClick() {

		waitForElement(appleBrand);
		clickAction(appleBrand);

	}
	
	@FindBy(xpath = "(//a [text()='iPad'])[1]")
	WebElement ipad;

	public void ipadClick() {

		waitForElement(ipad);
		clickAction(ipad);

	}
	
	
	@FindBy(xpath = "//a[text()='iPad mini']")
	WebElement ipadMini;

	public void ipadMiniClick() {

		waitForElement(ipadMini);
		clickAction(ipadMini);

	}
	
	
	
	
	/*@FindBy(xpath = "((//a[contains(text(),'Shop')])[1]")
	WebElement shopNow;

	public void shopNowClick() {

		waitForElement(shopNow);
		clickAction(shopNow);

	}
	
	@FindBy(xpath = "(//a[contains(text(),'with Wi-Fi - 256GB - Silver')])")
	WebElement AppleItemLink;

	public void appleIpadClick() {

		waitForElement(AppleItemLink);
		clickAction(AppleItemLink);

	}
	*/
	
	
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	WebElement ipadAddCart;

	public void appleIpadAddToCart() {

		waitForElement(ipadAddCart);
		//moveTo(ipadAddCart);
		jsScrollUpToElement(ipadAddCart);
		//jsClick (ipadAddCart);
      clickAction(ipadAddCart);
	
	}
	
	
	
	
	@FindBy(xpath = "//a[text()='Go to Cart']")
	WebElement viewCart;

	public void viewAddToCart() {

		waitForElement(viewCart);
		clickAction(viewCart);

	
	}
	
	
	
}
