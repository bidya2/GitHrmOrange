package com.hrm.scripts;


//import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.base.BaseTest;

public class LoginLogoutTest extends BaseTest{
	
	@BeforeClass
	public void noAutoLogin(){
		loginlogoutRequired=false;
	}
	
	@Test(priority=1)
	public void testAutoLoginLogout1(){
		log.info("This script will automatically login and logout1");
//		Assert.fail();
	}
}
