package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.w3schools.");
WebElement srcele=driver.findElement(By.xpath("(//div[@id='div1'])[1]"));
WebElement drcele=driver.findElement(By.xpath("(//div[@id='div2'])[1]"));
Actions a=new Actions(driver);
a.dragAndDrop(srcele, drcele).perform();

	}

}
