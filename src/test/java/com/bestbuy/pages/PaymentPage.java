package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BaseTest;

public class PaymentPage extends BaseTest {

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

	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkOut;

	public void checkOutButton() {

		waitForElement(checkOut);
		clickAction(checkOut);

	}

	@FindBy(xpath = "//button[text()='Continue as Guest']")
	WebElement continueAsGuest;

	public void continueAs() {

		waitForElement(continueAsGuest);
		clickAction(continueAsGuest);

	}

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement payFName;

	public void fNmae(String userName) {

		waitForElement(payFName);
		typeText(payFName, userName);

	}

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement payLName;

	public void lastNmae(String userLastName) {

		waitForElement(payLName);
		typeText(payLName, userLastName);

	}

	@FindBy(xpath = "//input[@id='street']")
	WebElement address;

	public void streetAddress(String addressNumber) {

		waitForElement(address);
		typeText(address, addressNumber);

	}

	@FindBy(xpath = "//input[@id='city']")
	WebElement city;

	public void enterCityNmae(String cityname) {

		waitForElement(city);
		typeText(city, cityname);

	}

	@FindBy(xpath = "//select[@id='state'][@name='state']")
	WebElement state;

	public void selectState(String statename) {

		waitForElement(state);
		selectDDByVisibleText(state, statename);

	}

	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipCode;

	public void enterZip(String code) {

		waitForElement(zipCode);
		typeText(state, code);

	}

	@FindBy(xpath = "//input[@id='save-for-billing-address-Map {}']")
	WebElement useBillingAddress;

	public void useAs() {

		waitForElement(useBillingAddress);
		clickAction(useBillingAddress);

	}
	
	
	
	
	@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-md new-address-form__button']")
	WebElement apply;

	public void applyClick() {

		waitForElement(apply);
		clickAction(apply);
		alertClick();

	}
	
	@FindBy(xpath="//input[@id='user.emailAddress']")
	WebElement enterEmailId;
	
	
	
	public void typeEmail(String email) {

		waitForElement(enterEmailId);
	    typeText(enterEmailId, email);

	}
	
	@FindBy(xpath="//input[@id='user.phone']")
	WebElement mobileNumber;
	
	
	
	public void enterNumber(String cellNumber) {

		waitForElement(mobileNumber);
	    typeText(mobileNumber, cellNumber);

	}
	
	
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continueGuest;
	
	
	
	public void continueAsGuest() {

		waitForElement(continueGuest);
	    clickAction(continueGuest);

	}
	
}