package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDivisionpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method 
WebDriver driver=new EdgeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();

	}

}
