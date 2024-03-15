package selenium;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.noneDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PraticeFB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("BAGYAM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("NAGALAXMI");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("7993419164");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Suraj@123");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("29");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
		driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]")).sendKeys("1999");
	driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
	driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _6o _6v']")).click();
		
	
	}

}
