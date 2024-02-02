package chapter2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWindowEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String oldwindow = driver.getWindowHandle();
		
		WebElement firstbtn = driver.findElement(By.xpath("//button[text()='Open Home Page']"));
		firstbtn.click();
		
		Set<String> handle = driver.getWindowHandles();
		
		for (String NewWindow : handle) {
			driver.switchTo().window(NewWindow);
		}
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']"));
		ele.click();
		
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		WebElement multiplewin = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		multiplewin.click();
		
		int noofwindows = driver.getWindowHandles().size();
		System.out.println(noofwindows);
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		for (String newWindow : windowhandles) {
			if(!newWindow.equals(oldwindow)) {
				driver.switchTo().window(newWindow);
				driver.close();
			}
		
			driver.quit();
		}
		
		
		
		
	}

}
