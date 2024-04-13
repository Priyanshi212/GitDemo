import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assigment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("john");
		driver.findElement(By.name("email")).sendKeys("john@test.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("testing7676");
		driver.findElement(By.id("exampleCheck1")).click();
		Select selObj=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		selObj.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@value=\'option1\']")).click();
		driver.findElement(By.xpath("(//input[@class=\'form-control\'])[2]")).sendKeys("02/29/2024");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
