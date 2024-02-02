package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckbxExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		java.click();
		
		WebElement Selenium = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean SeleniumSelected = Selenium.isSelected();
		System.out.println(SeleniumSelected);
		
		WebElement Deselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		if(Deselect.isSelected()) {
			Deselect.click();
		}
		
	WebElement deselect2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
	if(deselect2.isSelected()) {
		deselect2.click();
	}
		
	
	driver.close();
	

	}

}
