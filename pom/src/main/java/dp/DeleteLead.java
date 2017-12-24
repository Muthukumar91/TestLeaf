package dp;


import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;


import wdMethods.ProjectMethods;


public class DeleteLead extends ProjectMethods {

	@Test (dataProvider ="fetchData")
	public void deleteLead(String cd, String number) throws InterruptedException {
		
		
		WebElement lead = locateElement("link", "Leads");
		click(lead);
		
		WebElement findLead = locateElement("link", "Find Leads");
		click(findLead);
		
		WebElement phone = locateElement("link", "Phone");
		click(phone);
		
		WebElement code = locateElement("xpath", "//*[@id='ext-gen262']");
		type(code, cd);
		
		WebElement num = locateElement("xpath", "//*[@id='ext-gen270']");
		type(num, number);
		
		
		WebElement find = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(find);
		
		Thread.sleep(3000);
		
		WebElement click = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(click);
		
		WebElement dele = locateElement("link", "Delete");
		click(dele);
	

	}

	/*@DataProvider(name = "fetchData")
	public Object[][]  getdata(){
		Object[][] data = new Object[2][2];
		data[0][0] = "91";
		data[0][1] = "9962457576";
		data[1][0] = "91";
		data[1][1] = "9962457576";
		return data;	

	}
*/}


