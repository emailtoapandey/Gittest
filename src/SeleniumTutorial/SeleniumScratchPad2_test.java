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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.codec.http.Cookie;
import scratchpad.hotloader.SeleniumScratchpad;

public class SeleniumScratchPad2_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.ie.driver", "C:\\Namita\\IESERVER\\IEDriverServer.exe"); 
	
	
		
		
		//System.setProperty("webdriver.ie.driver", "C:\\Namita\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe"); 
		
		//System.setProperty("webdriver.ie.driver", "C:\\Namita\\IEDriverServer_Win32_3.150.2\\IEDriverServer.exe");  
	
	    WebDriver driver=new InternetExplorerDriver();  

		     
		
	//System.setProperty("webdriver.edge.driver", "C:\\Namita\\edgedriver_win32\\msedgedriver.exe");
	//InternetExplorerDriverService ieService = InternetExplorerDriverService.createDefaultService();
	//InternetExplorerOptions ieOptions = new InternetExplorerOptions();
	//ieOptions.setCapability("ie.edgepath", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
	// ieOptions.setCapability("ie.edgechromium", true);
	// WebDriver driver = new InternetExplorerDriver(ieService, ieOptions);
	 
	 
	// System.setProperty("webdriver.ie.driver", "C:\\Users\\0J8334897\\Documents\\drivers\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");  
		
	//	WebDriver driver = new EdgeDriver();
		
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;   
				
       String appUrl = "http://172.27.16.219:8005/flsacwis/Sacwis.jsp";
       
       driver.get(appUrl);
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       
      
       
       driver.findElement(By.id("username")).sendKeys("ap10232");
       
       
   driver.findElement(By.id("password")).sendKeys("Feb2022");
    driver.findElement(By.id("btnSubmit")).click();
       
    driver.manage().window().maximize();
    
   driver.manage().getCookies() ;
	   
	//   Set<org.openqa.selenium.Cookie> allCookies = driver.manage().getCookies();
	
       
          
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
       
       
      
   //   WebElement mySelectElement = driver.findElement(By.id("LOGON_selectedUser"));
      
    //  mySelectElement.click();
          
      
  //    WebDriverWait wait = new WebDriverWait(driver,30); 
      
        
 
     Thread.sleep(5000);
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LOGON_selectedUser")));
    
   // Select dropdown = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='selectedUser' and @id='LOGON_selectedUser' and @onchange]"))));
   // dropdown.selectByIndex(1);
     
   //   dropdown.selectByIndex(2);
   // Thread.sleep(10000);
     
     
     
   // driver.findElement(By.id("LOGON_selectedUser")).click();
   
  //  Select dropdown = new Select(driver.findElement(By.id("LOGON_selectedUse")));
    
 //   WebElement testDropDown = driver.findElement(By.id("LOGON_selectedUser"));  
 //   Select dropdown = new Select(testDropDown);  
    
  //  dropdown.selectByValue("100200278");
    
    //driver.findElement(By.xpath("//option[@value='100200280']")).click();
    
   //dropdown.selectByIndex(2);
     
  //   Thread.sleep(4000);
     
   //  driver.findElement(By.xpath("//option[text()='HOTLINE-FAMILY SAFETY - Acting Supervisor']")).click();
     
    // driver.findElement(By.xpath(".//*[@option='100200280']")).click();
     
 //((JavascriptExecutor) driver).executeScript("document.getElementById('LOGON_selectedUser').value= '100200280' " );
 
//Thread.sleep(500);
 
// driver.findElement(By.id("divWorkArea")).click();
 
 
 
           
     
     
     
  //   JavascriptExecutor js = (JavascriptExecutor)driver;
  //   if (js.executeScript
  //		      ("return document.readyState").toString().equals("complete")){
  //		         System.out.println("Page loaded properly.");
  //		      }
     
     
  // ((JavascriptExecutor) driver).executeScript("return document.getElementById('LOGON_selectedUser').selectIndex= '2' " );
 driver.findElement(By.id("btnContinue")).click();
   Thread.sleep(5000);
     
   //System.out.println(driver.getPageSource());
     
