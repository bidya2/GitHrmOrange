package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

public class LeaveListPage extends HomePage{

	public LeaveListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@class='toggle tiptip']")
	private WebElement leaveList;
	
	@FindBy(xpath="//div[@id='tiptip_content']")
	private WebElement tooltipHideOptions;
	
	public void mouseHoverLeaveList(){
		Actions actions=new Actions(driver);
		actions.moveToElement(leaveList).perform();
	}
	
	public void checkToolTipHideOptions(){
		String aToolTip=tooltipHideOptions.getText();
		log.info(aToolTip);
		if(aToolTip.equals("Hide Options"))
			log.info("Hide Options tooltip is displayed");
		else
			log.info("Hide Options tooltip is not displayed");
		
	}
	
	

}
