package ExplicityWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.FluentWait;


public class FluentWait1 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    WebDriver driver= new ChromeDriver();
		    driver.get("https://demo.actitime.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   driver.findElement(By.id("username")).sendKeys("admin");
		    // type password as manager
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   // click on login button
		   driver.findElement(By.id("loginButton")).click();
		 //fluent Wait declaration
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(@class,'logout')]/a")));
		driver.findElement(By.xpath("//td[contains(@class,'logout')]/a")).click();
		
		System.out.println("Home page title: "+driver.getTitle());
	}
}
