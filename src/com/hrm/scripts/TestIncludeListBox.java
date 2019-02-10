package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;

public class TestIncludeListBox extends BaseTest{
	
	@Test(priority=5)
	
	public void testIncludeListBox(){
		//Click on PIM menu
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickPIM_Menu();
		
		//Check IncludeListBox is sorted
		EmpInfoPage eiPage=new EmpInfoPage(driver);
		eiPage.checkIncludeListBoxIsSorted();
		
		//Check IncludeListBox has no duplicates
		eiPage.checkIncludeListBoxHasNoDuplicate();
	}
}
