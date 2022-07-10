package SeleniumTutorial;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Two2_copy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("IE_DRIVER_EXE_PROPERTY", "C:\\Users\\AlokPandey\\Downloads\\edgedriver_win64_raj\\msedgedriver.exe");
		
		InternetExplorerDriverService ieService = InternetExplorerDriverService.createDefaultService();
		InternetExplorerOptions ieOptions = new InternetExplorerOptions();
		ieOptions.setCapability("ie.edgepath", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		 ieOptions.setCapability("ie.edgechromium", true);
		 WebDriver driver = new InternetExplorerDriver(ieService, ieOptions);
			
		    String appUrl = "http://172.27.16.219:8008/flsacwis/Sacwis.jsp";
			
	       
	       
			
			//C:\\Users\\AlokPandey\\Downloads\\edgedriver_win32 (1)
			
			//C:\\Users\\AlokPandey\\Downloads\\edgedriver_win64_raj
			
			
		
	
	       
				
   
			
			
		//	String appUrl = "C://Users//AlokPandey//Desktop//HTML//ProfileSelect.html" ;
					
			//file:///C:/Users/AlokPandey/Desktop/HTML/ProfileSelect.html
       driver.get(appUrl);
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
       
      driver.findElement(By.id("username")).sendKeys("AP10232	");
      driver.findElement(By.id("password")).sendKeys("Feb2022");
      driver.findElement(By.id("btnSubmit")).click();
       
    //  System.out.println(driver.getPageSource());
       
       driver.findElement(By.id("LOGON_selectedUser")).click();
       
       
       
 
       
     //  WebDriverWait wait = new WebDriverWait(driver,30); 
       
    //   WebElement slctPorfile=  driver.findElement(By.id("LOGON_selectedUser"));
       
   //   driver.findElement(By.xpath("/html/body/form/div/fieldset/table/tbody/tr/td/select/option[5]")).click();
       
    
       
      //   Select dropdown= new Select (slctPorfile);
       
    //    dropdown.selectByIndex(2);
         
     //   dropdown.selectByIndex(3);
         
      //  System.out.println(dropdown.getFirstSelectedOption().getText());
       
    //  driver.findElement(By.xpath("//option[text()=\"HOTLINE-FAMILY SAFETY - Acting Supervisor\"]")).click();
       
   //     List<WebElement> drpdwn= driver.findElements(By.xpath("//option[text()=\"HOTLINE-FAMILY SAFETY - Acting Supervisor\"]"));
               
        
        
        
   //   System.out.println(drpdwn.size() );
       
       
       
       //driver.switchTo().frame(0);
       
      // driver.switchTo().frame("retrievingFrame");
     
       
      // int size = driver.findElements(By.tagName("iframe")).size();
       
       //System.out.println(size);
       
  // driver.switchTo().frame("retrievingFrame");
   
  // driver.findElement(By.id("LOGON_selectedUser")).click();
   
 //  Select select = new Select(driver.findElement(By.id("LOGON_selectedUser")));
   
   
   
      
  //    List<WebElement> allvalues=select.getOptions();
      
  //    for(WebElement e: allvalues) {
    	  
  //  	  System.out.println(allvalues.size());
    	  
  //    }
   
  
 //  String defaultItem = option.getText();
  // System.out.println(defaultItem );
       
     // WebElement slctPorfile=  driver.findElement(By.id("LOGON_selectedUser"));
      
   
   //    Select dropdown= new Select (slctPorfile);
       
     //  dropdown.selectByValue("100200280");
       
      // dropdown.selectByIndex(3);
       
      // System.out.println(dropdown.getFirstSelectedOption().getText());
       

      
      
       
   //   Select drpPrfl = new Select(driver.findElement(By.id("LOGON_selectedUser")));
                     
   //   drpPrfl.selectByValue("040800-NASSAU CO BRD OF CO COMM-ADMIN - DCF Zone Licensing Agent");
              
       //driver.findElement(By.id("btnContinue")).click();
       //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
       
      // driver.findElement(By.id("create")).click();
       
      // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
      
       
      // 
       
   // driver.findElement(By.id("LOGON_selectedUser")).click();
    
    
    
    
    
  //Select elm = new Select(driver.findElement(By.id("LOGON_selectedUser")));
   
  // Select select = new Select(driver.findElement(By.id("LOGON_selectedUser")));
//   WebElement option = select.getOptions().get(1);
//   String defaultItem = option.getText();
//   System.out.println(defaultItem );
   
       
 // elm.selectByIndex(1);
      
   //   driver.findElement(By.xpath("//*[@text()='Select Login Profile']")).click();
       
    //   driver.switchTo().frame("jspFrame");
           
    //   driver.findElement(By.id("LOGON_selectedUser")).click();
       
   //  Thread.sleep(10000);
       
   //  ((JavascriptExecutor) driver).executeScript("return document.getElementById('LOGON_selectedUser').value= '100200280' " );
       
    //   ((JavascriptExecutor) driver).executeScript("document.getElementById('LOGON_selectedUser').click()");
       
    // ((JavascriptExecutor) driver).executeScript("document.getElementByid('LOGON_selectedUser').value='100200280'");
       
     //  ((JavascriptExecutor) driver).executeScript("return document.getElementById('LOGON_selectedUser').selectedIndex = '" + 1 + "';");
       
      
       
   // Select elm = new Select(driver.findElement(By.id("LOGON_selectedUser")));
       
 //   elm.selectByValue("100200280");
       
    //   elm.selectByVisibleText("HOTLINE-FAMILY SAFETY - Acting Supervisor");
       
       
      // WebElement select = driver.findElement(By.id("LOGON_selectedUser"));

     //  ((JavascriptExecutor)driver).executeScript("var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } }", select, "2");
       
   //    Thread.sleep(5000);
       
     //  driver.findElement(By.id("divWorkArea")).click();
       driver.findElement(By.id("btnContinue")).click();
       
       Thread.sleep(15000);
    
       
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
       ((JavascriptExecutor)driver).executeScript("MenuItemClick('/flsacwis/sm/sm02/SM02_AccessReport?action=CREATE_HOTLINE_INTAKE&ACCESS_CD_ACCESS_TYPE=1&ACCESS_CD_INTL_SUB=1')");
       
     //  WebElement n=driver.findElement(By.id("createMenu3"));
       
     //  Actions a = new Actions(driver);
    //   a.moveToElement(n).perform();
   //    a.click();
       
     //  driver.findElement(By.xpath("//div[@id='createMenu3']")).click();
       
      // WebElement m=driver.findElement(By.xpath("//span//div[@text()='Child Intake']"));
       	      
       	      //move to element and click
       	//      a.moveToElement(m).click().perform();
       
       
       String parentWindowHandle = driver.getWindowHandle();
       System.out.println("Parent window's handle -> " + parentWindowHandle + " "+ driver.getTitle());
       
       Set<String> win1 = driver.getWindowHandles();
       
       System.out.println(win1);
     
//   Thread.sleep(20000);
     
     Set<String> allWindowHandles = driver.getWindowHandles();
     
     System.out.println("number of total wondows" + allWindowHandles);
     
     String lastwindow = "";
    
     for(String handle : allWindowHandles)
    	
     {
     System.out.println("Switching to window - > " + handle);
     
        //Thread.sleep(5000);
         driver.switchTo().window(handle);
          
         System.out.println(driver.getTitle());
         
         if ("Security Error".equalsIgnoreCase(driver.getTitle()))
         lastwindow=handle;
            
     }
          
     driver.switchTo().window(lastwindow);
     
     System.out.println(driver.getTitle());
     
     //System.out.println(driver.getPageSource());
     
   //  driver.switchTo().frame("jspFrame");
     
  //   Thread.sleep(5000);
     
  //driver.findElement(By.id("btnClose")).click();
     
       
  
	}

}
