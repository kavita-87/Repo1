package Day2.ASSIGNMENT;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
     // open facebook and validation of Titlepage and URL
	
	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String pageTitle=driver.getTitle();
		System.out.println("Page title is"+pageTitle);
		System.out.println("Page title length"+pageTitle.length());
		String expectedTitle="Facebook – log in or sign up";
		System.out.println("Title validation status :"+pageTitle.equals(expectedTitle));
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page url is"+pageUrl);
		String expectedURL="https://www.facebook.com";
		System.out.println("Url validation status is"+pageUrl.contains(expectedURL));
		String pageSource=driver.getPageSource();
		System.out.println("Page source: "+pageSource);
		System.out.println("Page source: "+pageSource.length());
		//close the current browser
		driver.close();
	}
	}