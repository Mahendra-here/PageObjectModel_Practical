package PageObjectModelDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWIthOutPOM {
	  public static void main(String args[]) throws InterruptedException {

		  WebDriverManager.chromedriver().clearDriverCache().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com");
		  driver.manage().deleteAllCookies();
		  Thread.sleep(5000);
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  Thread.sleep(5000);
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  Thread.sleep(5000);
		  driver.findElement(By.id("login-button")).click();
		  Thread.sleep(5000);
		  driver.close();
		  }
}