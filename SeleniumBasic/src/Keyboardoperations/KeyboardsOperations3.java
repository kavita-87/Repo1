package Keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardsOperations3 {

	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get("https://demo.automationtesting.in/Register.html");
     // identify the first name input field
    WebElement firstname= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
    
    for(int i=0;i<3;i++) {
    	firstname.sendKeys(Keys.TAB);
    	//Thread.sleep(2000);
    }
     // type first name as admin and use ctrl+a
   // firstname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
   // firstname.sendKeys(Keys.chord(Keys.CONTROL,"c")); // copy the content
    // In last name field use ctrl+v
    // and paste the first name in last name field
//   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).
//   sendKeys(Keys.chord(Keys.CONTROL,"v",Keys.TAB,"Sahkar Nagar, Khopoli"));
  // driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.TAB,"Sahkar Nagar, Khopoli");
   
   
   
   
   
   
	}
}
