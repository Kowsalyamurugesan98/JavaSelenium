package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C://Users//e5614864//OneDrive - FIS//Documents//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Location of button
		WebElement location = driver.findElement(By.xpath("//button[text()='Get Position']"));
		Point getloc = location.getLocation();
		System.out.println("x axis loc"+getloc.getX());
		System.out.println("y axis loc"+getloc.getY());
		
		//Color of the button
		WebElement color = driver.findElement(By.id("color"));
		Object colorname = color.getCssValue("background-color");
		System.out.println(colorname);
		
		
		//Size of the Button
		WebElement position = driver.findElement(By.xpath("//button[text()='What is my size?']"));
		Dimension size = position.getSize();
		System.out.println("height of this button"+size.height);
		System.out.println("width of this button"+size.width);
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Go to Home Page']"));
		ele.click();
		
		
	}
	

}
