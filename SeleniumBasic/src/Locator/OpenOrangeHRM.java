package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenOrangeHRM {

	public static void main(String[] args) {
     String currentworkingdir=System.getProperty("user.dir");
     String chromeExePath=currentworkingdir+"\\Executables\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", chromeExePath);
     WebDriver driver=new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/");
     String actualtitle=driver.getTitle();
     String expectedTitle="OrangeHRM";
     System.out.println("actual Pagetitle is :"+actualtitle); 
     System.out.println(" Expected title is: "+expectedTitle);
     System.out.println("Page title validation status is :"+actualtitle.equals(expectedTitle));
     
     String actualurl=driver.getCurrentUrl();
     String expectedurl="https://opensource-demo.orangehrmlive.com/";
     System.out.println("home page validation status is :"+ actualurl.contains(expectedurl));
     String pagesource=driver.getPageSource();
     System.out.println("Page source and length: "+pagesource.length());
     
     // identify and type username as admin
     WebElement usernameInputfield=driver.findElement(By.name("txtUsername"));
     usernameInputfield.sendKeys("admin");
     // identify and type password as admin123
     WebElement pwdInputfield=driver.findElement(By.id("txtPassword"));
     pwdInputfield.sendKeys("admin123");
     // identify and click on login button
     WebElement loginbtn=driver.findElement(By.id("btnLogin"));
     loginbtn.click();
     // Home page validation
     String homepageurl=driver.getCurrentUrl();
     System.out.println("home page url validation status is : "+homepageurl.contains("dashboard"));
     driver.close();
     
  
	}

}
