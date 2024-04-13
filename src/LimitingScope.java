import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LimitingScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Print all the links present in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Print all the links at footer section
		WebElement footerSection=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerSection.findElements(By.tagName("a")).size());
		
		//Print all the link on the footer left most link
        WebElement footerLeftMost=driver.findElement(By.xpath("//table[@class=\"gf-t\"]/tbody/tr/td[1]/ul"));
        System.out.println(footerLeftMost.findElements(By.tagName("a")).size());
        
        Actions a=new Actions(driver);
        
        //click on the footLeftMost links
        for(int i=1;i<footerLeftMost.findElements(By.tagName("a")).size();i++) {
        	a.keyDown(Keys.CONTROL).click(footerLeftMost.findElements(By.tagName("a")).get(i)).keyUp(Keys.CONTROL).build().perform();
        	System.out.println(i);
        	
        }
        
	}

}
