package WIthOut.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Using  Without Page Fectoty:
public class LoginPage {

	/*
	 * public static void main(String args[]) throws InterruptedException {
	 * 
	 * WebDriverManager.chromedriver().clearDriverCache().setup(); WebDriver driver
	 * = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("https://www.saucedemo.com"); driver.manage().deleteAllCookies();
	 * Thread.sleep(3000);
	 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 * Thread.sleep(3000);
	 * driver.findElement(By.id("password")).sendKeys("secret_sauceQ");
	 * Thread.sleep(3000); driver.findElement(By.id("login-button")).click();
	 * Thread.sleep(4000); driver.close(); }
	 */

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Base Loginbase = new Base(driver);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		Loginbase.Enterusername("standard_user");
		Loginbase.Enterpassword("secret_sauce");
		Loginbase.ClickOnLoginButton();
		driver.close();

	}
}