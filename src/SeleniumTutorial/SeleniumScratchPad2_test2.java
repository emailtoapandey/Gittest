package SeleniumTutorial;
import org.openqa.selenium.Cookie;
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
import org.openqa.selenium.support.pagefactory.AbstractAnnotations;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import scratchpad.hotloader.SeleniumScratchpad;

public class SeleniumScratchPad2_test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Namita\\IESERVER\\IEDriverServer.exe");  
		
	    WebDriver driver=new InternetExplorerDriver();  
		
			
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;   
				
       String appUrl = "http://172.27.16.219:8005/flsacwis/Sacwis.jsp";
       
       driver.get(appUrl);
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       
           
       
       driver.findElement(By.id("username")).sendKeys("ap10232");
       
       
   driver.findElement(By.id("password")).sendKeys("June2022");
    driver.findElement(By.id("btnSubmit")).click();
       
    driver.manage().window().maximize();
       
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
   //API for adding a new cookie.
   driver.manage().addCookie(cookieValue); 
   
     WebElement el= driver.findElement(By.id("create"));
    
      Actions actions = new Actions(driver);
      
     
      
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
 
      WebElement lastName = driver.findElement(By.name("PERSON_NM_LST"));
      lastName.sendKeys("a");   
      
     WebElement firstName = driver.findElement(By.name("PERSON_NM_FRST"));
      firstName.sendKeys("t");  
               
      driver.findElement(By.id("btnSearch")).click();
      

      Thread.sleep(5000);
      
           
      driver.findElement(By.id("btnCreate")).click();
      
      // Clicking on Create Person will open 4th Window  Create Person
 
      new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(4));
      
      Set<String> allWindowHandles1 = driver.getWindowHandles();
     
      System.out.println("Number of total windows - > " + allWindowHandles1);
      
          
          String lastwindow1 = "";
         
          for(String handle1 : allWindowHandles1)
         	
          {
          System.out.println("Switching to window - > " + handle1);
          
             //Thread.sleep(5000);
              driver.switchTo().window(handle1);
               
              System.out.println(driver.getTitle());
              
              if ("Create Person".equalsIgnoreCase(driver.getTitle()))
              lastwindow1=handle1;
                 
          }
               
          driver.switchTo().window(lastwindow1);
          
          System.out.println(driver.getTitle());
          
          driver.switchTo().frame("jspFrame");
          
          
          Thread.sleep(4000);
      

          WebElement Middlename = driver.findElement(By.name("INTAKE_PART_NM_MDL_INTL"));
          Middlename.sendKeys("ap");   
          
         // Thread.sleep(5000);
          
          //This is to click on Continue button on Create Person Popup Page
          
          driver.findElement(By.id("btnSave")).click();
          
          //This will Open the 5th window Potential Person match
          
          new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(5));
          Set<String> allWindowHandles2 = driver.getWindowHandles();
          
          System.out.println("Number of total windows - > " + allWindowHandles2);
          
              
              String lastwindow2 = "";
             
              for(String handle2 : allWindowHandles2)
             	
              {
              System.out.println("Switching to window - > " + handle2);
              
                 //Thread.sleep(5000);
                  driver.switchTo().window(handle2);
                  
                   
                  System.out.println(driver.getTitle());
                  
                  
                  
                  if ("Potential Person Matches".equalsIgnoreCase(driver.getTitle()))
                 	 
                  lastwindow2=handle2;
                     
              }
              
             
                  
              driver.switchTo().window(lastwindow2);
              
              System.out.println(driver.getTitle());
              
              driver.switchTo().frame("jspFrame");
              
              Thread.sleep(5000);
              driver.findElement(By.id("btnClose")).click();
              
              //This is Intake Inquiry Search Window
      
              driver.switchTo().window(lastwindow);
              
              System.out.println(driver.getTitle());
              
              driver.switchTo().frame("jspFrame");
              
              
              
              WebElement lastName1 = driver.findElement(By.name("PERSON_NM_LST"));
              lastName1.sendKeys("a");   
              
             WebElement firstName1 = driver.findElement(By.name("PERSON_NM_FRST"));
              firstName1.sendKeys("p");  
              
              Thread.sleep(5000);
           //   System.out.println(driver.getPageSource());
              
              driver.findElement(By.id("btnSearch")).click();
              Thread.sleep(5000);
              
              driver.findElement(By.id("btnCreate")).click();
              
              Thread.sleep(5000);
              
              new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(4)); 
              Set<String> allWindowHandles3 = driver.getWindowHandles();
              System.out.println(allWindowHandles3);
              
              
             
                System.out.println("Number of total windows - > " + allWindowHandles3);
          
              
                String lastwindow3 = "";
             
              for(String handle3 : allWindowHandles3)
             	
              {
              System.out.println("Switching to window - > " + handle3);
              
                 //Thread.sleep(5000);
                  driver.switchTo().window(handle3);
                   
                  System.out.println(driver.getTitle());
                  
                  if ("Create Person".equalsIgnoreCase(driver.getTitle()))
                  lastwindow3=handle3;
                     
              }
                   
              driver.switchTo().window(lastwindow3);
              
              System.out.println(driver.getTitle());
              
              driver.switchTo().frame("jspFrame");
              driver.findElement(By.id("btnSave")).click();
              
              new WebDriverWait(driver,40).until(ExpectedConditions.numberOfWindowsToBe(5)); 
              
              //5th Window Potential Person Match
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
                
                if ("Potential Person Matches".equalsIgnoreCase(driver.getTitle()))
                lastwindow4=handle4;
                   
            }
                 
            driver.switchTo().window(lastwindow4);
            
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
   
   new WebDriverWait(driver,40).until(ExpectedConditions.numberOfWindowsToBe(2)); 
   
	    driver.switchTo().window(secondwindow);
	    Thread.sleep(4000);
	   System.out.println(driver.getTitle());
	   // driver.switchTo().frame("saveFrame");
	   Thread.sleep(4000);
	     
	     driver.findElement(By.name("accessDtRcvdTime")).sendKeys("07:10");
	     driver.findElement(By.name("accessDtRcvdAMorPM")).click();
	     
	     driver.findElement(By.name("ACCESS_CD_BCKGRND_CHK_REQ")).click();
		    ((JavascriptExecutor) driver).executeScript("return document.getElementById('ACCESS_CD_BCKGRND_CHK_REQ').value= '2165' " );
		     
		     driver.findElement(By.name("ACCESS_CD_CNTY")).click();
		     
		     ((JavascriptExecutor) driver).executeScript("return document.getElementById('SM02_AccessReport_ACCESS_CD_CNTY').value= '5' " );
		     
		     driver.findElement(By.name("ACCESS_CD_RSPNS_SPVR")).click();
		     
		     ((JavascriptExecutor) driver).executeScript("return document.getElementById('SM02_AccessReport_ACCESS_CD_RSPNS_SPVR').value= '1' " );
		     
		     Thread.sleep(5000);
		     
		     
		     driver.findElement(By.id("linkRoles")).click();
		     new WebDriverWait(driver,40).until(ExpectedConditions.numberOfWindowsToBe(3)); 
		     
             Set<String> allWindowHandles5 = driver.getWindowHandles();
		     
		     String lastwindow5 = "";
		    
		     for(String handle5 : allWindowHandles5)
		    	
		     {
		     System.out.println("Switching to window - > " + handle5);
		     
		        //Thread.sleep(5000);
		         driver.switchTo().window(handle5);
		          
		         System.out.println(driver.getTitle());
		         
		         if ("Roles".equalsIgnoreCase(driver.getTitle()))
		         lastwindow5=handle5;
		            
		     }
		          
		     driver.switchTo().window(lastwindow5);
		     
		   driver.switchTo().frame("jspFrame");
		   
		    
		     System.out.println(driver.getTitle());	
		     
		     
		 driver.findElement(By.xpath("//html/body/form/div/div[2]/fieldset/div/table/tbody/tr[4]/td[1]/input[1]")).click();
		 
		 
		 driver.findElement(By.xpath("//html/body/form/div/div[2]/fieldset/div/table/tbody/tr[8]/td[1]/input[1]")).click();
		 
             driver.findElement(By.id("btnCreate")).click();
		 
		 Thread.sleep(4000);
		 driver.switchTo().window(secondwindow);
		 
		 
		 List<WebElement> ls = driver.findElements(By.id("linkRoles"));
			System.out.println(ls.size()) ;
			
			ls.get(1).click();
			Thread.sleep(4000);
 
			new WebDriverWait(driver,40).until(ExpectedConditions.numberOfWindowsToBe(3)); 
		     
            Set<String> allWindowHandles6 = driver.getWindowHandles();
		     
		     String lastwindow6 = "";
		    
		     for(String handle6 : allWindowHandles6)
		    	
		     {
		     System.out.println("Switching to window - > " + handle6);
		     
		        //Thread.sleep(5000);
		         driver.switchTo().window(handle6);
		          
		         System.out.println(driver.getTitle());
		         
		         if ("Roles".equalsIgnoreCase(driver.getTitle()))
		         lastwindow6=handle6;
		            
		     }
		          
		     driver.switchTo().window(lastwindow6);
		     
		   driver.switchTo().frame("jspFrame");
		   
		    
		     System.out.println(driver.getTitle());	
		     driver.findElement(By.xpath("//html/body/form/div/div[2]/fieldset/div/table/tbody/tr[1]/td[1]/input[1]")).click();
		     
		     driver.findElement(By.id("btnCreate")).click();
		     
		     Thread.sleep(4000);
		      
			 driver.switchTo().window(secondwindow);
		      driver.findElement(By.xpath("//*[@id=\"Expando\"]")).click();
		      driver.findElement(By.xpath("//input[@name='FL_CALLER_ID']")).click();
		      
		      driver.findElement(By.id("SM02_AccessReport_ACCESS_CD_RPTR_DSCR")).click();
		      
		      driver.findElement(By.id("SM02_AccessReport_ACCESS_CD_RPTR_DSCR")).sendKeys(Keys.ARROW_DOWN);
		      driver.findElement(By.id("SM02_AccessReport_ACCESS_CD_RPTR_DSCR")).sendKeys(Keys.ENTER);
		      
		      driver.findElement(By.id("tabAllegation")).click();
		      driver.findElement(By.xpath("//*[@id=\"divAllegation\"]/fieldset[3]/div/table/tbody/tr[2]/td/textarea")).sendKeys("test");
		      
		      Thread.sleep(4000);
		      
		      driver.findElement(By.id("divBtnInsertAllegation")).click();
		      
		            
		      new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(3));
		      Set<String> allWindowHandles7 = driver.getWindowHandles();
		      System.out.println(allWindowHandles1);
		      
		      String lastwindow7 = "";
		       
		     
		      for(String handle7 : allWindowHandles7)
		     	
		      {
		      System.out.println("Switching to window - > " + handle7);
		      
		         //Thread.sleep(5000);
		          driver.switchTo().window(handle7);
		           
		            if ("FSFN".equalsIgnoreCase(driver.getTitle()))
		          lastwindow7=handle7;
		          
		             
		      }
		           
		      
		     driver.switchTo().window(lastwindow7);
		      
		     System.out.println(driver.getTitle());
		     
		     driver.findElement(By.id("s2But")).click();
		      
		      
		     new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(3));
		      Set<String> allWindowHandles8 = driver.getWindowHandles();
		      System.out.println(allWindowHandles8);
		      
		      String lastwindow8 = "";
		       
		     
		      for(String handle8 : allWindowHandles8)
		     	
		      {
		      System.out.println("Switching to window - > " + handle8);
		      
		         //Thread.sleep(5000);
		          driver.switchTo().window(handle8);
		          System.out.println(driver.getTitle());
		           
		          if ("Add Allegations".equalsIgnoreCase(driver.getTitle()))
		          lastwindow8=handle8;
		          
		             
		      }
		           
		      
		     driver.switchTo().window(lastwindow8);
		      
		     System.out.println(driver.getTitle());
		     
		     Thread.sleep(6000);
		     
		     		      
	           
		      actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.UP).build().perform();
		      actions.sendKeys(Keys.TAB).sendKeys(Keys.DOWN).build().perform();
		      
		 
		      actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		      
		      
		     Thread.sleep(6000);
		     
		     actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		   // actions.keyDown(Keys.ALT).sendKeys("t").build().perform();
		      		     
		   //   driver.findElement(By.id("btnContinue")).click();
		     driver.switchTo().window(secondwindow);
		     System.out.println(driver.getTitle());
		     
		     //Clicking on Decision Tab
		     
		     driver.findElement(By.id("Decision")).click();
		     
			 driver.findElement(By.xpath("//input[@name='ACCESS_CD_SPVR_STAT']")).click();
			 driver.findElement(By.id("spanCreateLinkCase")).click();
			 
			 new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(3));
			 
			 //After clicking on Create case hyperlink , the soft edit message comes, below will click on Yes soft edit message.
			 Set<String> allWindowHandles9 = driver.getWindowHandles();
		      System.out.println(allWindowHandles9);
		      
		      String lastwindow9 = "";
		       
		     
		      for(String handle9 : allWindowHandles9)
		     	
		      {
		      System.out.println("Switching to window - > " + handle9);
		      
		         //Thread.sleep(5000);
		          driver.switchTo().window(handle9);
		           
		            if ("FSFN".equalsIgnoreCase(driver.getTitle()))
		          lastwindow9=handle9;
		          
		             
		      }
		           
		      
		     driver.switchTo().window(lastwindow9);
		      
		     System.out.println(driver.getTitle());
		     
		     driver.findElement(By.id("s2But")).click();
		     
		     // Another soft  edit message comes and this would click on Yes on poup message
		     
		     
		     new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(3));
		      Set<String> allWindowHandles10 = driver.getWindowHandles();
		      System.out.println(allWindowHandles10);
		      
		      String lastwindow10 = "";
		       
		     
		      for(String handle10 : allWindowHandles10)
		     	
		      {
		      System.out.println("Switching to window - > " + handle10);
		      
		         //Thread.sleep(5000);
		          driver.switchTo().window(handle10);
		          System.out.println(driver.getTitle());
		           
		          if ("FSFN".equalsIgnoreCase(driver.getTitle()))
		          lastwindow10=handle10;
		          
		             
		      }
		           
		      
		     driver.switchTo().window(lastwindow10);
		     driver.findElement(By.id("s2But")).click();
		     
		     //This will click on Create Case hyperlin
		     new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(3));
		      Set<String> allWindowHandles11 = driver.getWindowHandles();
		      System.out.println(allWindowHandles11);
		      
		      String lastwindow11 = "";
		       
		     
		      for(String handle11 : allWindowHandles11)
		     	
		      {
		      System.out.println("Switching to window - > " + handle11);
		      
		         //Thread.sleep(5000);
		          driver.switchTo().window(handle11);
		          System.out.println(driver.getTitle());
		           
		        if ("Create/Link Case Window".equalsIgnoreCase(driver.getTitle()))
		         lastwindow11=handle11;
		          
		             
		      }
		           	      
		    
		      driver.switchTo().window(lastwindow11);
		      
		      //This will click on Create button Create/link case Window popup mesage
		           	      
		      actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		      
		   //   This will redirect to Maintain Cae and then handling the window.
		      
		      new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(4));
		      Set<String> allWindowHandles12 = driver.getWindowHandles();
		      System.out.println(allWindowHandles12);
		      
		      String lastwindow12 = "";
		       
		     
		      for(String handle12 : allWindowHandles12)
		     	
		      {
		      System.out.println("Switching to window - > " + handle12);
		      
		         //Thread.sleep(5000);
		          driver.switchTo().window(handle12);
		          System.out.println(driver.getTitle());
		           
		          if ("Maintain Case Window".equalsIgnoreCase(driver.getTitle()))
		          lastwindow12=handle12;
		          
		             
		      }
		           
		      
		     driver.switchTo().window(lastwindow12);
		     
		   //  actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN);
		     
		   //  actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
		     
		  //   System.out.println(driver.getPageSource());
		     driver.switchTo().frame("jspFrame");
				
             driver.findElement(By.id("SM04A_Case_theCase_CASE_CD_PS_DSCR")).click();

		
		   driver.findElement(By.xpath(".//*[@id='SM04A_Case_theCase_CASE_CD_PS_DSCR']")).sendKeys(Keys.ARROW_DOWN);
	       driver.findElement(By.xpath(".//*[@id='SM04A_Case_theCase_CASE_CD_PS_DSCR']")).sendKeys(Keys.ENTER);
	       
	       driver.findElement(By.id("btnSave")).click();
	       Thread.sleep(4000);
	       driver.findElement(By.id("btnClose")).click();
	       
	       driver.switchTo().window(secondwindow);
	       
	       //This will launch the worker page by clicking on verify hyperlink
	       
	       Thread.sleep(4000);
	       
	       driver.findElement(By.id("SM02_AccessReport_cm18_MaintainWorkerInformationForm")).click();
	       
	       //Capture the Worker Window 
	       
	       new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(3));
		      Set<String> allWindowHandles13 = driver.getWindowHandles();
		      System.out.println(allWindowHandles13);
		      
		      String lastwindow13 = "";
		       
		     
		      for(String handle13 : allWindowHandles13)
		     	
		      {
		      System.out.println("Switching to window - > " + handle13);
		      
		         //Thread.sleep(5000);
		          driver.switchTo().window(handle13);
		          System.out.println(driver.getTitle());
		           
		         if ("Worker Search".equalsIgnoreCase(driver.getTitle()))
		         lastwindow13=handle13;
		        
		             
		      }
		           
		      		     driver.switchTo().window(lastwindow13);
		      		     
		      		   System.out.println(driver.getTitle());
		      		     
		      			driver.switchTo().frame("jspFrame");
		      			
		      			Thread.sleep(6000);
		      			//Typing the worker name
		      			
		      			actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Kz*").sendKeys(Keys.TAB).sendKeys("alok*").build().perform();
		      			
		      					      			
		      			// Clicking Search button
		      			
		      			actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		      			
		      			Thread.sleep(5000);
		      			
		      			// Selecting the worker radio button from the drop down
		      			
		      			actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();

		      			actions.sendKeys(Keys.TAB);
		      			actions.sendKeys(Keys.ARROW_DOWN).build().perform();

		      			Thread.sleep(5000);
		      			
		      			//Clicking on Continue button
		      			
		      			driver.findElement(By.id("btnContinue")).click();
		      			
		      		  new WebDriverWait(driver,30).until(ExpectedConditions.numberOfWindowsToBe(2));   
		      		  
		      		  //Switching to the Intake window
		      		  
		      		  driver.switchTo().window(secondwindow);
		      		  
		      		  //Clicking on Assign hyperlink
		      		  
		      		  driver.findElement(By.id("btnAssign")).click();
		      		  
		      		  Thread.sleep(5000);
		      		  
		      		  driver.findElement(By.id("btnClose")).click();
		      		  
		      		  
		      		   System.out.println("Intake created, please check the Desktop");	  
		     
     SeleniumScratchpad.start(driver);
     
     
              
	}
}

