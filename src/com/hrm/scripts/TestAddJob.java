package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddJobTitlePage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.JobTitlesPage;

public class TestAddJob extends BaseTest{
	
	@Test(priority=6)
	
	public void addJob(){
		
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickAdmin_Menu();
		
		dbPage.clickJob_Menu();
		
		dbPage.clickJobTitles();
		
		JobTitlesPage jtPage = new JobTitlesPage(driver);
		jtPage.clickAddJob();
		
		AddJobTitlePage ajtPage=new AddJobTitlePage(driver);
		ajtPage.setJobTitle("manager");
		ajtPage.clickbtnSave();
		
		jtPage.verifyJob();
	}
	
	
	
	
}
