package Day1.OpenBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\JavaWorkspace\\SeleniumBasic\\Executables\\chromedriver.exe");
	ChromeDriver cdriver=new ChromeDriver();
	cdriver.get("https://www.google.com");
	} 
}
