package Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenActitimeWithLocator {

	public static void main(String[] args) throws InterruptedException {
		// String CurrentWorkingDir=System.getProperty("User.dir");
		// String FirefoxExePath=CurrentWorkingDir+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", "D:\\JavaWorkspace\\SeleniumBasic\\Executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/");
		// define Implicit wait for browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualpageTitle = driver.getTitle();
		String expectedpageTitle = "actiTIME - Login";
		System.out.println("actural page title is : " + actualpageTitle);
		System.out.println("PageTitle validation status is :" + actualpageTitle.equals(expectedpageTitle));

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://demo.actitime.com/";
		System.out.println("page url validation status is :" + actualUrl.contains(expectedUrl));

		String pagesource = driver.getPageSource();
		System.out.println("Pagesource is: " + pagesource.length());

		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		// Identify password field element
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.clear();
		pwd.sendKeys("manager");
		WebElement loginbtn = driver.findElement(By.id("loginButton"));
		loginbtn.click();
		// Explicitly wait (Static wait)
		Thread.sleep(2000);
		// verify home page
		String homepageTitle = driver.getTitle();
		System.out.println("Home page title is : " + homepageTitle);
		System.out.println("home page validation status is :" + homepageTitle.equals("actiTIME - Enter Time-Track"));
		WebElement logoutbtn = driver.findElement(By.linkText("logoutLink"));
		logoutbtn.click();
		driver.close();
	}
}
