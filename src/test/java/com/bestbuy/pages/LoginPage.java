package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BaseTest;

public class LoginPage extends BaseTest {
	@FindBy(xpath = "(//*[starts-with(text(),'United States')])[1]")
	WebElement us;

	public void unitedStatesButton() {

		waitForElement(us);
		clickAction(us);

	}
	

	@FindBy(xpath = "//span[text()='Account']")
	WebElement accountButton;

	// we need click function
	public void clickAccountButton() {

		waitForElement(accountButton);
		clickAction(accountButton);

	}

	@FindBy(xpath = "//a[text()='Create Account'][@role='button']")
	WebElement createAccount;

	public void Account() {

		waitForElement(createAccount);
		clickAction(createAccount);

	}

}
