package Keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperation1 {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    // To Escape of keyboard to avoid login popup
   driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
   driver.close();
	}

}
