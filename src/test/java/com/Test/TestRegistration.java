package com.Test;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.testBase.baseClassForYahoo;

public class TestRegistration extends baseClassForYahoo {
	@Test
	public void verifyFirstName() throws InterruptedException {
		h.InputFistName();
	}
	
	@Test
	public void verifyLaststName() throws InterruptedException {
		h.InputLastName();
	}
	
	@Test
	public void verifyNewEmail() throws InterruptedException {
		h.NewYahooEmail();
	}
	
	@Test
	public void verifyInputPassward() throws InterruptedException {
		h.NewPassward();
	}
	
	@Test
	public void verifyInputBirthYear() throws InterruptedException {
		h.BirthYear();
	}
	
	@Test
	public void SelectCountryCode() throws InterruptedException {
		h.SelectCountryCode();
	}
	
	@Test
	public void InputMobileNumber() throws InterruptedException {
		h.InputRecoveryMobileNumber();
	}
	
	@Test
	public void InvalidInputMobileNumber() throws InterruptedException {
		h.InputRecoveryMobileNumber();
		Assert.assertTrue("That doesn’t look right, please re-enter your phone number.", false);
	}
	@Test
	public void EmtyInputMobileNumber() throws InterruptedException {
		h.InputInvalidRecoveryMobileNumber();
		Assert.assertTrue("Your Number for needed for account security and wont be seen others", false);
	}
	
	@Test
	public void clickOnVerify() throws InterruptedException {
		h.VerifyMobileNumber();
	}
}
