package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myselenium {
      public static void main(String[] args) {
		
	 
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Bhagyam bhavani");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Naga@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}