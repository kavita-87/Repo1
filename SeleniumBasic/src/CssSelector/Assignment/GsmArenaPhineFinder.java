package CssSelector.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaPhineFinder {

	public static void main(String[] args) {
    String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", ChromeExePath);
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.get("https://www.gsmarena.com/");
    // validate home page
    String actualTitle=driver.getTitle();
	String expectedTitle="GSMArena.com - mobile phone reviews, news, specifications and more...";
	System.out.println("Actual gsmarena home page title is: "+actualTitle);
	System.out.println("Expected  gsmarena home page title is: "+expectedTitle);
	System.out.println("gsmarena title validation: "+actualTitle.equals(expectedTitle));
	
	 List<WebElement> PhoneFinderName=driver.findElements(By.cssSelector("div.brandmenu-v2>ul>li>a")); 
	 for(int i=0;i<PhoneFinderName.size();i++) {
         WebElement Name=PhoneFinderName.get(i);
         System.out.println("Menu name Print :"+ Name.getText());
	}
	// driver.close();
	}
}
