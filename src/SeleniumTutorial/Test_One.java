package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\Namita\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new InternetExplorerDriver();

		String appUrl = "http://172.27.32.137:8008/flsacwis/Sacwis.jsp";
		driver.get(appUrl);
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DS65506");
		driver.findElement(By.id("password")).sendKeys("ap");
		driver.findElement(By.id("btnSubmit")).click();

		// driver.switchTo().frame(0);

		// driver.switchTo().frame("retrievingFrame");

		// int size = driver.findElements(By.tagName("iframe")).size();

		// System.out.println(size);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElement(By.id("LOGON_selectedUser")).click();

		// Select drpPrfl = new Select(driver.findElement(By.id("LOGON_selectedUser")));

		// drpPrfl.selectByValue("040800-NASSAU CO BRD OF CO COMM-ADMIN - DCF Zone
		// Licensing Agent");

		// driver.findElement(By.id("btnContinue")).click();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		// driver.findElement(By.id("create")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		((JavascriptExecutor) driver).executeScript(
				"MenuItemClick('/flsacwis/sm/sm02/SM02_AccessReport?action=CREATE_HOTLINE_INTAKE&ACCESS_CD_ACCESS_TYPE=1&ACCESS_CD_INTL_SUB=1')");

		// WebElement n=driver.findElement(By.id("createMenu3"));

		// Actions a = new Actions(driver);
		// a.moveToElement(n).perform();
		// a.click();

		// driver.findElement(By.xpath("//div[@id='createMenu3']")).click();

		// WebElement m=driver.findElement(By.xpath("//span//div[@text()='Child
		// Intake']"));

		// move to element and click
		// a.moveToElement(m).click().perform();

	}

}
