package chapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(0);
		WebElement firstFrame = driver.findElement(By.id("Click"));
		firstFrame.click();
		
		String Status = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		System.out.println(Status);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement secondframe = driver.findElement(By.id("Click1"));
		secondframe.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> framecount = driver.findElements(By.tagName("iframe"));
		int count = framecount.size();
		System.out.println(count);
			
	}

}




