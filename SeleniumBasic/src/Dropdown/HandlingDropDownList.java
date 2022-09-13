package Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownList {
	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		// step1: set driver executable path by using System.setProperty(String
		// key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");
		// Identify Dropdown list
		WebElement SkillDropdwon = driver.findElement(By.id("Skills"));
		// **** Create an instance of Select class and pass above element into its
		// constructor
		Select SelectSkills = new Select(SkillDropdwon);
		// **** check whether dropdown is multiselect dropdown or not
		System.out.println("Select is Multiselected or not :" + SelectSkills.isMultiple());
		// **** get default or already select option
		WebElement SelectOptions = SelectSkills.getFirstSelectedOption();
		String selectedOptionName = SelectOptions.getText();
		System.out.println("Already selected option name :" + selectedOptionName);
		// or
		// System.out.println("Alredy selected option
		// name"+SelectSkills.getFirstSelectedOption().getText());
		// get Option count
		List<WebElement> Options = SelectSkills.getOptions();
		System.out.println("SlectSkills options count is" + Options.size());
		// Get dropdown option names
		for (int i = 0; i < Options.size(); i++) {
		System.out.println("Dropdown Options names: " + Options.get(i).getText());
		}
			//TODO: validation dropdown skills are getting displayed in ascending order
	
			// OR
			// select options from dropdown
		SelectSkills.selectByIndex(4);
		System.out.println("Already selected option name: " + SelectSkills.getFirstSelectedOption().getText());
        // OR selctskills name by its value based
		SelectSkills.selectByValue("APIs");
		System.out.println("Already selected option name: "+SelectSkills.getFirstSelectedOption().getText());
		//or
		SelectSkills.selectByVisibleText("Analytics");
		System.out.println("Already selected option name: "+SelectSkills.getFirstSelectedOption().getText());
			
				//TODO: perform validation on following
				//1. Year(ascending order validation)
		List<String> actual=new ArrayList<String>();
		for (int j=1; j<Options.size();j++) {
		actual.add(SelectSkills.getOptions().get(j).getText());	
		}
		List<String> duplist=new ArrayList();
		duplist.addAll(actual);
		Collections.sort(actual);
		System.out.println("Actual List is:"+actual);
		System.out.println("duplist is :"+duplist);
		System.out.println(actual.equals(duplist));
		driver.close();
				//2. Month(month Sequence validation)
				//3. Days(ascending order validation)
	}
}
