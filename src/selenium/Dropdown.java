package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	//create day add
	
Thread.sleep(3000);
WebElement day=driver.findElement(By.xpath("//select[@id='day']"));

Thread.sleep(3000);
Select s=new Select(day);
Thread.sleep(3000);
s.selectByVisibleText("29");
Thread.sleep(3000);

//add month
WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
Thread.sleep(2000);
Select select=new Select(month);
s.selectByVisibleText("Mar");
Thread.sleep(3000);

	}

}
