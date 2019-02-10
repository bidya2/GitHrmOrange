package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

public class AddJobTitlePage extends HomePage{

	public AddJobTitlePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="jobTitle_jobTitle")
	private WebElement jobTitle;
	
	@FindBy(id="btnSave")
	private WebElement btnSave;
	
	public void setJobTitle(String jobTitleTxt){
		jobTitle.sendKeys(jobTitleTxt);
	}
	
	public void clickbtnSave(){
		btnSave.click();
	}
}
