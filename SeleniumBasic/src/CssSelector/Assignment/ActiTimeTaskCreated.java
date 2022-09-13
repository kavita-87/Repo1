package CssSelector.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTaskCreated {

	public static void main(String[] args) throws InterruptedException {
		String ChromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// validate login page
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is :" + pageTitle);
		System.out.println("Page Title length is :" + pageTitle.length());
		String expectedTitle = "actiTIME - Login";
		System.out.println("Title validatio status is: " + pageTitle.equals(expectedTitle));
		// identify and perform required
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// click on login button
		driver.findElement(By.id("loginButton")).click();
		// explicit wait (static wait)
		Thread.sleep(2000);
		// verify home page
		String HomePageTitle = driver.getTitle();
		System.out.println("Home page Title is " + HomePageTitle);
		System.out.println("Home page title validation status is :" + HomePageTitle.equals("actiTIME - Enter Time-Track"));
        // Click Task Tab
		driver.findElement(By.cssSelector("td:nth-child(4) > a > div.label")).click();
		// click on Add Button
		driver.findElement(By.cssSelector("div.title.ellipsis")).click();
		// Click on new task
		driver.findElement(By.cssSelector("div.item.createNewTasks")).click();
		// In New task choose field which u want
		driver.findElement(By.cssSelector("div.projectSelector")).click();
		driver.findElement(By.cssSelector("div.projectSelector>div.components_combobox")).click();
		
         // Create new Task create task Button
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder']")).click();
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder']")).sendKeys("Testing20");
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.commitButtonPlaceHolder>div.components_button")).click();
		driver.findElement(By.cssSelector("div.createdTasksTableContainer tbody .checkbox")).click();
		driver.findElement(By.cssSelector("div.delete")).click();
		driver.findElement(By.cssSelector(".buttonsContainer>div.submitBtn span")).click();
	}
	} 