package chapter2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadfileExample {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/download.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement firstlink = driver.findElement(By.linkText("Download Excel"));
		firstlink.click();
		
		File file=new File("Downloads");
		File[] lists = file.listFiles();
		
		for (File file2 : lists) {
			if(file2.getName().equals("Download Excel.xls"))
			{
					System.out.println("file is download");
					break;
			}
			
		}
		
		
		

	}

}
