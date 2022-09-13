package AssignmentUsingXPATH;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricinfo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.espncricinfo.com/");
	     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   //application title validation
			String actualTitle=driver.getTitle();
			String expectedTitle="Live cricket scores, match schedules, latest cricket news, cricket videos";
			System.out.println("Actual Cricinfo page title is: "+actualTitle);
			System.out.println("Expected  Cricinfo title is: "+expectedTitle);
			System.out.println("Demo title validation: "+actualTitle.equals(expectedTitle));

		    List<WebElement> menuName=driver.findElements(By.xpath("//div/nav/div/div/div/div[2]/div[1]"));
		    System.out.println("Menu Count is :"+menuName.size());
		    for(int i=0;i<menuName.size();i++) {
		    	WebElement elements=menuName.get(i);
		    	System.out.println("Menu name is :" +elements.getText());
		    }
	}
}
