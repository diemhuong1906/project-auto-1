package project1.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicObject {
	public WebDriver driver;

	public WebElement findTxtObject(String typeFind, String valueFind) {
		WebElement txtObject = null;
		if (typeFind == "ByClassName") {
			txtObject = driver.findElement(By.className(valueFind));
		}

		if (typeFind == "ById") {
			txtObject = driver.findElement(By.id(valueFind));
		}
		if (typeFind == "CSSSelector") {
			txtObject = driver.findElement(By.cssSelector(valueFind));
		}

		if (typeFind == "xpath") {
			txtObject = driver.findElement(By.xpath(valueFind));
		}
		return txtObject;
	}

	public void sendKeyForObject(WebElement element, String value) {
		element.sendKeys(value);
	}

	// event
	public void clickButton(WebElement element) {
		element.click();

	}

	public void clearDataThenSendValue(WebElement object, String value) {

	}

}
