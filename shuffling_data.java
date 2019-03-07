import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shuffling_data {

	 public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/Isha's Files/selenium/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  String currentWindow = driver.getWindowHandle();
		  driver.switchTo().window(currentWindow);
		  //  Enter Password in username field and vice versa then clear the text and again click on login button.
		  driver.get("https://yoda.shopsocially.com/store/login");
		  driver.findElement(By.id("id_email")).sendKeys("12345test");
		  driver.findElement(By.id("id_password")).sendKeys("nachiket+seleniumtest@zinrelo.com");
		  driver.findElement(By.id("id_login_button")).click();
	    	String m1 = driver.findElement(By.xpath("//*[@id='alert_box']")).getText();
	      System.out.println(m1); 
	      driver.findElement(By.id("id_email")).clear();
	      Thread.sleep(5000);
	      driver.findElement(By.id("id_password")).clear();
	      Thread.sleep(5000);
	      driver.findElement(By.id("id_login_button")).click();
	      driver.quit();
}
}