package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new EdgeDriver();
    driver.get("https://www.google.com");
    driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("magneq software");
    Thread.sleep(2000);
    
  System.out.println(all.size());
    for(int i=0;i<all.size();i++) {
    	System.out.println(all.get(i).getText());
    	
    }
   /*Thread.sleep(2000);
    all.get(3).click;*/
    for(int i=0;i<all.size();i++) {
    	if(all.get(i).getText().contains("magneq software reviews")) {
    		all.get(i).click();
    		
    	}
    }
	}

}
