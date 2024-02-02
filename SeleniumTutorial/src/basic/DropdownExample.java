package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select s=new Select(drop1);
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("2");
		Thread.sleep(1000);
		s.selectByVisibleText("Loadrunner");
		Thread.sleep(1000);
		
		
		List<WebElement> options = s.getOptions();
		int noofoption = options.size();
		System.out.println(noofoption);
		Thread.sleep(1000);
		drop1.sendKeys("UFT/QTP");
		
		Thread.sleep(1000);
		WebElement multiselect = driver.findElement(By.xpath("//option[text()='Select your programs']"));
		Select s1=new Select(multiselect);
		Thread.sleep(1000);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		s1.selectByIndex(3);
		driver.close();

	}

}
