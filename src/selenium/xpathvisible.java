package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathvisible {

	public static void main(String[] args) {
		
	 WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhavani6986@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Balu@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
}


	}

