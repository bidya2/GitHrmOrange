package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.LeaveListPage;

public class TestHideOptions extends BaseTest{
	
	@Test(priority=7)
	
	public void testHideOptions(){
		
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickLeaveListImg();
		
		LeaveListPage llPage=new LeaveListPage(driver);
		llPage.mouseHoverLeaveList();
		llPage.checkToolTipHideOptions();
	}
}
