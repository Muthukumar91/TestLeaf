package dp;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;




public class Merge extends ProjectMethods {

	@Test (dataProvider = "fetchData")
	public  void merge() throws InterruptedException {
		
				
				
				
				WebElement lead = locateElement("link", "Leads");
				click(lead);
				
				WebElement merge = locateElement("link", "Merge Leads");
				click(merge);
				
				WebElement fromLead =locateElement("xpath", "(//img[@alt='Lookup'])[1]");
				click(fromLead);
				
				switchToWindow(1);
				
				WebElement id = locateElement("xpath", "//label[contains(text(),'First name:')]/following::input");
				type(id, "muthu");
				
				WebElement find1 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
				click(find1);
				
				Thread.sleep(3000);
				
				WebElement click1 = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
				click(click1);
				
				switchToWindow(0);
				
				WebElement toLead = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
				click(toLead);
				
				switchToWindow(1);
				
				WebElement id1 = locateElement("xpath", "//label[contains(text(),'First name:')]/following::input");
				type(id1, "muthu");
				
				WebElement find2 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
				click(find2);
				
				Thread.sleep(3000);
				
				WebElement click2 = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a");
				click(click2);
				
				switchToWindow(0);
				
				WebElement mer = locateElement("link", "Merge");
				click(mer);
				Thread.sleep(3000);
				getAlertText();
				acceptAlert();
			
				

			}
	@DataProvider(name = "fetchData")
	public Object[][]  getdata(){
		Object[][] data = new Object[2][2];
		data[0][0] = "muthukumar";
		data[0][1] = "muthu";
		data[1][0] = "muthu";
		data[1][1] = "muthukumar";
		return data;	

		}

}

	


