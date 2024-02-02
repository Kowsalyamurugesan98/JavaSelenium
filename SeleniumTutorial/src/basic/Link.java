package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leafground.com/pages/Link.html");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.findElement(By.linkText("Go to Home Page")).click();

System.out.println(driver.getCurrentUrl());
driver.close();
	}

}
