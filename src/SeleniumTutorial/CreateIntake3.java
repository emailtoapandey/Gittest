package SeleniumTutorial;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateIntake3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				 
		 System.setProperty("webdriver.ie.driver", "C:\\Namita\\IEDriverServer_Win32_3.150.2\\IEDriverServer.exe");  
			WebDriver driver=new InternetExplorerDriver();  
			
	       
				
       String appUrl = "http://172.27.16.219:8005/flsacwis/Sacwis.jsp";
       driver.get(appUrl);
       driver.manage().window().maximize();
               
       
       
       driver.findElement(By.id("username")).sendKeys("ap10232");
       driver.findElement(By.id("password")).sendKeys("Jan2022");
       driver.findElement(By.id("btnSubmit")).click();
       
       Thread.sleep(5000);
       
      
      
        WebElement mySelectElement = driver.findElement(By.id("LOGON_selectedUser"));
       
         mySelectElement.click();
           
       
       WebDriverWait wait = new WebDriverWait(driver,30); 
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
      
     // Select dropdown = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='selectedUser' and @id='LOGON_selectedUser' and @onchange]"))));
  //    dropdown.selectByIndex(2);
      Thread.sleep(10000);
      
      ((JavascriptExecutor) driver).executeScript("return document.getElementById('LOGON_selectedUser').indexValue = '2' " );
      
    //  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
      
     // WebDriverWait wait2 = new WebDriverWait(driver, 10);
     // wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnContinue")));
      
       driver.findElement(By.id("btnContinue")).click();
      
      
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
      
      
    WebElement n=driver.findElement(By.id("createMenu3"));
      
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
        
      Actions a = new Actions(driver);
      a.moveToElement(n).perform();
      a.click().perform();
        
      //  driver.findElement(By.xpath("//div[@id='createMenu3']")).click();
      
      
      Thread.sleep(5000);
      
      ((JavascriptExecutor)driver).executeScript("MenuItemClick('/flsacwis/sm/sm02/SM02_AccessReport?action=CREATE_HOTLINE_INTAKE&ACCESS_CD_ACCESS_TYPE=1&ACCESS_CD_INTL_SUB=1')");
  	  
    //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LOGON_selectedUser")));
       
   //    WebElement mySelectElement = driver.findElement(By.id("LOGON_selectedUser"));
       
   //    mySelectElement.click();
       
       
      // mySelectElement.isSelected();

   //   Select dropdown= new Select(driver.findElement(By.id("LOGON_selectedUser")));
      
     // dropdown.selectByValue("100200280");
      
     // dropdown.selectByVisibleText("HOTLINE-FAMILY SAFETY - Acting Supervisor");
      
      
      Thread.sleep(6000);
          
      String parentwin= driver.getWindowHandle();
      System.out.println(driver.getTitle());

       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
     
       
       Set<String> windowhandles = driver.getWindowHandles();
          
       System.out.println(windowhandles);
       
             
       Iterator<String> iterator=windowhandles.iterator();
       
       String windowone=iterator.next();
       System.out.println(windowone);
       Thread.sleep(2000);

       String windowtwo=iterator.next();
       System.out.println(windowtwo);
       Thread.sleep(5000);

      
       

     //  driver.switchTo().window(windowone);
     //  System.out.println(driver.getTitle());
       driver.switchTo().window(windowtwo);
       System.out.println(driver.getTitle());
       
       Set<String> win = driver.getWindowHandles();
       System.out.println(win);
       
       Iterator<String> iterator1=windowhandles.iterator();
       
       String winone=iterator1.next();
       System.out.println(winone);
       
       Thread.sleep(5000);

       String wintwo=iterator1.next();
       System.out.println(wintwo);
       
       Thread.sleep(5000);
       String winthree=iterator1.next();
       System.out.println(winthree);
       Thread.sleep(5000);

       driver.switchTo().window(winthree);
       System.out.println(driver.getTitle());
                   
      WebDriverWait wait1 = new WebDriverWait(driver, 10);
       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='PERSON_NM_LST']")));
       //driver.switchTo().window("Intake Inquiry Search");
       driver.findElement(By.xpath("//input[@name='PERSON_NM_LST']")).sendKeys("abc");
       
            

	}

}
