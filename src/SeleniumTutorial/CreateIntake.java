package SeleniumTutorial;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateIntake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		 System.setProperty("webdriver.ie.driver", "C:\\Namita\\IEDriverServer_Win32_3.150.2\\IEDriverServer.exe");  
			WebDriver driver=new InternetExplorerDriver();  
			
	       
				
       String appUrl = "http://172.27.32.137:8008/flsacwis/Sacwis.jsp";
       driver.get(appUrl);
       driver.manage().window().maximize();
       
       driver.findElement(By.id("username")).sendKeys("DS65506");
       driver.findElement(By.id("password")).sendKeys("ap");
       driver.findElement(By.id("btnSubmit")).click();

       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
       ((JavascriptExecutor)driver).executeScript("MenuItemClick('/flsacwis/sm/sm02/SM02_AccessReport?action=CREATE_HOTLINE_INTAKE&ACCESS_CD_ACCESS_TYPE=1&ACCESS_CD_INTL_SUB=1'))");
       

       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
       
       Set<String> windows = driver.getWindowHandles();

       for(String temp : windows)
       {
           System.out.println(driver.switchTo().window(temp).getTitle());
       }
       
       driver.switchTo().activeElement();
     
       WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title=\"Person Provider Inquiry Search\"]")));
       driver.switchTo().window("Intake Inquiry Search");
       driver.findElement(By.xpath("//input[@name='PERSON_NM_LST']")).sendKeys("abc");
       
            

	}

}
