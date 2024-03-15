package selenium;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Setsize {

	public static void main(String[] args) {
		// TODO Auto-generated method 
WebDriver driver=new EdgeDriver();
driver.get("https://www.amazon.com");
Point p=new Point(100,200);
driver.manage().window().setPosition(p);

	}

}
