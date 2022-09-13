package Day4.Actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

		public static void main(String[] args) throws InterruptedException {
		    String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		    // setting the path for driver executable
		    System.setProperty("webdriver.chrome.driver", ChromeExePath);
		    // creating an instance of chrome browser and up-casting it to WebDriver
		    WebDriver driver=new ChromeDriver();
		    // to enter required application URL use get() WebDriver interface
		 // implicit wait
		    //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		    driver.get("https://demo.opensource-demo.orangehrmlive.com/");
		    
		    // to get title from the application use getTitle() of WebDriver interface
		    String pageTitle=driver.getTitle();
		    System.out.println("Page Title is :"+pageTitle);
		    System.out.println("Page Title length is :"+pageTitle.length());
		    String expectedTitle="OrangeHRM";
		    System.out.println("Title validatio status is: "+pageTitle.equals(expectedTitle));
		  
		    // identify and perform required 
		    driver.findElement(By.name("username")).sendKeys("admin");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    // click on login button
		    driver.findElement(By.id("btnLogin")).click();
		  
		    // verify home page
		   String homepageURL=driver.getCurrentUrl();
		   System.out.println("Home page URL is: "+homepageURL);
		   System.out.println("Home page validation status is :"+homepageURL.contains("dashboard"));
		   driver.findElement(By.id("welcome")).click();
		   
		    // click logout link
		    driver.findElement(By.linkText("Logout")).click();
		    // close the browser
		  //  driver.close();
	}

}
