package selenium;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTittle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com");
org.openqa.selenium.Dimension d=new Dimension(100,200);
driver.manage().window().setSize(d);
String tittle=driver.getTitle();
System.out.println(tittle); 
	}

}
