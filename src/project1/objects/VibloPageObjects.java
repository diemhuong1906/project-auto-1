package project1.objects;

import org.openqa.selenium.WebElement;

import project1.config.SetupDriver;

public class VibloPageObjects extends BasicObject {
	String URL = "https://accounts.viblo.asia/login";

	public VibloPageObjects() {
		this.driver = SetupDriver.buildSetupDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}

	public WebElement sendValueForInputEmail(String email) {
		WebElement inputEmail = this.findTxtObject("xpath",
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/input[1]");
		this.sendKeyForObject(inputEmail, email);
		return inputEmail;
	}

	public WebElement sendValueForPassword(String password) {
		WebElement inputPassword = this.findTxtObject("xpath",
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/input[1]");
		this.sendKeyForObject(inputPassword, password);
		return inputPassword;
	}

	public WebElement getErrorEmailElement() {
		WebElement errorEmailElement = this.findTxtObject("xpath", "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]");
		return errorEmailElement;
	}
	
	public WebElement getErrorPasswordElement() {
		WebElement errorPasswordElement = this.findTxtObject("xpath", "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[2]");
		return errorPasswordElement;
	}

	public void clickLogin() {
		WebElement btnLoginElement = this.findTxtObject("ByClassName", "el-button");
		System.out.println(btnLoginElement);
		this.clickButton(btnLoginElement);
	}

}
