package com.hrm.scripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.LoginPage;

public class TestLoginButton extends BaseTest{
	@BeforeClass
	public void disableAutoLoginLogout(){
		loginlogoutRequired=false;
	}
	
	@Test(priority=3)
	public void testLoginButton(){
		//Verify Login Button is present
		LoginPage lPage=new LoginPage(driver);
		lPage.checkLoginButtonIsPresent();
	}
}
