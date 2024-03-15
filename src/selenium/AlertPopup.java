package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
driver.findElement(By.xpath("//input[@name='submit']")).click();
//click on ok button
//driver.switchto alert
//String t=driver.switchTo().alert().getText();
//System.out.println(t);
//driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
	}

}
