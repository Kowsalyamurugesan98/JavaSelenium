package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("email")).sendKeys("kowsalya@gmail.com");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hello Kitty");
		
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		
		WebElement ele = driver.findElement(By.xpath("(//input[@disabled='true'])"));
		boolean value = ele.isEnabled();
		System.out.println(value);
		

	}

}
