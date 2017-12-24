package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	public static String id,error, name;
	
	public FindLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	public FindLeadsPage clickFirstName(String cName) {
		type(eleFirstName, cName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleFindLeads;
	
	public FindLeadsPage clickFindLeadsbutton() throws InterruptedException {
		click(eleFindLeads);
		Thread.sleep(3000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleselect;
	
	public ViewLead clickFirstOptions() {
		click(eleselect);
		
		return new ViewLead(driver,test);
	}

	@FindBy(how=How.XPATH,using="//label[contains(text(),'First name:')]/following::input")
	private WebElement eleLookupFirstName;
	
	public FindLeadsPage clickLookupFirstName(String cName) {
		type(eleLookupFirstName, cName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleLookupFindLeads;
	
	public FindLeadsPage clickLookupFindLeadsbutton() throws InterruptedException {
		click(eleLookupFindLeads);
		Thread.sleep(3000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleLookupselect;
	
	public SwitchToWindowPage clickLookupFirstOptions() {
		click(eleLookupselect);
		
		return new SwitchToWindowPage(driver,test);
	}

	@FindBy(how=How.XPATH,using="//label[contains(text(),'First name:')]/following::input")
	private WebElement eleLookupFirstName1;
	
	public FindLeadsPage clickLookupFirstName1(String cName) {
		type(eleLookupFirstName1, cName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleLookupFindLeads1;
	
	public FindLeadsPage clickLookupFindLeadsbutton1() throws InterruptedException {
		click(eleLookupFindLeads1);
		Thread.sleep(3000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")
	private WebElement eleLookupselect1;
	
	public SwitchToWindowPage clickLookupFirstOptions1() {
		click(eleLookupselect1);
		
		return new SwitchToWindowPage(driver,test);
	}

	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elephone;
	
	public FindLeadsPage clickphonetab() {
		click(elephone);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneCountryCode']")
	private WebElement elecode;
	
	public FindLeadsPage clickcode(String code) {
		type(elecode, code);
		
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elenumber;
	
	public FindLeadsPage clicknumber (String number) {
		type(elenumber, number);
	
		return this;
	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement elecapture;
	
	public FindLeadsPage captureid () {
		 id = elecapture.getText();
		 System.out.println(id);
		
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleid;
	
	public FindLeadsPage clickid() {
		type(eleid, id);
	   return this;
	}
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement eletext;
	
	public FindLeadsPage ViewErrorMessage () {
		error=eletext.getText();
		verifyPartialText(eletext, error);
		return this;
	}

	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailTab;
	
	public FindLeadsPage clickEmailTab() {
		click(eleEmailTab);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEmailAddress;
	
	public FindLeadsPage typeEmailAddress(String EmailAddress) {
		type(eleEmailAddress, EmailAddress);
	   return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")
	private WebElement elecapturename;
	
	public FindLeadsPage capturename () {
		 name = elecapturename.getText();
		 System.out.println(name);
		
		return this;
	}

	@FindBy(how=How.XPATH,using="//span[@id='viewLead_firstName_sp']")
	private WebElement eleLeadName;
	public ViewLead VerifyDuplicateLeadName() {
		verifyPartialText(eleLeadName, name);
		return new ViewLead(driver, test);
		
	}

}

	

