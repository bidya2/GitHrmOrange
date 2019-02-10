package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

public class JobTitlesPage extends HomePage{

	public JobTitlesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="btnAdd")
	private WebElement btnAdd;
	
	@FindBy(id="btnDelete")
	private WebElement btnDelete;
	
	@FindBy(xpath="//a[.='manager']")
	private WebElement mgrJob;
	
	public void clickAddJob(){
		btnAdd.click();
	}
	
	public void clickDeleteJob(){
		btnDelete.click();
	}

	public void verifyJob(){
		checkElementIsPresent(mgrJob);
	}
}
