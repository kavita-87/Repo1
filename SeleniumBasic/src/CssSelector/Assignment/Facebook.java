package CssSelector.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", ChromeExePath);
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    // 1. Open Facebook browser
	    driver.get("https://www.facebook.com/");
	 // 2.validation home page
	     String HomePageTitle=driver.getTitle();
	     System.out.println("Actual Facebook Home page title is :"+HomePageTitle);
	     String ExpectedTitle="Facebook – log in or sign up";
	     System.out.println("Validation of Facebook home page title status is :"+HomePageTitle.equals(ExpectedTitle));
	    Thread.sleep(2000);
	    // 3. click on create an Account button
	  driver.findElement(By.cssSelector("div:nth-child(9)")).click();
	  // perform Operations on browser day, month and year dropdown
	    driver.findElement(By.id("day")).click();
	    WebElement DayInputField=driver.findElement(By.id("day"));
	     System.out.println("DayInputField is displayed or not? :"+DayInputField.isDisplayed());
	     System.out.println("DayInputField is functional or not? :"+DayInputField.isEnabled());	  
	  // on month field operations
	     driver.findElement(By.id("month")).click();
		    WebElement MonthInputField=driver.findElement(By.id("month"));
		     System.out.println("MonthInputField is displayed or not? :"+MonthInputField.isDisplayed());
		     System.out.println("MonthInputField is functional or not? :"+MonthInputField.isEnabled());	 
      // perform on operations on YearInputField
		     driver.findElement(By.id("year")).click();
	      WebElement YearInputField=driver.findElement(By.id("year"));
			     System.out.println("YearInputField is displayed or not? :"+YearInputField.isDisplayed());
			     System.out.println("YearInputField is functional or not? :"+YearInputField.isEnabled());	
			     Thread.sleep(2000);
	  //   perform operation on GenderInputField 
			     driver.findElement(By.cssSelector("span:nth-child(1)")).click();
			      WebElement GenderInputField=driver.findElement(By.cssSelector("span:nth-child(1)"));
		  System.out.println("GenderInputField is displayed or not? :"+GenderInputField.isSelected());
		 // System.out.println("GenderInputField is functional or not? :"+GenderInputField.isEnabled());
	}

}//
