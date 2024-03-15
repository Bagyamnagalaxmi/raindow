package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingwithfileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		Thread.sleep(3000);
		driver.

	}

}
