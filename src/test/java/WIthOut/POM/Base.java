package WIthOut.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	WebDriver driver;

	// Constructor here
	Base(WebDriver d) {
		driver = d;

	}

	By username = By.id("user-name");
	By password = By.id("password");
	By loginbutton = By.id("login-button");

	public void Enterusername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}

	public void Enterpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void ClickOnLoginButton() {
		driver.findElement(loginbutton).click();
	}
}