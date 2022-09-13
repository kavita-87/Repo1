package Keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperations2 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		    WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com/login.do");
		
		//login in actitime application using Enter key
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}
}
