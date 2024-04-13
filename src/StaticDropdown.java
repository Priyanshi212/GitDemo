import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Select objSelect=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		objSelect.selectByVisibleText("AED");
		System.out.println(objSelect.getFirstSelectedOption().getText());
		driver.close();
		
		

		

	}

}
