package dp;





import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;


import utils.ExcelDataProvider;
import wdMethods.ProjectMethods;



public class CreateLead extends ProjectMethods {
	
	@Test (dataProvider="CreateLead")
	public void create(String cname, String fname, String lname)
	{
	
	WebElement lead = locateElement("link", "Create Lead1");
	click(lead);
	
	WebElement comp = locateElement("id", "createLeadForm_companyName");
	type(comp, cname);
	
	WebElement first = locateElement("id", "createLeadForm_firstName");
	type(first, fname);

	WebElement last = locateElement("id", "createLeadForm_lastName");
	type(last, lname);
	
	WebElement code = locateElement("id", "createLeadForm_primaryPhoneCountryCode");
	type(code, "91");
	
	WebElement phone = locateElement("id", "createLeadForm_primaryPhoneNumber");
	type(phone, "9962457576");
	
		
	WebElement sub = locateElement("class", "smallSubmit");
	click(sub);
	
	
	}
	
	/*@DataProvider(name = "CreateLead1")
	public Object[][]  getdata(){
	Object[][] data = new Object[2][3];
		data[0][0] = "PES";
		data[0][1] = "Muthukumar";
		data[0][2] = "Mahadevan";
		data[1][0] = "PES";
		data[1][1] = "Muthukumar";
		data[1][2] = "Mahadevan";
		return data;	
	}*/
	
	
	/*@DataProvider(name = "CreateLead")
	
	public String[][]  getExcelData() throws InvalidFormatException, IOException{
		
		ReadExcel data=new ReadExcel();
	    String [][] array =data.readexcel();
	    return array;	
	}*/
	
	@DataProvider(name="CreateLead")
public String[][]  ex(){
		
	
	ExcelDataProvider excel= new ExcelDataProvider();
	String [][] array= excel.getExcelData("CreateLead");
	return array; 
	
	}

}