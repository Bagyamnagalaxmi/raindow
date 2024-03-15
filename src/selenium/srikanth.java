package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class srikanth {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("sreekanth");
	Thread.sleep(2000);
	List<WebElement>all=driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	System.out.println(all.size());
	for(int i=0;i<all.size();i++) {
	System.out.println(all.get(i).getText());
	}
    for(int i=0;i<all.size();i++) {
    	if(all.get(i).getText().contains("sreekanth age")) {
    		all.get(i).click();
    		break;
    	}
    }
	}
}

