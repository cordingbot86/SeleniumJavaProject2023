package day02;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program03 {
	
      static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
		driver =new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placebolder='First Name']")).sendKeys("Test");
		screenShot("FirstName");
		driver.findElement(By.xpath("//input[@placebolder='Last Name']")).sendKeys("project");
		screenShot("LastName");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("kollem");
		screenShot("Adress");
		driver.findElement(By.xpath("//input[@value='female']")).click();
		screenShot("gender");

	}
	
	public static void screenShot(String fileName) throws IOException
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/"+fileName+".png");
		FileUtils . copyFile (src, des);
	
	}

}
