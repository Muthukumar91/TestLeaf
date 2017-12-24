package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	/*public EditLeadPage gettitle(){
	verifyTitle("View Lead | opentaps CRM");
    return this;
	}*/
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleUpdateCompanyName;
	
	public EditLeadPage clickUpdateCompanyName(String compname) {
		type(eleUpdateCompanyName, compname);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='submitButton'])[1]")
	private WebElement eleUpdate;
	public ViewLead clickUpdate() {
		click(eleUpdate);
		return new ViewLead(driver,test);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
