package CssValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTIMEXYValidation {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("https://demo.actitime.com/");
    // implicit wait
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector("#loginButton")).click();
    WebElement erromesg= driver.findElement(By.cssSelector(".errormsg"));
    System.out.println("errormessage masg text :"+erromesg.getText());
    System.out.println("errormessage color :"+erromesg.getCssValue("color"));// get font color of errormessage
    System.out.println("errormessage color :"+erromesg.getCssValue("font-size"));// get font size of errormessage
    
    // get location of errormessage
    Point locationErrorMsg=erromesg.getLocation();
    int errormessageX=locationErrorMsg.getX();
    int errormessagey=locationErrorMsg.getY();
   
    //username input field location
    WebElement InputUserField=driver.findElement(By.id("username"));
    Point InputUsernameFieldLocation=InputUserField.getLocation();
    int   UsernameFieldLocationX=InputUsernameFieldLocation.getX();
    int   UsernameFieldLocationY=InputUsernameFieldLocation.getY();
   
    System.out.println("Username x cord :"+UsernameFieldLocationX);
    System.out.println("Username Y cord :"+UsernameFieldLocationY);
    
    System.out.println("is error message is displayed above username input field :"+(errormessagey<UsernameFieldLocationY));   
	driver.close();
	}
}  
