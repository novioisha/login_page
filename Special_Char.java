import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Special_Char {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/Isha's Files/selenium/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  String currentWindow = driver.getWindowHandle();
		  driver.switchTo().window(currentWindow);
		  // Enter special characters in both the fields
		  driver.get("https://yoda.shopsocially.com/store/login");
		  driver.findElement(By.id("id_email")).sendKeys("@@@@@@@@@@@@@@@");
		  driver.findElement(By.id("id_password")).sendKeys("@@@@@@@@@@@@@@");
		  driver.findElement(By.id("id_login_button")).click();
	    	String m1 = driver.findElement(By.xpath("//*[@id='alert_box']")).getText();
	      System.out.println(m1); 
	      Thread.sleep(5000);
	      String str = driver.getCurrentUrl();
	      System.out.println("Current URL is:"  +str); 
	      driver.quit();
}
}