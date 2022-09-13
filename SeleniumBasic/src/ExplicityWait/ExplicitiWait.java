package ExplicityWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitiWait {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("https://demo.actitime.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    // EXPLICITLYWAIT (dynamic wait)
    WebDriverWait Wait=new WebDriverWait(driver,20);
  //identify and perform required operation
   driver.findElement(By.id("username")).sendKeys("admin");
    // type password as manager
   driver.findElement(By.name("pwd")).sendKeys("manager");
   // click on login button
   driver.findElement(By.id("loginButton")).click();
 //wait for Logout link to be loaded in the page
  Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
   System.out.println("Home page Title :"+driver.getTitle());
   // add condition to wait using WebDriverWait instance
   Wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutLink"))));
   // click on logout link
   driver.findElement(By.id("logoutLink")).click();
  // close the browse
   driver.close();
	}

}
