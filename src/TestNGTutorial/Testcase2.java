package TestNGTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

public class Testcase2 {

	@Test
	public void Test1() throws InterruptedException 
	
	{
		System.setProperty("IE_DRIVER_EXE_PROPERTY", "C:\\Users\\AlokPandey\\Downloads\\edgedriver_win64_raj\\msedgedriver.exe");
		
		InternetExplorerDriverService ieService = InternetExplorerDriverService.createDefaultService();
		InternetExplorerOptions ieOptions = new InternetExplorerOptions();
		ieOptions.setCapability("ie.edgepath", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		 ieOptions.setCapability("ie.edgechromium", true);
		 WebDriver driver = new InternetExplorerDriver(ieService, ieOptions);
			
		    String appUrl = "http://172.27.16.219:8008/flsacwis/Sacwis.jsp";
					
					
					
				//	String appUrl = "C://Users//AlokPandey//Desktop//HTML//ProfileSelect.html" ;
							
					//file:///C:/Users/AlokPandey/Desktop/HTML/ProfileSelect.html
		       driver.get(appUrl);
		       driver.manage().window().maximize();
		       
		       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		       
		      driver.findElement(By.id("username")).sendKeys("AP10232	");
		      driver.findElement(By.id("password")).sendKeys("Feb2022");
		      driver.findElement(By.id("btnSubmit")).click();
		System.out.println("this is my first tets case");
		
	}
	
	@Test
	
	public void Demo1()
	
	{
		System.out.println("this is my second  tets case");
		
	}
}
