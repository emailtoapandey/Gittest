package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NamitaTest {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\Namita\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Namita\\chromedriver_win32\\chromedriver.exe");  
		
	//	 WebDriver driver = new FirefoxDriver();
		
	  //  WebDriver driver=new ChromeDriver();  
		
				
			 
		 System.setProperty("webdriver.ie.driver", "C:\\Namita\\IEDriverServer_Win32_3.150.2\\IEDriverServer.exe");  
			WebDriver driver=new InternetExplorerDriver();  
			
	       
				
         String appUrl = "https://accounts.google.com";
         driver.get(appUrl);
         driver.manage().window().maximize();
         

	}

}
