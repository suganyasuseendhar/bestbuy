package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BaseTest;

public class SelectCountryPage extends BaseTest {

	@FindBy(xpath = "(//*[starts-with(text(),'United States')])[1]")
	WebElement us;

	public void unitedStatesButton() {

		waitForElement(us);
		clickAction(us);

	}
}