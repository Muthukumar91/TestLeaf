package pages;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class SwitchToWindowPage extends ProjectMethods{
	
	public SwitchToWindowPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	public FindLeadsPage switchToFirstWindow() {
		switchToWindow(1);
		return new FindLeadsPage(driver, test);
	}
	
	public MergeLeadPage switchToHomeWindow() {
		switchToWindow(0);
		return new MergeLeadPage(driver, test);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
