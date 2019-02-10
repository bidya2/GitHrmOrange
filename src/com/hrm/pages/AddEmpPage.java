package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmpPage extends EmpInfoPage{
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="btnSave")
	private WebElement btnSave;
	

	
	public AddEmpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void setFirstName(String fn){
		firstName.sendKeys(fn);
	}
	
	public void setLastName(String ln){
		lastName.sendKeys(ln);
	}
	
	public void clickSave(){
		btnSave.click();
	}

	
}