//   driver.findElement(By.id("create")).click();
    
 //   Thread.sleep(4000);
    
  //WebElement em= driver.findElement(By.id("createMenu3"));
  
  //Actions action=new Actions(driver);
  
 // action.moveToElement(em);
 // action.click().build().perform();
  
  
    
    //System.out.println(driver.getPageSource());
   
    
     
      //driver.get("http://172.27.32.137:8005/flsacwis/sm/sm02/SM02_AccessReport?action=CREATE_HOTLINE_INTAKE&ACCESS_CD_ACCESS_TYPE=1&ACCESS_CD_INTL_SUB=1&fromWhere=desktop");
       
   //   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
   
   //commenting javascript executor to select child intake.
   
  
   
   
  // ((JavascriptExecutor)driver).executeScript("MenuItemClick('/flsacwis/sm/sm02/SM02_AccessReport?action=CREATE_HOTLINE_INTAKE&ACCESS_CD_ACCESS_TYPE=1&ACCESS_CD_INTL_SUB=1')");
   WebElement el= driver.findElement(By.id("create"));
   
   // el.click();
     Actions actions = new Actions(driver);
     
   
   actions.sendKeys(el, Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
   
  
       

    //   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
       

       
    //   int countIframesInPage = driver.findElements(By.tagName("IFRAME")).size();
   //    System.out.println("Number of Frames on a Page:" + countIframesInPage);
       
     //By finding all the web elements using iframe tag
     //  List<WebElement> iframeElements = driver.findElements(By.tagName("IFRAME"));
    //   System.out.println("Total number of iframes are " + iframeElements.size());

       //By executing a java script
     //  JavascriptExecutor exe = (JavascriptExecutor) driver;
      // Integer noOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
      // System.out.println("No. of iframes on the page are " + noOfFrames);
       
  
       
    //   Set<String> windowhandles = driver.getWindowHandles();
          
   //    System.out.println(windowhandles);
       
             
   //    Iterator<String> iterator=windowhandles.iterator();
       
   //    String windowone=iterator.next();
   //    System.out.println(windowone);

   //    String windowtwo=iterator.next();
   //    System.out.println(windowtwo);
       

       
       

     //  driver.switchTo().window(windowone);
     //  System.out.println(driver.getTitle());
     //  driver.switchTo().window(windowtwo);
     //  System.out.println(driver.getTitle());
       
      // Thread.sleep(20000);
    //   Set<String> win = driver.getWindowHandles();
   //    System.out.println(win);
       
      // ArrayList<String> tabs = new ArrayList<String>(win);

       //for (int j = 0;j<win.size();j++) {
    //	   driver.switchTo().window(tabs.get(j));
    //	   System.out.println(driver.getTitle());
    //  Thread.sleep(5000);
    
     //  }
       
       
   //    if (driver.getTitle().equals("Intake Inquiry Search")) {
    //	   System.out.println("we are at Intake Inquiry Search ");
    	   
    //	   driver.findElement(By.xpath("//app[@title='Last Name']")).sendKeys("abc");
   //    }
      
      new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(3));
       String parentWindowHandle = driver.getWindowHandle();
       System.out.println("Parent window's handle -> " + parentWindowHandle + " "+ driver.getTitle());
       
       Set<String> win1 = driver.getWindowHandles();
       
       System.out.println(win1);
     
