package Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flipkart {
	@Test
	public void sort(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize
				driver.manage().window().maximize();		
		//Load the URL
				driver.get("https://www.flipkart.com/");
				WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
				Actions builder = new Actions(driver);
				builder.moveToElement(electronics).build().perform();
				WebDriverWait wait = new WebDriverWait(driver, 10);
				WebElement ele= driver.findElementByXPath("//span[text()='Apple']");
				wait.until(ExpectedConditions.elementToBeClickable(ele));
				builder.click(ele).perform();
				
	}

}
