package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.BaseTest;

public class CreateAccountPage extends BaseTest {
	
	
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
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	public void fname(String startName) {

		waitForElement(firstName);
		typeText(firstName, startName);

	}
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	
	public void lname(String finalname) {

		waitForElement(lastName);
		typeText(lastName, finalname);

	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	public void email(String emailId) {

		waitForElement(email);
		typeText(email, emailId);

	}
	
	@FindBy(xpath="//input[@id='fld-p1'][@name='fld-p1']")
	WebElement password;
	
	public void password1(String keyWord) {

		waitForElement(password);
		typeText(password, keyWord);

	}
	
	@FindBy(xpath="//input[@id='reenterPassword'][@name='reenterPassword']")
	WebElement rePassword;
	public void password2(String rekeyWord) {

		waitForElement(rePassword);
		typeText(rePassword, rekeyWord);

	}
	
	//@FindBy(xpath="//input[@id='show-hide-password-toggle']/following::span[1]")
	//WebElement toggleMove;
	
	
	
	@FindBy(xpath="//input[@id='phone'][@name='phone']")
	WebElement phoneNumber;
	
	public void mobileNumber(String number) {

		waitForElement(phoneNumber);
		typeText(phoneNumber, number);

	}
	
	@FindBy(xpath="//input[@id='is-recovery-phone'][@name='isRecoveryPhone']")
	WebElement recoverymail;
	
	public void backupMail() {

		waitForElement(recoverymail);
		clickAction(recoverymail);

	}
	
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement buttonCreateAccount;
	
	public void newAccount() {

		waitForElement(buttonCreateAccount);
		clickAction(buttonCreateAccount);

	}
	
	
	
	@FindBy(xpath="//button[@class='c-button-link cia-cancel']")
	WebElement skip;
	
	public void skipNow() {

		waitForElement(skip);
		clickAction(skip);

	}
}
