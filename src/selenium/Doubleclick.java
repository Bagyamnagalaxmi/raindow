package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		WebElement gmail=driver.findElement(By.xpath("//a[@class='gb_H']"));
		Actions a=new Actions(driver);
		a.moveToElement(gmail).doubleClick().perform();

	}

}
