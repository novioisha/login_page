import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Password_CapsLockOn {
	 public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/Isha's Files/selenium/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  String currentWindow = driver.getWindowHandle();
		  driver.switchTo().window(currentWindow);
		  
		  // Enter correct password with caps lock ON
		  driver.get("https://yoda.shopsocially.com/store/login");
		  driver.findElement(By.id("id_email")).sendKeys("NACHIKET+SELENIUM");
		  driver.findElement(By.id("id_password")).sendKeys("12345TEST");
		  driver.findElement(By.id("id_login_button")).click();
		  String m1 = driver.findElement(By.xpath(".//span[contains(text(),'Email or password entered is invalid')]")).getText();
		  System.out.println(m1);
	
		
		  
	 }
}
