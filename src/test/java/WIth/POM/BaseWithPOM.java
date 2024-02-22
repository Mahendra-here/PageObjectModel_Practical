package WIth.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import PageObjectModelDemo.LoginWIthPOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWithPOM {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		LoginPageWithPOM Loginpage = new LoginPageWithPOM(driver);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		Loginpage.Enterusername("standard_user");
		Loginpage.Enterpsw("secret_sauce");
		Loginpage.ClickButton();		
		driver.close();
		
	}
}
