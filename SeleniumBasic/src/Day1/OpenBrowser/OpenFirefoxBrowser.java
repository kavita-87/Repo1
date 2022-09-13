package Day1.OpenBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","D:\\JavaWorkspace\\SeleniumBasic\\Executables\\geckodriver.exe");
	FirefoxDriver fdriver=new FirefoxDriver();
	fdriver.get("https:\\www.google.com");
	}
}
