package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/tooltip.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement ele = driver.findElement(By.id("age"));
		String tooltipname = ele.getAttribute("title");
		System.out.println(tooltipname);

		driver.close();


	}

}
