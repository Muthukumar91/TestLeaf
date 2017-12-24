package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	@BeforeClass
	public void getValue(){
		dataSheetName ="EditLead";
		testcase = "EditLead";
		testcasediscription = "Editing Company Name"; 
	    author = "Muthukumar";
	    cat ="smoke";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String fName ,String cName) throws InterruptedException {
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickFindLead()
		.clickFirstName(fName)
		.clickFindLeadsbutton()
		.clickFirstOptions()
		.clickEditbutton()
		.clickUpdateCompanyName(cName)
		.clickUpdate()
		.VerifyCompanyName(cName);
		
		
		
		
		
	}
}
