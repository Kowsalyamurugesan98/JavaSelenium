package chapter2;

import java.time.Duration;
import java.util.List;

import javax.swing.plaf.synth.SynthSliderUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Homepagelink = driver.findElement(By.linkText("Go to Home Page"));
		Homepagelink.click();
		
		driver.navigate().back();
		
		WebElement whereiam = driver.findElement(By.partialLinkText("Find where am"));
		String where = whereiam.getAttribute("href");
		System.out.println(where);
		
		WebElement broken=driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("The link has broken");
		}
		
		driver.navigate().back();
		WebElement Homepagelink1=driver.findElement(By.linkText("Go to Home Page"));
		Homepagelink1.click();
		
		driver.navigate().back();
		
		List<WebElement> size = driver.findElements(By.tagName("a"));	    
		int count=size.size();
		System.out.println(count);		
	}

}
