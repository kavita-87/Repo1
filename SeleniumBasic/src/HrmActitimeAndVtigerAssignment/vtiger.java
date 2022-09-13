package HrmActitimeAndVtigerAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class vtiger {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	WebElement UsernameInputField=driver.findElement(By.id("username"));
	UsernameInputField.clear();
	UsernameInputField.sendKeys("admin",Keys.TAB);
    WebElement PwdInputField=driver.findElement(By.name("password"));
    PwdInputField.sendKeys("Test@123",Keys.ENTER);
    //Click On Add Widget
    driver.findElement(By.xpath("//i[@class='caret']")).click();
    driver.findElement(By.cssSelector("a[data-name='History']")).click();
    driver.findElement(By.cssSelector("a[data-name=\"GroupedBySalesStage\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[data-name=Notebook]")).click();
    driver.findElement(By.xpath("//i[@title=\"Remove\"]")).click();
    //driver.findElement(By.xpath("")).click();
    
	}

}////*[@id="tab_2"]/div/div[1]/div/div[1]/ul/li[1]/a
