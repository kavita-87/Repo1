package CssValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssvalidationOfCourses {

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager .chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	     // implicit wait
	 		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://courses.letskodeit.com/practice");
	   // Radio button font color, size, background
	   WebElement RadioButtonExample=driver.findElement(By.cssSelector(".left-align legend"));
	   System.out.println("RadioButtonExample Color is :"+RadioButtonExample.getCssValue("color")); // font Color
	   System.out.println("RadioButtonExamplen font Size is :"+RadioButtonExample.getCssValue("font-size")); // font size
	   System.out.println("RadioButtonExample background color is :"+RadioButtonExample.getCssValue("background")); //background color
	   Thread.sleep(2000);
     // Open window button font color, size, background
	   WebElement OpenButton=driver.findElement(By.cssSelector("button[id='openwindow']"));
	   System.out.println("OpenButton Color is :"+OpenButton.getCssValue("color")); // font Color
	   System.out.println("OpenButton font Size is :"+OpenButton.getCssValue("font-size")); // font size
	   System.out.println("OpenButton background color is :"+OpenButton.getCssValue("background-color")); //background color
	   //driver.close();
}
}
