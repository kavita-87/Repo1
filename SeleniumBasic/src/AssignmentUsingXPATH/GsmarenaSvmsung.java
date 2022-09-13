package AssignmentUsingXPATH;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmarenaSvmsung {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[contains(@class,'brandmenu-v2')]/ul//child::a[text()='Samsung']")).click();
List<WebElement> svmsungphonename = driver.findElements(By.xpath("//div[contains(@class,'makers')]/ul/li/a/strong/span"));
		for (int i = 0; i < svmsungphonename.size(); i++) {
			System.out.println("Svmsung phone name is :" + svmsungphonename.get(i).getText());
		}
		driver.close();
	}
}