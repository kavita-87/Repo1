package Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
    // open chrome browser and enter url
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// enter application url
		driver.get("https://demosite.executeautomation.com/Login.html");
		// enter username as execution
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		// click on login button
		driver.findElement(By.cssSelector("input[name='Login']"));
		System.out.println("hi");
		//driver.close();
	}
}
