import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Successful_Login {
		//Successful login 
		 public static void main(String[] args) throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver", "/Isha's Files/selenium/chromedriver");
			  WebDriver driver = new ChromeDriver();
			  String currentWindow = driver.getWindowHandle();
			  driver.switchTo().window(currentWindow);
			  
			  driver.get("https://yoda.shopsocially.com/store/login");
			  driver.findElement(By.id("id_email")).sendKeys("nachiket+seleniumtest@zinrelo.com");
			  driver.findElement(By.id("id_password")).sendKeys("12345test");
			  driver.findElement(By.id("id_login_button")).click();
			  WebDriverWait wait = new WebDriverWait (driver, 40);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='store_center']")));
			  Thread.sleep(5000);
	          driver.findElement(By.xpath(".//a[contains(text(),'Logout')]")).click();
			  System.out.println("Login page will display");
			 
	}

}
