package Day5.UsingDispMethodAndOthers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidationMEthod {

	public static void main(String[] args) {
     String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", ChromeExePath);
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.actitime.com/");
     // imprlicitly wait for browser
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     // identify Username field
     WebElement userNameInputField=driver.findElement(By.id("username"));
     System.out.println("usernameInputField is displayed or not? :"+userNameInputField.isDisplayed());
     System.out.println("usernameInputField is functional or not? :"+userNameInputField.isEnabled());
     String defaultvaluedUsernameInputField=userNameInputField.getAttribute("placeholder");
     System.out.println("defaultvaluedUsernameInputField is :"+defaultvaluedUsernameInputField);
     System.out.println("Defaulat value of username input field validation is :"+defaultvaluedUsernameInputField.equals("Username"));
     
     // Identify password field
     WebElement PasswordInputField=driver.findElement(By.name("pwd"));
     System.out.println("PasswordInputField is displayed or not? :"+PasswordInputField.isDisplayed());
     System.out.println("PasswordInputField is functional or not? :"+PasswordInputField.isEnabled());
     String defaultvaluePassrordInputField=PasswordInputField.getAttribute("placeholder");
     System.out.println("default password input field is :"+defaultvaluePassrordInputField);
     System.out.println("default password input field validation Status is :"+defaultvaluePassrordInputField.equals("Password"));
     
     // Identify login button
     WebElement loginButtonInputField= driver.findElement(By.id("loginButton"));
     System.out.println("Login button is dsiplayed or not? :"+loginButtonInputField.isDisplayed());
     System.out.println("Login button is Enabled or not? :"+loginButtonInputField.isEnabled());
     String defaultbuttonname=loginButtonInputField.getText();
     System.out.println("login button validation status is : "+loginButtonInputField.equals("Login"));
     
     // Identify keep me logged in Label
     WebElement keepLoggedInLabelCheckBoxText= driver.findElement(By.id("keepLoggedInLabel"));
     System.out.println(keepLoggedInLabelCheckBoxText.isDisplayed());
     System.out.println(keepLoggedInLabelCheckBoxText.isEnabled());
     String CheckBoxTextName=keepLoggedInLabelCheckBoxText.getText();
     System.out.println(CheckBoxTextName.equals(loginButtonInputField));
     
     driver.close();
          }

}
