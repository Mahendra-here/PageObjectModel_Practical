package WIth.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPOM {

	WebDriver driver;

	// Constructor here
	LoginPageWithPOM(WebDriver d) {
		driver = d;

		// This Method will created web Elements
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "user-name")
	WebElement UName;

	@FindBy(id = "password")
	WebElement pwd;

	@FindBy(id = "login-button")
	WebElement loginbutton;

	public void Enterusername(String username) {
		UName.sendKeys(username);
	}

	public void Enterpsw(String pass) {
		pwd.sendKeys(pass);
	}

	public void ClickButton() {
		loginbutton.click();
	}
}
