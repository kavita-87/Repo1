package CssValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssValidation1 {

	public static void main(String[] args) {
    WebDriverManager .chromedriver().setup();
    WebDriver driver=new ChromeDriver();
     // implicit wait
 		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
   driver.manage().window().maximize();
   driver.get("https://demo.vtiger.com/vtigercrm/index.php");
   WebElement SignInButton=driver.findElement(By.cssSelector("button[type='submit']"));
   System.out.println("Font Color is :"+SignInButton.getCssValue("color")); // font Color
   System.out.println("Font size is :"+SignInButton.getCssValue("font-size")); // font size
   System.out.println("Sign in button background color is :"+SignInButton.getCssValue("background-image")); // Background image
   // forget password color and font size
   WebElement ForgetPasswordLink=driver.findElement(By.cssSelector(".forgotPasswordLink "));
   System.out.println("ForgetPasswordLink color :"+ForgetPasswordLink.getCssValue("color")); // font Color
   //System.out.println("ForgetPasswordLink font size :"+ForgetPasswordLink.getCssValue("color")); // font size
   }
}
   //Validation of Display
/**
 * Open a browser and enter vtiger application URL 
 * validate in login page Signin
 * 			button is displayed in Green color(code) 
 * 			Signin text size is 16px 
 * 			Signin text in white color(code) 
 * 			Forgot Password ? is displayed in Blue color(code)
 */
