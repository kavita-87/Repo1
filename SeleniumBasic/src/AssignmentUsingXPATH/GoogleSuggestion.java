package AssignmentUsingXPATH;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.get("https://www.google.com/");
	    // type selenium interview questions
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium Interview Questions");
     Thread.sleep(2000);
	    // get all the suggestions 
	    List<WebElement> sugg=driver.findElements(By.xpath("/html/body//ul/div"));
	    // suggestion count
	    System.out.println("Suggestion count: "+sugg.size());
	    // print suggestions in the console
	    for(int i=0;i<sugg.size();i++) {
	    	WebElement element=sugg.get(i);
	    	//System.out.println(element.getText());
	    	// or
	    	System.out.println(sugg.get(i).getText());
	    }
      driver.close();
	  
	  
	  
	}

}
