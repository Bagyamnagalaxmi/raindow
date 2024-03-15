package selenium;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExperiencesProgrames {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	FileInputStream fisp = FileInputStream("C:\\Users\\user\\eclipse-workspace\\Myfirstpracticeselenium\\src\\selenium\\Property.properties");
	driver.get("http://localhost:8888/index.php?action=Login&module=Users");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("root");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[3]")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Madhuri pvt LTD");
	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[3]")).click();
	
	


	}

	private static FileInputStream FileInputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
