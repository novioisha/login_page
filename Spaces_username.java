import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spaces_username {

		 public static void main(String[] args) throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver", "/Isha's Files/selenium/chromedriver");
			  WebDriver driver = new ChromeDriver();
			  String currentWindow = driver.getWindowHandle();
			  driver.switchTo().window(currentWindow);
			  //Enter spaces in Username field
			  driver.get("https://yoda.shopsocially.com/store/login");
			  driver.findElement(By.id("id_email")).sendKeys("             ");
			  driver.findElement(By.id("id_password")).sendKeys("12345test");
			  driver.findElement(By.id("id_login_button")).click();
			  String message = driver.findElement(By.id("alert_msg")).getText();
			  String actual= "Please enter your email";
					  if(message.equals(actual))
					  {
			          System.out.print(message);
					  }
					  else
					  {
						  System.out.print("Incorrect message") ; 
					  }
			  Thread.sleep(5000);

	}

}
