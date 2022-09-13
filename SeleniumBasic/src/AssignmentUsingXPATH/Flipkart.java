package AssignmentUsingXPATH;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
   List<WebElement> menucount=driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/div"));
   System.out.println("MenuCount is: "+menucount.size());
   List<WebElement> menuName=driver.findElements(By.xpath("//div/div/a/div[2]"));
   for(int i=0;i<menuName.size();i++) {
    WebElement Name=menuName.get(i);
    System.out.println("Menu name Print :"+ Name.getText());
   }
	}
}
