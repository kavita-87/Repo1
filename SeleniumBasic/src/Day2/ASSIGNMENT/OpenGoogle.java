package Day2.ASSIGNMENT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
	// ASSIGNMENT 1
//	1. First, Launch the browser
//	2. Open the Google home page.
//	3. Wait for the web page to be load.
//	4. Fetch the current URL of current and web page and print it on the console
//	5. Fetch page source of current web page.
//	6. Close the browser at last.

	public static void main(String[] args) {
		String currentWorkingDir = System.getProperty("user.dir");
		String chromeExePath = currentWorkingDir + "\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String pageTitle = driver.getTitle();
		// validation using page title
		System.out.println("Page Title is :" + pageTitle);
		System.out.println("Page Title is :" + pageTitle.length());
		System.out.println("Page title validation status :" + pageTitle.equals("Google"));
		// validation using url
		String PageURL = driver.getCurrentUrl();
		System.out.println("Page URL is : " + PageURL);
		System.out.println("Page URL validation status is : " + PageURL.equals("https://www.google.com"));
		String pageContent = driver.getPageSource();
		System.out.println("Page source length is :" + pageContent.length());
		driver.close();
	}

}
