package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Childclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.flipkart.com");
driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobiles under20000");

driver.findElement(By.xpath("//button[@type='submit']")).click();

driver.findElement(By.xpath("//div=[@class='_4rR01T']")).click();
Thread.sleep(3000);
   String mainwindowtit=driver.getTitle();
   Thread.sleep(3000);
   Set<String>allwin=driver.getWindowHandles();
		  System.out.println();
		   
   
	}

}