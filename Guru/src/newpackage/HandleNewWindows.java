package newpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleNewWindows {

		public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
			
			String handle = driver.getWindowHandle();
			//System.out.println("nnn");
			//System.out.println(handle);
			
			driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();
			Set<String> handles = driver.getWindowHandles();
			
			System.out.println(handles);
			  // Pass a window handle to the other window
			 
	        for (String handle1 : handles) {
 
	        	System.out.println("windowname : "+ handle1);
 
	        	//driver.switchTo().window(handle1);
 
	        	}
	        
	        Thread.sleep(3000);
 
	        // Closing Pop Up window
 
	        driver.close();
 
	        // Close Original window
 
	        driver.quit();
	        
		}
}
