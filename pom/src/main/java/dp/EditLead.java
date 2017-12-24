package dp;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;



public class EditLead extends ProjectMethods  {
	
	@Test (dataProvider ="fetchData")
	public  void Find(String name, String compname) throws InterruptedException 
	{
	
	WebElement lead = locateElement("link", "Leads");
	click(lead);
	
	WebElement find = locateElement("link", "Find Leads");
	click(find);
	
	WebElement fromLead =locateElement("xpath", "(//input[@name='firstName'])[3]");
	type(fromLead, name);
	
	WebElement findLead =locateElement("xpath", "//button[contains(text(),'Find Leads')]");
	click(findLead);
	
	Thread.sleep(3000);
	WebElement first =locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	click(first);
	

    verifyTitle("View Lead | opentaps CRM");
    
    WebElement Edit = locateElement("link", "Edit");
	click(Edit);
    
	WebElement comp = locateElement("id", "updateLeadForm_companyName");
	type(comp, compname);
	
	WebElement update =locateElement("xpath", "(//input[@name='submitButton'])[1]");
	click(update);
	
	WebElement check = locateElement("xpath", "//*[@id='viewLead_companyName_sp']");
	verifyExactText(check ,"Pacific E-Solution");
	
	
	}
	
	@DataProvider(name = "fetchData")
	public Object[][]  getdata(){
		Object[][] data = new Object[2][2];
		data[0][0] = "Muthukumar";
		data[0][1] = "Pacific E-Solution";
		data[1][0] = "Muthukumar";
		data[1][1] = "Pacific E-Solution";
		return data;	
	}


	
}

