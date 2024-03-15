package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonaddtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.amazon.com");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("diary milk");
	//click on search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		//click on dairy milk
		//driver.findElement(By.linkText("Cadbury Dairy Milk Silk Hazelnut Chocolate Bar, 143 g (Pack of 3)")).click();
	}

}
