package com.hrm.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;

public class Test1 extends BaseTest{
	
	@Test(priority=6)
	public void testing(){
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.clickLeaveListImg();
		
		String xp="//a[@class='toggle tiptip']";
		WebElement leaveList=driver.findElement(By.xpath(xp));
		Actions actions=new Actions(driver);
		actions.moveToElement(leaveList).perform();
		
		
		
	}
	

}
