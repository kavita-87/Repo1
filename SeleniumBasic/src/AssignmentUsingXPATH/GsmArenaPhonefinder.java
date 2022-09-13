package AssignmentUsingXPATH;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmArenaPhonefinder {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.gsmarena.com/");
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  List<WebElement> PhoneFinderName=driver.findElements(By.xpath("//*[@id='body']/aside/div[1]"));
  for(int i=0;i<PhoneFinderName.size();i++) {
      WebElement Name=PhoneFinderName.get(i);
      System.out.println("Menu name Print :"+ Name.getText());
	}
	}
}
