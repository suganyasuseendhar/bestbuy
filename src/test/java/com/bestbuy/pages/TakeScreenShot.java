package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BaseTest;

public class TakeScreenShot extends BaseTest{


	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement takeShoot;

	
	public void clickPicture() {

		waitForElement(takeShoot);
		clickAction(takeShoot);

	}


	
}
