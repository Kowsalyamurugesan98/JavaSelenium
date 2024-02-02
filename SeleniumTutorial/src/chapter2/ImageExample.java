package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement firstimage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		firstimage.click();
		
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[4]")).click();
		
		WebElement brokenimage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		if(brokenimage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("image is broken");
		}
		else {
			System.out.println("image is not broken");
		}
	}	
	

}
