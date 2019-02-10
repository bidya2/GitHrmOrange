package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.UsersPage;

public class TestUserRoleListBox extends BaseTest{
	
	@Test(priority=7)
	
	public void testUsrRoleListBox(){
		
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickAdmin_Menu();
		
		dbPage.clickuserManagement_Menu();
		
		UsersPage uPage= new UsersPage(driver);
		uPage.checkUserRoleListBoxIsSorted();
		
	}
}