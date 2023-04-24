package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BaseTest;

public class AddToCartByDepartment extends BaseTest {

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

	@FindBy(xpath = "//button [text()='Appliances'][@class='c-button-unstyled hamburger-menu-flyout-list-item ']")
	WebElement Appliances;

	public void appliancesClick() {

		waitForElement(Appliances);
		clickAction(Appliances);

	}

	@FindBy(xpath = "//button [text()='Washers & Dryers'][@class='c-button-unstyled hamburger-menu-flyout-list-item ']")
	WebElement washersanddryer;

	public void washersanddryerClick() {

		waitForElement(washersanddryer);
		clickAction(washersanddryer);

	}

	@FindBy(xpath = "//a [contains(text(),'Washer & Dryer Sets')]")
	WebElement dryer;

	public void dryerClick() {

		waitForElement(dryer);
		clickAction(dryer);

	}

	@FindBy(xpath = "//a [contains(text(),'Package - Whirlpool - 3.8 Cu. Ft. High Efficiency Top Load Washer')]")
	WebElement topLoadWasher;

	public void loadWasherClick() {

		waitForElement(topLoadWasher);
		clickAction(topLoadWasher);

	}

	@FindBy(xpath = "//button[text()='Add to Cart'][@type='button']")
	WebElement addToCart;

	public void cartClick() {

		waitForElement(addToCart);
		clickAction(addToCart);

	}
	
	@FindBy(xpath = "//a[text()='Go to Cart']")
	WebElement addToMainCart;

	public void cartCount() {

		waitForElement(addToMainCart);
		clickAction(addToMainCart);

	}
	
	
}
