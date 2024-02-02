package chapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> count = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
        int nooflines = count.size();
        System.out.println(nooflines);
        
       Actions a=new Actions(driver);
       a.clickAndHold(count.get(0));
       a.clickAndHold(count.get(1));
       a.clickAndHold(count.get(2));
       a.perform();
       
	}
}
