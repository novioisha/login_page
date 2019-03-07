import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blank_PasswordField {
	 public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/Isha's Files/selenium/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  String currentWindow = driver.getWindowHandle();
		  driver.switchTo().window(currentWindow);
		  // Don't enter any data in password field
		  driver.get("https://yoda.shopsocially.com/store/login");
		  driver.findElement(By.id("id_email")).sendKeys("nachiket+seleniumtest@zinrelo.com");
		  driver.findElement(By.id("id_password")).sendKeys("");
		  driver.findElement(By.id("id_login_button")).click();
	      String m1 = driver.findElement(By.xpath("//*[@id='alert_box']")).getText();
		  String m2 = "Email or password entered is invalid";
	      if (m1.equals(m2))
	      {
	    	  System.out.println("Correct Error message:" +m1);
	      }
	      else
	      {
	    	  System.out.println("Incorrect Error message:" +m2);  
	      }
}
}