//   Thread.sleep(20000);
     
     Set<String> allWindowHandles = driver.getWindowHandles();
     
     String lastwindow = "";
    
     for(String handle : allWindowHandles)
    	
     {
     System.out.println("Switching to window - > " + handle);
     
        //Thread.sleep(5000);
         driver.switchTo().window(handle);
          
         System.out.println(driver.getTitle());
         
         if ("Intake Inquiry Search".equalsIgnoreCase(driver.getTitle()))
         lastwindow=handle;
            
     }
          
     driver.switchTo().window(lastwindow);
     
     System.out.println(driver.getTitle());
     
     
  //   Thread.sleep(5000);
     
    // driver.switchTo().frame(driver.findElement(By.name(“<<name expression”)));
     
     
    // driver.switchTo().frame(driver.findElement(By.name("jspFrame")));
    // driver.switchTo().frame("jspFrame");
     
    // driver.switchTo().frame("jspFrame");
   
 
     
   //  ArrayList<String> tabs1 = new ArrayList<String>(win1);

  //  for (int j = 0;j<win1.size();j++){
   //   driver.switchTo().window(tabs1.get(j));
   //   System.out.println(driver.getTitle());
   //  }   
    //	 if (driver.getTitle().equals("Intake Inquiry Search")) 
    		   
    //	   System.out.println("we are at Intake Inquiry Search ");
    	 
    //	   Thread.sleep(20000);
    //	   driver.findElement(By.xpath("//input[@proerty='PERSON_NM_LST' AND title='Last Name']")).sendKeys("abc");
    	 
    	 
       
     //  Iterator<String> iterator1=windowhandles.iterator();
       
       
       
     //  String winone=iterator1.next();
       
        
       
     //  System.out.println(windowone);

     //  String wintwo=iterator1.next();
     //  System.out.println(windowtwo);
       
     //  String winthree=iterator1.next();
     //  System.out.println(winthree);
       
     //  driver.switchTo().window(winthree);
       
     
     //  WebDriverWait wait = new WebDriverWait(driver, 10);
      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title=\"Intake Inquiry Search\"]")));
       //driver.switchTo().window("Intake Inquiry Search");
      
    	  //  WebDriverWait wait1 = new WebDriverWait(driver, 10);
    	  //     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@proerty='PERSON_NM_LST' AND title='Last Name']")));
    	       //driver.switchTo().window("Intake Inquiry Search");
     
    // Thread.sleep(5000);
     
    	  //     driver.findElement(By.name("Last Name")).sendKeys("abc");
   //  Thread.sleep(5000);
     
  //   WebDriverWait wait1 = new WebDriverWait(driver, 10);
  //  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='Last Name']")));
     //driver.switchTo().window("Intake Inquiry Search");
   //  driver.findElement(By.xpath("//input[@name='PERSON_NM_LST']")).sendKeys("abc");
     
     driver.switchTo().frame("jspFrame");
     
   //  Thread.sleep(5000);
     

     
     WebElement lastName = driver.findElement(By.name("PERSON_NM_LST"));
     lastName.sendKeys("a");   
     
    WebElement firstName = driver.findElement(By.name("PERSON_NM_FRST"));
     firstName.sendKeys("t");  
              
     driver.findElement(By.id("btnSearch")).click();
     
   //  driver.findElement(By.id("btnSearch")).click();
     
     Thread.sleep(5000);
     
            
     driver.findElement(By.id("btnCreate")).click();
     
    // Thread.sleep(5000);
     new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(4));
     
      Set<String> allWindowHandles1 = driver.getWindowHandles();
     System.out.println(allWindowHandles1);
     
     
 Set<String> allWindowHandles2 = driver.getWindowHandles();
 
 System.out.println("Number of total windows - > " + allWindowHandles2);
 
     
     String lastwindow2 = "";
    
     for(String handle2 : allWindowHandles2)
    	
     {
     System.out.println("Switching to window - > " + handle2);
     
        //Thread.sleep(5000);
         driver.switchTo().window(handle2);
          
         System.out.println(driver.getTitle());
         
         if ("Create Person".equalsIgnoreCase(driver.getTitle()))
         lastwindow2=handle2;
            
     }
          
     driver.switchTo().window(lastwindow2);
     
     System.out.println(driver.getTitle());
     
     driver.switchTo().frame("jspFrame");
     
     
     Thread.sleep(4000);
     
  //Thread.sleep(5000);
     
    
 // WebElement MiddleName = driver.findElement(By.name("PERSON_NM_MIDDLE"));
 // MiddleName.sendKeys("ts");  
  
     
     
     
     
  //  driver.switchTo().activeElement();
    
    
    
     
   //  driver.switchTo().frame("jspFrame");
    
   // String actual_msg=driver.findElement(By.id("btnClose")).get
    
  //  driver.switchTo().alert().accept();
    
   // List<WebElement> button =driver.findElements(By.id("btnClose"));
 //   System.out.println(button.size());
    
    
   // button.get(1).click();
    
  
    
    
    
         
   //  Set<String> allWindowHandles1 = driver.getWindowHandles();
   //  System.out.println(allWindowHandles1);
//Thread.sleep(5000);
     
