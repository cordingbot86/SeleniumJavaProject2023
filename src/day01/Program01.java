package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placebolder='First Name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@placebolder='Last Name']")).sendKeys("project");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("kollem");
		
		driver.findElement(By.xpath("//input[@placebolder='FirstName']")).click();
		driver.findElement(By.xpath("//input[@value='female']")).click();
	}

}
