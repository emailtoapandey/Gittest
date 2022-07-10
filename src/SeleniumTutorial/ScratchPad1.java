package SeleniumTutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import scratchpad.hotloader.SeleniumScratchpad;

public class ScratchPad1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 
		 System.setProperty("webdriver.ie.driver", "C:\\Namita\\IEDriverServer_Win32_3.150.2\\IEDriverServer.exe");  
	    WebDriver driver=new InternetExplorerDriver();  
			
	    
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;   
				
      String appUrl = "http://172.27.16.219:8008/flsacwis/Sacwis.jsp";
      driver.get(appUrl);
      driver.manage().window().maximize();
      
          
      
      driver.findElement(By.id("username")).sendKeys("ap10232");
      
      
  driver.findElement(By.id("password")).sendKeys("Jan2022");
   driver.findElement(By.id("btnSubmit")).click();
   
   Thread.sleep(5000);
   
   System.out.println(driver.getPageSource());
      
      
  
         
      Thread.sleep(5000);
      
    
      
     
  //  WebElement mySelectElement = driver.findElement(By.name("LOGON_selectedUser"));
     
    // mySelectElement.click();
     
  //   ((JavascriptExecutor) driver).executeScript("return document.getElementById('LOGON_selectedUser').indexValue= '2' " );
      
 //     ((JavascriptExecutor) driver).executeScript("return document.getElementById('LOGON_selectedUser').value= '100200280' " );
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
     
    // driver.findElement(By.id("LOGON_selectedUser")).click();
     ((JavascriptExecutor) driver).executeScript("return document.getElementById('LOGON_selectedUser').value= '100200280' " );
     Thread.sleep(5000);
     
   //  driver.findElement(By.id("divWorkArea")).click();
     driver.findElement(By.id("btnContinue")).click();
     
  
     
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
     ((JavascriptExecutor)driver).executeScript("MenuItemClick('/flsacwis/sm/sm02/SM02_AccessReport?action=CREATE_HOTLINE_INTAKE&ACCESS_CD_ACCESS_TYPE=1&ACCESS_CD_INTL_SUB=1')");
     
    
     
     SeleniumScratchpad.start(driver);
     
     

	}

}
