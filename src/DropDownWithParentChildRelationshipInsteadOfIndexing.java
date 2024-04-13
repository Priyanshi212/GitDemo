import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDownWithParentChildRelationshipInsteadOfIndexing {


public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub


WebDriver driver =new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
Thread.sleep(2000L);
driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);


//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//
//driver.findElement(By.xpath("//a[@value='BLR']")).click();
//
//Thread.sleep(2000);
//
////driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//
//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//
//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//driver.close();
}


}

