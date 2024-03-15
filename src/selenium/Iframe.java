package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
//switch the frame
driver.switchTo().frame("iframe result");
driver.findElement(By.xpath("(//div[@id='div1'])[1]")).clear();
}
	}


