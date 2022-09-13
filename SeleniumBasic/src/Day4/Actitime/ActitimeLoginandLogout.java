package Day4.Actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginandLogout {

	public static void main(String[] args) throws InterruptedException {
    String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
    // setting the path for driver executable
    System.setProperty("webdriver.chrome.driver", ChromeExePath);
    // creating an instance of chrome browser and up-casting it to WebDriver
    WebDriver driver=new ChromeDriver();
    // to enter required application URL use get() WebDriver interface
    driver.get("https://demo.actitime.com/");
    // implicit wait
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    // to get title from the application use getTitle() of WebDriver interface
    String pageTitle=driver.getTitle();
    System.out.println("Page Title is :"+pageTitle);
    System.out.println("Page Title length is :"+pageTitle.length());
    String expectedTitle="actiTIME - Login";
   // validation login page
    System.out.println("Title validatio status is: "+pageTitle.equals(expectedTitle));
    // identify and perform required 
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    // click on login button
    driver.findElement(By.id("loginButton")).click();
    // explicit wait (static wait)
    Thread.sleep(2000);
    // verify home page
    String HomePageTitle=driver.getTitle();
    System.out.println("Home page Title is "+HomePageTitle);
    System.out.println("Home page title validation status is :"+HomePageTitle.equals("actiTIME - Enter Time-Track"));
    // click logout link
    driver.findElement(By.id("logoutLink")).click();
    // verify login page
    System.out.println("Title validation status is :"+pageTitle.equals(expectedTitle));
    // close the browser
    driver.close();
	}
}
