package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EtrainAssignment {

	public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().setup();	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("https://etrain.info/in");
	    
	    driver.findElement(By.id("tbsfi1")).sendKeys("pune");
		driver.findElement(By.id("suggest_row1")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("tbsfi3")).sendKeys("mumbai");
		driver.findElement(By.cssSelector("div.ui-autocomplete.ui-menu>div:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector("#et_autocomplete #suggest_row3")).click();
		
		
		driver.findElement(By.id("tbsfi4")).click();
		driver.findElement(By.cssSelector("input[class='nav']")).click();

		driver.findElement(By.cssSelector("[class=\"dptbl noinnerborder\"] tr:nth-of-type(4)>td:nth-of-type(5)")).click();
		
		
		driver.findElement(By.cssSelector(".mrgd #tbsfi5")).click();
		driver.findElement(By.id("tbssbmtbtn")).click();
		
		List<WebElement> trainList=driver.findElements(By.cssSelector("[class=\"trainlist rnd5\"] tbody>tr>td:nth-of-type(2)"));
		List<WebElement> trainNos=driver.findElements(By.cssSelector("[class=\"trainlist rnd5\"] tbody>tr>td:nth-of-type(1)"));
		
		    System.out.println(trainList.size());
		    for(int i=0;i<trainList.size();i++) {
			System.out.println(trainNos.get(i).getText()+":"+trainList.get(i).getText());
		}
		driver.close();
		
	}

	}

