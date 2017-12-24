package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
	@BeforeClass
	public void getValue(){
		dataSheetName ="DuplicateLead";
		testcase = "Duplicate Lead";
		testcasediscription = "Duplicating Leads"; 
	    author = "Muthukumar";
	    cat ="smoke";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String fName) throws InterruptedException {
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickFindLead()
		.clickEmailTab()
		.typeEmailAddress(fName)
		.clickFindLeadsbutton()
		.capturename()
		.clickFirstOptions()
		.clickDuplicateLeadbutton()
		.verifyPageTitle()
		.clickSubmit()
		.VerifyDuplicateLeadName();
		
		
		
		
		
		
		
	
		
		
	}
}
