package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLeadPage clickCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLeadPage clickFirstName(String fName) {
		type(eleFirstName, fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLeadPage clickLastName(String lName) {
		type(eleLastName, lName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='primaryPhoneCountryCode'])[4]")
	private WebElement elecountrycode;
	
	public CreateLeadPage clickCountryCode(String code) {
		type(elecountrycode, code);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="( //input[@name='primaryPhoneNumber'])[4]")
	private WebElement elePhoneNumber;
	
	public CreateLeadPage clickPhoneNumber(String number) {
		type(elePhoneNumber, number);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='primaryEmail'])[4]")
	private WebElement eleEmail;
	
	public CreateLeadPage typeEmail(String mail) {
		type(eleEmail, mail);
		return this;
	}
	
	
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleSubmit;
	
	public ViewLead clickSubmit() {
		click(eleSubmit);
		return new ViewLead(driver,test);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
