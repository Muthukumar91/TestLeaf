package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="(//span[@id='viewLead_firstName_sp'])[1]")
	private WebElement eleVerify;
	
	public MyHomePage clickVerifyFirstName(String expectedText) {
	verifyExactText(eleVerify, expectedText);
		
		
		return new MyHomePage(driver,test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEdit;
	
	public EditLeadPage clickEditbutton(){
		click(eleEdit);
		return new EditLeadPage(driver,test);
	}
	     
    
	@FindBy(how=How.XPATH,using="//*[@id='viewLead_companyName_sp']")
	private WebElement eleVerifyCompanyName;
	
	public ViewLead VerifyCompanyName(String expectedText) {
		verifyPartialText(eleVerifyCompanyName, expectedText);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDelete;
	
	public MyLeadPage clickDeletebutton(){
		click(eleDelete);
		return new MyLeadPage(driver,test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicate;
	
	public DuplicateLeadPage clickDuplicateLeadbutton(){
		click(eleDuplicate);
		return new DuplicateLeadPage(driver,test);
	}
	
	
}