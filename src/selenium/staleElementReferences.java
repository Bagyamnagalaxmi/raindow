package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class staleElementReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com");
// refresh the page
driver.navigate().refresh();
WebElement UN=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
UN.sendKeys("nagalaxmi123@gmail.com");
System.out.println("Boss iam Queen");

	}

}
