package Day2.ASSIGNMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeAndDemo {
  // ASSIGNMENT 2 
	// Open actiTIME web home page
	// validation of title page and url also Length
	
		public static void main(String[] args) {
			String currentWorkingDir=System.getProperty("user.dir");
			String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver=new ChromeDriver();
			
			//to enter the url on the open browser
			driver.get("https://demo.actitime.com/");
			
			//application title validation
			String actualTitle=driver.getTitle();
			String expectedTitle="actiTIME - Login";
			System.out.println("Actaul actiTIME page title is: "+actualTitle);
			System.out.println("Expected  actTIME page title is: "+expectedTitle);
			System.out.println("Demo title validation: "+actualTitle.equals(expectedTitle));
			
			//validation of url
			String actualUrl=driver.getCurrentUrl();
			String expectedUrl="https://demo.actitime.com/";
			System.out.println("Actaul Demo page URL is: "+actualUrl);
			System.out.println("Expected Demo page URL is: "+expectedUrl);
			System.out.println("Demo url validation: "+actualUrl.contains(expectedUrl));
			
			//page source code
			String pageSoucre=driver.getPageSource();
			System.out.println("Page source code content length: "+pageSoucre.length());
			
			//close the current browser
			driver.close();
		}
	}
