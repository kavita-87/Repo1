package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultiSelectDropdownList {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.get("https://omayo.blogspot.com/");
    // identify dropdown list
    WebElement carDropdown=driver.findElement(By.cssSelector("#multiselect1"));
    // create an instance of select class and pass above element into its constructor
    Select selectSkills=new Select(carDropdown);
    // check whether dropdown is multiselected or not
    System.out.println("is multiselected or not :"+selectSkills.isMultiple());
      // get default already select option
  WebElement selectedOption=selectSkills.getFirstSelectedOption();
    // or
  //  String selectedOptionName=selectedOption.getText();
  // System.out.println("Alredy selected option Name :"+selectSkills.getFirstSelectedOption().getText());
    // get option count
    List<WebElement> Options=selectSkills.getOptions();
    System.out.println("Option Count is:"+Options.size());
    // get dropdown options name
    for(int i=0;i<Options.size();i++) {
    	System.out.println("Get Options Name:"+i+":"+Options.get(i).getText());
    }
    // select Options from Dropdown 
    selectSkills.selectByIndex(0);
    selectSkills.selectByIndex(2);
    selectSkills.selectByIndex(3);
    selectSkills.selectByValue("Volvo");
    System.out.println("Alredy selected option Name :"+selectSkills.getFirstSelectedOption().getText());
    selectSkills.selectByVisibleText("Audi");
    // Unselect already Options
   // selectSkills.deselectByIndex(0);
   // selectSkills.deselectByValue("Volvo");
  //  selectSkills.deselectByVisibleText("Audi");
    
    // or
  //  selectSkills.deselectAll();
    driver.close();
	}

}
