package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.flipkart.com");

driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("dairy milk");
driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
driver.findElement(By.xpath("//a[@title='Cadbury Dairy Milk Chocolate Home Treats, 119 g Bars']")).click();
//move to child window and quantity number should be selected

//Thread.sleep(3000);

	}

}
