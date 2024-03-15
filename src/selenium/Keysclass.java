package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Keysclass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://facebook.com");
Thread.sleep(3000);
driver.findElement(By.id("email")).sendKeys("surajkamalskg@gmail.com",Keys.TAB,"Suraj@123",Keys.ENTER);

	}

}
