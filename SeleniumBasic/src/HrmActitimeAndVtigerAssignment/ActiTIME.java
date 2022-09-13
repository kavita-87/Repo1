package HrmActitimeAndVtigerAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;

public class ActiTIME {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://demo.actitime.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		// Click on Task
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		// click on add button
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		// click on new task
		driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		// Project to Add Tasks for
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder']")).click();
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder']")).sendKeys("Testing4");
		// Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.commitButtonPlaceHolder>div.components_button")).click();
		driver.findElement(By.cssSelector("div.createdTasksTableContainer tbody .checkbox")).click();
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
	}
}