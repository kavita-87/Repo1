package CssSelector.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmArenaAndPagination {

	public static void main(String[] args) throws InterruptedException {
     String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", ChromeExePath);
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
     // 1. Open Gsmarena.com
     driver.get("https://www.gsmarena.com/");
    // validation home page
     String HomePageTitle=driver.getTitle();
     System.out.println("Actual Home page title is :"+HomePageTitle);
     String ExpectedTitle="GSMArena.com - mobile phone reviews, news, specifications and more...";
     System.out.println("Validation home page title status is :"+HomePageTitle.equals(ExpectedTitle));
     // 3. click on RealMe phone link present in phone finder
	  driver.findElement(By.cssSelector("a[href='realme-phones-118.php']")).click();
	 // 4.get Realme finder page url
	  driver.getCurrentUrl();
	  //5. pagination of 1st page of Realme and print RealMe phone option and url
	  driver.findElement(By.cssSelector("div.nav-pages>strong"));
	  System.out.println("Current Url is 1st page of RealMe :"+driver.getCurrentUrl());
	  List<WebElement> RealmePhoneOption=driver.findElements(By.cssSelector("div.makers>ul>li>a>strong>span"));
	  for(int i=0;i<RealmePhoneOption.size();i++) {
		  WebElement elements=RealmePhoneOption.get(i);
	    	System.out.println("Menu name is :" +elements.getText());
	    	}
	 // 6.pagination of 2nd page of Realme and print RealMe phone option and url
	  driver.findElement(By.cssSelector("div.nav-pages > a:nth-child(3)")).click();
	  System.out.println("Current Url is 2 page ReamMe :"+driver.getCurrentUrl());	
	  Thread.sleep(2000);
	  // 6.pagination of 3rd page of Realme and print RealMe phone option and url
	  driver.findElement(By.cssSelector("div.nav-pages > a:nth-child(4)")).click();
	  System.out.println("Current Url is 3 page RealMe :"+driver.getCurrentUrl());
	  Thread.sleep(2500);
	  // 7. Pagination is
	 System.out.println("Pagination is :");
	  driver.findElement(By.cssSelector("div.col.col-1-5.pages-next-prev.float-right > a.pages-prev")).click();
	  System.out.println("Pagination of Previous of ReamMe :"+driver.getCurrentUrl());	
	  driver.close();
	}

} 
//