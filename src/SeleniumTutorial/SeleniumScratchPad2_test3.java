package SeleniumTutorial;

import java.util.ArrayList;
import org.openqa.selenium.Cookie;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.AbstractAnnotations;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import scratchpad.hotloader.SeleniumScratchpad;

public class SeleniumScratchPad2_test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Namita\\IESERVER\\IEDriverServer.exe");  
		
	    WebDriver driver=new InternetExplorerDriver();  
		
			
			 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;   
				
       String appUrl = "http://172.27.16.219:8006/flsacwis/Sacwis.jsp";
       
       driver.get(appUrl);
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       
      
       
       driver.findElement(By.id("username")).sendKeys("ap10232");
       
       
   driver.findElement(By.id("password")).sendKeys("Feb2022");
    driver.findElement(By.id("btnSubmit")).click();
       
    
   
    driver.manage().window().maximize();
    
    
   //To get the List of cookes
  // Set<Cookie> cookiesList =  driver.manage().getCookies();
  //  for(Cookie getcookies :cookiesList) {
  //     System.out.println(getcookies);
    
  //     }
    
  //  To get the cookei of single login 
    
    Cookie cookieValue = driver.manage().getCookieNamed("JSESSIONID");
    System.out.println(cookieValue.getValue());
    
             
       Thread.sleep(5000);
       
       driver.findElement(By.xpath(".//*[@id='LOGON_selectedUser']")).click();

       Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='LOGON_selectedUser']")));
       List <WebElement> op = dropdown.getOptions();
       
      
       int size = op.size();
       for(int i =0; i<size ; i++){
          String options = op.get(i).getText();
          System.out.println(options);
       }
       
       driver.findElement(By.xpath(".//*[@id='LOGON_selectedUser']")).sendKeys(Keys.ARROW_DOWN);
       driver.findElement(By.xpath(".//*[@id='LOGON_selectedUser']")).sendKeys(Keys.ENTER);
  
         
 
     Thread.sleep(5000);
    

 driver.findElement(By.id("btnContinue")).click();
 
   Thread.sleep(5000);
   
   
     WebElement el= driver.findElement(By.id("create"));
    
      Actions actions = new Actions(driver);
      
     //API for adding a new cookie.
      driver.manage().addCookie(cookieValue); 
      
      actions.sendKeys(el, Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
    
      //Clicking on Create Intake
    
   
      new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(3));
      Set<String> allWindowHandles = driver.getWindowHandles();
      System.out.println(allWindowHandles);
      
      String lastwindow = "";
       String secondwindow="";
     
      for(String handle : allWindowHandles)
     	
      {
      System.out.println("Switching to window - > " + handle);
      
         //Thread.sleep(5000);
          driver.switchTo().window(handle);
           
          System.out.println(driver.getTitle());
          if ("Intake".equalsIgnoreCase(driver.getTitle()))
        	  secondwindow=handle;
          
          if ("Intake Inquiry Search".equalsIgnoreCase(driver.getTitle()))
          lastwindow=handle;
          
             
      }
           
      
      driver.switchTo().window(lastwindow);
      
      System.out.println(driver.getTitle());
     
      driver.switchTo().frame("jspFrame");
      
               
      driver.findElement(By.id("btnClose")).click();
      
      new WebDriverWait(driver,40).until(ExpectedConditions.numberOfWindowsToBe(2)); 
      
      
      driver.switchTo().window(secondwindow);
      Thread.sleep(4000);
      System.out.println(driver.getTitle());
      
      driver.findElement(By.name("accessDtRcvdTime")).sendKeys("10:10");
      
    //  driver.findElement(By.name("AD_RPTR_CALL_ID")).sendKeys("abc");
      
     // driver.switchTo().frame("jspFrame");
      
      Thread.sleep(4000);
      
	          
      driver.findElement(By.xpath("//*[@id=\"Expando\"]")).click();
      driver.findElement(By.xpath("//input[@name='FL_CALLER_ID']")).click();
      
      driver.findElement(By.id("SM02_AccessReport_ACCESS_CD_RPTR_DSCR")).click();
      
      driver.findElement(By.id("SM02_AccessReport_ACCESS_CD_RPTR_DSCR")).sendKeys(Keys.ARROW_DOWN);
      driver.findElement(By.id("SM02_AccessReport_ACCESS_CD_RPTR_DSCR")).sendKeys(Keys.ENTER);
    
      driver.findElement(By.id("tabAllegation")).click();
      
      driver.findElement(By.xpath("//*[@id=\"divAllegation\"]/fieldset[3]/div/table/tbody/tr[2]/td/textarea")).sendKeys("test");
      
     // System.out.println(driver.getPageSource());
      
      
     // driver.findElement(By.name("Describe Allegation Narrative Required")).sendKeys("test");
      
      Thread.sleep(4000);
      
      driver.findElement(By.id("divBtnInsertAllegation")).click();
      
            
      new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(3));
      Set<String> allWindowHandles1 = driver.getWindowHandles();
      System.out.println(allWindowHandles1);
      
      String lastwindow1 = "";
       
     
      for(String handle1 : allWindowHandles1)
     	
      {
      System.out.println("Switching to window - > " + handle1);
      
         //Thread.sleep(5000);
          driver.switchTo().window(handle1);
           
            if ("FSFN".equalsIgnoreCase(driver.getTitle()))
          lastwindow1=handle1;
          
             
      }
           
      
     driver.switchTo().window(lastwindow1);
      
     System.out.println(driver.getTitle());
     
     driver.findElement(By.id("s2But")).click();
     
   //  System.out.println(driver.getPageSource());
     
     
    // driver.switchTo().frame("jspFrame");
      
      
      
      
      
      
      
              
	}
}

