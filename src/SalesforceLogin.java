
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SalesforceLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://test.salesforce.com");
		driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("siddharthsingh@laingorourke.com.pgqaaus");
		driver.findElement(By.id("password")).sendKeys("Appirio@457");
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//input[@class=\"slds-input\"])[2]")).click();
	}
	

}
