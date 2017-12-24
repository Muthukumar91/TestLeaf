package Actions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable {
	@Test
	public void drag(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize
				driver.manage().window().maximize();		
		//Load the URL
				driver.get("http://jqueryui.com/draggable/");
				
				
				WebElement demo = driver.findElementByClassName("demo-frame");
				
				// switch to the frame
				driver.switchTo().frame(demo);
				
				
			
				WebElement drag = driver.findElementById("draggable");
				Point loc= drag.getLocation();
				System.out.println(loc);
				
				Actions builder= new Actions(driver);
				builder.dragAndDropBy(drag, 150, 150).perform();
				
				WebElement drag1 = driver.findElementById("draggable");
				Point loc1= drag1.getLocation();
				System.out.println(loc1);
				
				driver.quit();

	}

}

