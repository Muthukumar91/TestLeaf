package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{
	@BeforeClass
	public void getValue(){
		dataSheetName ="MergeLead";
		testcase = "MergeLead";
		testcasediscription = "Merging two Leads"; 
	    author = "Muthukumar";
	    cat ="smoke";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String fName,String sName) throws InterruptedException {
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickMergeLeads()
		.FromLeadLookup()
		.switchToFirstWindow()
		.clickLookupFirstName(fName)
		.clickLookupFindLeadsbutton()
		.clickLookupFirstOptions()
		.switchToHomeWindow()
		.FromLeadLookup1()
		.switchToFirstWindow()
		.clickLookupFirstName1(sName)
		.clickLookupFindLeadsbutton1()
		.clickLookupFirstOptions1()
		.switchToHomeWindow()
		.ClickMerge()
		.acceptAlertOptions();
		
		
	}
}
