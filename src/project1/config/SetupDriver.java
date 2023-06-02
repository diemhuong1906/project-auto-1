package project1.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
	public static WebDriver buildSetupDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\duong.thi.diem.huong\\AUTO\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
