package chapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/autoComplete.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(4000);
		List<WebElement> listrows = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		
		
		
		for (WebElement webElement : listrows) {
			if(webElement.getText().equals("Selenium")) {
				webElement.click();
				System.out.println(webElement.getText());
				break;
			}
			
			
			
			
			
			
			
		}
		
		
		

	}

}
