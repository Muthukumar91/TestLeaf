package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement eleFromLeadLookup;
	
	public SwitchToWindowPage FromLeadLookup() {
		click(eleFromLeadLookup);
		return new SwitchToWindowPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleFromLeadLookup1;
	
	public SwitchToWindowPage FromLeadLookup1() {
		click(eleFromLeadLookup1);
		return new SwitchToWindowPage(driver, test);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMerge;
	
	public AlertPage ClickMerge() throws InterruptedException {
		click(eleMerge);
		Thread.sleep(3000);
		return new AlertPage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
