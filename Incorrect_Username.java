import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Incorrect_Username {

	 public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/Isha's Files/selenium/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  String currentWindow = driver.getWindowHandle();
		  driver.switchTo().window(currentWindow);
		  //  Enter Incorrect Username
		  driver.get("https://yoda.shopsocially.com/store/login");
		  driver.findElement(By.id("id_email")).sendKeys("nachiiiket+selenium");
		  driver.findElement(By.id("id_password")).sendKeys("12345test");
		  driver.findElement(By.id("id_login_button")).click();
	    	String m1 = driver.findElement(By.id("alert_msg")).getText();
	      System.out.println(m1); 
	    
	     
		  
}

}


