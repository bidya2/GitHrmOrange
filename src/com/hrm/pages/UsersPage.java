package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

public class UsersPage extends HomePage{

	public UsersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="searchSystemUser_userType")
	private WebElement userRoleListBox;
	
	public void checkUserRoleListBoxIsSorted(){
		checkListBoxIsSorted(userRoleListBox, 1);
	}

}
