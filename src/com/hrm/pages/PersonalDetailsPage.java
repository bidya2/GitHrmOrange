package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetailsPage extends AddEmpPage{

	@FindBy(id="personal_txtEmpFirstName")
	private WebElement empFirstName;
	
	@FindBy(id="personal_txtEmpLastName")
	private WebElement empLastName;
	
	@FindBy(id="personal_txtEmployeeId")
	private WebElement employeeId;
	
	
	public PersonalDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	
	public void verifyFirstLastName(String expFirstName, String expLastName){
		if(expFirstName.equals(empFirstName.getAttribute("Value")) && expLastName.equals(empLastName.getAttribute("Value")))
		{
			System.out.println("Employee saved successfully");
		}
		else
		{
			System.out.println("Mismatch in first or last name");
		}
	}
	
		
	public String getEmpId(){
		String eID=employeeId.getAttribute("Value");
		System.out.println("Emp id is "+eID);
		return eID;
	}
		
}
