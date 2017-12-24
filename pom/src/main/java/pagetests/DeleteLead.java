package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class DeleteLead extends ProjectMethods{
	@BeforeClass
	public void getValue(){
		dataSheetName ="DeleteLead";
		testcase = "DeleteLead";
		testcasediscription = "Deleting Leads"; 
	    author = "Muthukumar";
	    cat ="smoke";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String fName,String sName) throws InterruptedException {
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickFindLead()
		.clickphonetab()
		.clickcode(fName)
		.clicknumber(sName)
		.clickFindLeadsbutton()
		.captureid()
		.clickFirstOptions()
		.clickDeletebutton()
		.clickFindLead()
		.clickid()
		.clickFindLeadsbutton()
		.ViewErrorMessage();
		
		
	
		
		
	}
}
