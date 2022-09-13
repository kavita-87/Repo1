package CssSelector.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaPhoneCount {

	public static void main(String[] args) throws InterruptedException {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", ChromeExePath);
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.get("https://www.demoblaze.com/");
	    Thread.sleep(2000);
       List<WebElement> deviceName= driver.findElements(By.cssSelector("div#tbodyid h4"));
       System.out.println("device Name is :"+deviceName.size());
	   List <WebElement> devicePrice= driver.findElements(By.cssSelector("div#tbodyid h5"));
	    for(int i=0;i<deviceName.size();i++ ) {
	    	System.out.println(deviceName.get(i).getText()+":"+devicePrice.get(i).getText()); 
	    }    
	}
}
