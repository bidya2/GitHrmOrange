package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddEmpPage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpInfoPage;
import com.hrm.pages.PersonalDetailsPage;

public class TestAddDeleteEmployee extends BaseTest{
	
	@Test(priority=4)

	public void testAddDeleteEmp(){
//	1. Click on PIM in Home Page		
	DashboardPage dbPage=new DashboardPage(driver);
	dbPage.clickPIM_Menu();
	
	
//	2. Click on Add Employee
	EmpInfoPage eiPage=new EmpInfoPage(driver);
	eiPage.clickAddEmployee();
//	3. Enter first name
	AddEmpPage aPage = new AddEmpPage(driver);
	aPage.setFirstName("Chandu");
//	4. Enter last name
	aPage.setLastName("Indu");
	
//	5. Click on Save
	aPage.clickSave();
	
//	6. Verify that first name is same as the value entered while creating the employee
	PersonalDetailsPage pdPage= new PersonalDetailsPage(driver);
	pdPage.verifyFirstLastName("Chandu","Indu");

	
//	7. Get the employee id (dynamic element)
	String eID=pdPage.getEmpId();
	
//	8. Click on Employee List
	eiPage.clickEmpListMenu();
	
//	9. Select the checkbox of employee	based on employee id (Independent dependent xpath)
	eiPage.selectEmpCheckBox(eID);
	
//	10. Click on Delete
	eiPage.deleteEmp();
	
//	11. Click Ok on the pop-up
	eiPage.clickOK();
	
//	12. Verify that deleted employee is not present in the tables
	eiPage.checkEmpIsDeleted(eID);

	}
}
	
