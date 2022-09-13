package HrmActitimeAndVtigerAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtility;

public class OrangeHRM {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// click on PIM
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		// click On Add Employee
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab']/a")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kavita", Keys.TAB, "Anant", Keys.TAB,
				"Shete", Keys.TAB, "4343");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Click on Emoloyee
		//driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();

		// Edit Employee Information
		driver.findElement(By.xpath("//div[text()='Kavita Anant']")).click();
		//driver.findElement(By.xpath("//div[1]/form/div[1]/div[2]/div/div/div[2]/input")).clear();
		driver.findElement(By.xpath("//div[1]/form/div[1]/div[2]/div/div/div[2]/input")).sendKeys("Kavi");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       
       // click on PIM
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		// Click on CheckBox to delete 
      driver.findElement(By.xpath("//div/div[2]/div[24]/div/div[1]/div/div/label/span/i"));

       driver.findElement(By.xpath("//div/div[2]/div[1]/div/div[9]/div/button[1]/i")).click();  
       //delete Yes Popup
       driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
       System.out.println("hi");
	}    
	}
