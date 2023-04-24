package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BaseTest;

public class LoginPageOpen extends BaseTest {

	

		
		
		
		@FindBy(xpath = "//a[text()='Sign In']")
		WebElement signInButton;

		
		public void signButtonClick() {

			waitForElement(signInButton);
			clickAction(signInButton);

		}
		
		
		@FindBy(xpath = "//input[@id='fld-e']")
		WebElement loginEmail;

		
		public void enterEmail(String emailId) {

			waitForElement(loginEmail);
			typeText(loginEmail, emailId);

		}
		
	
	
		@FindBy(xpath = "//input[@id='fld-p1']")
		WebElement password;

		
		public void enterPassword(String typePassword) {

			waitForElement(password);
			typeText(password, typePassword);

		}
		
		@FindBy(xpath = "//button[text()='Sign In']")
		WebElement signIn;

		
		public void signEnter() {

			waitForElement(signIn);
			clickAction(signIn);

		}
		
		
		
	}

