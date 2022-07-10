package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		 System.setProperty("webdriver.ie.driver", "C:\\Namita\\IEDriverServer_Win32_3.150.2\\IEDriverServer.exe");  
			WebDriver driver=new InternetExplorerDriver();  
			
			
			driver.get("https://www.gmail.com");
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("namitatiwri8");
			
	}

}
