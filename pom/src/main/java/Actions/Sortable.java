package Actions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sortable {
	@Test
	public void sort(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize
				driver.manage().window().maximize();		
		//Load the URL
				driver.get("http://jqueryui.com/draggable/");
				
				WebElement sort = driver.findElementByLinkText("Sortable");
				sort.click();
				WebElement demo = driver.findElementByClassName("demo-frame");
				
				// switch to the frame
				driver.switchTo().frame(demo);
				
				WebElement item= driver.findElementByXPath("//li[text()='Item 1']");
				Point loc= item.getLocation();
				System.out.println(loc);
				
				WebElement item1= driver.findElementByXPath("//li[text()='Item 4']");
				Point loc1= item1.getLocation();
				int x = item1.getLocation().getX();
				int y= item1.getLocation().getY();
				System.out.println(loc1);
				Actions builder = new Actions(driver);
				builder.dragAndDropBy(item, x, y).build().perform();
				driver.switchTo().defaultContent();
				//driver.close();
			
	}

}
