package SeleniumTutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Three {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Namita\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();

		// System.setProperty("webdriver.ie.driver",
		// "C:\\Namita\\IEDriverServer_Win32_3.150.2\\IEDriverServer.exe");
		// WebDriver driver=new InternetExplorerDriver();

		//System.setProperty("webdriver.edge.driver", "C:\\Namita\\edgedriver_win32\\msedgedriver.exe");

		//WebDriver driver = new EdgeDriver();
		 
		 System.setProperty("webdriver.ie.driver", "C:\\Namita\\IEDriverServer_Win32_3.150.2\\IEDriverServer.exe");  
			WebDriver driver=new InternetExplorerDriver();  
			
		

		String appUrl = "http://172.27.32.137:8005/flsacwis/Sacwis.jsp";
		driver.get(appUrl);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 driver.findElement(By.id("username")).sendKeys("ds65506 ");
		 driver.findElement(By.id("password")).sendKeys("ap");
		 driver.findElement(By.id("btnSubmit")).click();
		 
	Actions a = new Actions(driver);
	
	WebElement menu=driver.findElement(By.id("create"));
	
	System.out.println(driver.getPageSource());
	

	
//	WebElement menu1= driver.findElement(By.xpath("createMenu3"));
	 
//	menu.click();
	
	//a.moveToElement(menu1)
	
	//WebElement menu1=driver.findElement(By.xpath("//*[text()='Hotline Intake']"));
	

	
//	menu1.click();
	
///	a.moveToElement(menu1).click().build().perform();
	
	
	

		// System.out.println(driver.getPageSource());

		// driver.findElement(By.id("LOGON_selectedUser")).click();

		// WebDriverWait wait = new WebDriverWait(driver,30);

		// WebElement slctPorfile= driver.findElement(By.id("LOGON_selectedUser"));

		// driver.findElement(By.xpath("//*[@id=\"LOGON_selectedUser\"]/option[2]")).click();

		// driver.findElement(By.xpath("//tr[3]/td/input[1]")).click();

	}

	// chbx.get(2).click();

}