//((JavascriptExecutor) driver).executeAsyncScript("document.getElementById('close2But').click();");

     
     
     WebElement Middlename = driver.findElement(By.name("INTAKE_PART_NM_MDL_INTL"));
     Middlename.sendKeys("ap");   
     
    // Thread.sleep(5000);
     
     driver.findElement(By.id("btnSave")).click();
     
     new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(5));
     
     Set<String> win2 = driver.getWindowHandles();
     
     System.out.println(win2);
     
     Set<String> allWindowHandles3 = driver.getWindowHandles();
     
     System.out.println("Number of total windows - > " + allWindowHandles3);
     
         
         String lastwindow3 = "";
        
         for(String handle3 : allWindowHandles3)
        	
         {
         System.out.println("Switching to window - > " + handle3);
         
            //Thread.sleep(5000);
             driver.switchTo().window(handle3);
             
              
             System.out.println(driver.getTitle());
             
             
             
             if ("Potential Person Matches".equalsIgnoreCase(driver.getTitle()))
            	 
             lastwindow3=handle3;
                
         }
         
        
              
         driver.switchTo().window(lastwindow3);
         
         System.out.println(driver.getTitle());
         
         driver.switchTo().frame("jspFrame");
         
         Thread.sleep(5000);
         
         driver.findElement(By.id("btnClose")).click();
         
         driver.switchTo().window(lastwindow);
         
         System.out.println(driver.getTitle());
         
         driver.switchTo().frame("jspFrame");
         
         WebElement lastName1 = driver.findElement(By.name("PERSON_NM_LST"));
         lastName1.sendKeys("a");   
         
        WebElement firstName1 = driver.findElement(By.name("PERSON_NM_FRST"));
         firstName1.sendKeys("p");  
                  
        // driver.findElement(By.id("btnSearch")).click();
         
       //  driver.findElement(By.id("btnSearch")).click();
         
         Thread.sleep(5000);
         
                
         driver.findElement(By.id("btnCreate")).click();
         
         Thread.sleep(5000);
         new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(4)); 
         
         Set<String> win4 = driver.getWindowHandles();
        System.out.println(win4);
         
         Set<String> allWindowHandles4 = driver.getWindowHandles();
        System.out.println(allWindowHandles4);
        
        
       
          System.out.println("Number of total windows - > " + allWindowHandles4);
    
        
          String lastwindow4 = "";
       
        for(String handle4 : allWindowHandles4)
       	
        {
        System.out.println("Switching to window - > " + handle4);
        
           //Thread.sleep(5000);
            driver.switchTo().window(handle4);
             
            System.out.println(driver.getTitle());
            
            if ("Create Person".equalsIgnoreCase(driver.getTitle()))
            lastwindow4=handle4;
               
        }
             
        driver.switchTo().window(lastwindow4);
        
        System.out.println(driver.getTitle());
        
        driver.switchTo().frame("jspFrame");
                
         driver.findElement(By.id("btnSave")).click();
         //////////////////////////////////////////////////////////////////////////////////////////////////////
         
         new WebDriverWait(driver,40).until(ExpectedConditions.numberOfWindowsToBe(5)); 
         Set<String> win5 = driver.getWindowHandles();

        System.out.println(win5);
      
          Set<String> allWindowHandles5 = driver.getWindowHandles();
          System.out.println(allWindowHandles5);
        
        
       
          System.out.println("Number of total windows - > " + allWindowHandles5);
    
        
          String lastwindow5 = "";
       
        for(String handle5 : allWindowHandles5)
       	
        {
        System.out.println("Switching to window - > " + handle5);
        
           //Thread.sleep(5000);
            driver.switchTo().window(handle5);
             
            System.out.println(driver.getTitle());
            
            if ("Potential Person Matches".equalsIgnoreCase(driver.getTitle()))
            lastwindow5=handle5;
               
        }
             
        driver.switchTo().window(lastwindow5);
        
        Thread.sleep(5000);
        
        System.out.println(driver.getTitle());
         
         
         driver.switchTo().frame("jspFrame");
         
                 
         Thread.sleep(5000);
         
 driver.findElement(By.id("btnClose")).click();
 
 Thread.sleep(3000);
         
         driver.switchTo().window(lastwindow);
         
                 
         driver.switchTo().frame("jspFrame");
         
         Thread.sleep(3000);
         
         System.out.println(driver.getTitle());
         
       driver.findElement(By.id("btnSave")).click();

       
		     
     
         SeleniumScratchpad.start(driver);
 
	}
}

