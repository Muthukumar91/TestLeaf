package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	@BeforeClass
	public void getValue(){
		dataSheetName ="CreateLead";
		testcase = "CreateLead";
		testcasediscription = "Creating Leads"; 
	    author = "Muthukumar";
	    cat ="smoke";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName, String code, String number, String email) {
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickCreateLead()
		.clickCompanyName(cName)
		.clickFirstName(fName)
		.clickLastName(lName)
		.clickCountryCode(code)
		.clickPhoneNumber(number)
		.typeEmail(email)
		.clickSubmit()
		.clickVerifyFirstName(fName);
		
	}
}
