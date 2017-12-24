package Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.jsoup.select.Evaluator.ContainsOwnText;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize
				driver.manage().window().maximize();	
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get("https://erail.in/");
				driver.findElementById("txtStationFrom").clear();
				driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
				driver.findElementById("txtStationTo").clear();
				driver.findElementById("txtStationTo").sendKeys("NCJ", Keys.TAB); 
				WebElement table=driver.findElementByXPath("//table[@class='DataTable TrainList']");
				List<WebElement> row=table.findElements(By.tagName("tr"));
				System.out.println(row.size());
				int i = 0;
				String ele="";
				List<String>item=new ArrayList<String>();
				for (i=0; i<=row.size()-1; i++)
				{
					if (row.get(i).findElements(By.tagName("td")).size()>0){
					ele =row.get(i).findElements(By.tagName("td")).get(1).getText();
					item.add(ele);
				}
				}
				Collections.sort(item);
				System.out.println(item);
	
				driver.findElementByLinkText("Train Name").click();
				Thread.sleep(2000);
				WebElement table1=driver.findElementByXPath("//table[@class='DataTable TrainList']");
				List<WebElement> row1=table1.findElements(By.tagName("tr"));
				System.out.println(row1.size());
				
				int j = 0;
				String ele1="";
				List<String>item1=new ArrayList<String>();
				for (j=0; j<=row1.size()-1; j++)
				{
					if (row1.get(j).findElements(By.tagName("td")).size()>0){
					ele1 =row1.get(j).findElements(By.tagName("td")).get(1).getText();
					item1.add(ele1);
				}
				}
				Collections.sort(item1);
				System.out.println(item1);
	
		if (item.equals(item1))
			System.out.println("Train Name matched");
		else
			System.out.println("Train Name not matched");
				
				
				
	}

}
