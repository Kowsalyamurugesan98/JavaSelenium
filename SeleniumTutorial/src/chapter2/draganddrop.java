package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(source, dest).perform();
		
		driver.close();
		
		
		
		
	}

}
