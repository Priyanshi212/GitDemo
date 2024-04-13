

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PaytmFlights {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://tickets.paytm.com/flights/");
		driver.findElement(By.id("srcCode")).click();
		driver.findElement(By.id("text-box")).clear();
		//Thread.sleep(20);
		driver.findElement(By.id("text-box")).sendKeys("JAI");
		Select srcObj=new Select(driver.findElement(By.id("text-box")));
		srcObj.selectByVisibleText("JAI");

	}

}
