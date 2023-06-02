package project1.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import project1.objects.VibloPageObjects;
@Test
public class TestcasesDemo {
	VibloPageObjects vibloPage = null;

	@BeforeSuite
	public void initializeDriver() throws Exception {
		vibloPage = new VibloPageObjects();
	}

	@Test
	public void getTitlePage() throws Exception {
		String titlePageString = vibloPage.driver.getTitle();

		Assert.assertEquals(titlePageString, "Viblo - Login");
	}

	@Test
	public void checkRequire() throws Exception {
		vibloPage.clickLogin();
		Thread.sleep(1000);
		WebElement errorEmailElement = vibloPage.getErrorEmailElement();
		WebElement errorPasswordElement = vibloPage.getErrorPasswordElement();
		Assert.assertEquals(errorEmailElement.getText(), "Tên người dùng/email là bắt buộc");
		Assert.assertEquals(errorPasswordElement.getText(), "Mật khẩu là bắt buộc");
	}

	@Test
	public void checkRequiredPassword() throws Exception {
		WebElement inpuElement = vibloPage.sendValueForInputEmail("email");
		Thread.sleep(1000);
		vibloPage.clickLogin();
		Thread.sleep(1000);
		WebElement errorPasswordElement = vibloPage.getErrorPasswordElement();
		Assert.assertEquals(errorPasswordElement.getText(), "Mật khẩu là bắt buộc");
		Assert.assertEquals(inpuElement.getAttribute("value"), "email");
	}

	@Test
	public void checkRequiredEmail() throws Exception {
		WebElement inputElement1 = vibloPage.sendValueForPassword("aaaaa");
		Thread.sleep(1000);
		vibloPage.clickLogin();
		Thread.sleep(1000);
		WebElement errorEmailElement = vibloPage.getErrorEmailElement();
		Assert.assertEquals(errorEmailElement.getText(), "Tên người dùng/email là bắt buộc");
		Assert.assertEquals(inputElement1.getAttribute("value"), "aaaaa");
		inputElement1.clear();
	}

}
