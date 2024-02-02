package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobtnExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement unselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));
		WebElement select=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		
		boolean status1 = select.isSelected();
		boolean status2=unselect.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		
		
		
		
		
		

	}

}
