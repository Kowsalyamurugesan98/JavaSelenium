package chapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/sortable.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> sortable = driver.findElements(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));
		WebElement source = sortable.get(6);
		WebElement destination = sortable.get(0);
		
		Actions a=new Actions(driver);
		a.clickAndHold(source);
		a.moveToElement(destination);
		a.release(destination);
		a.perform();
	}
}