package chapter2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e5614864\\OneDrive - FIS\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int columnsize=column.size();
		System.out.println(columnsize);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowsize=rows.size();
		System.out.println(rowsize);
		
		WebElement progressvalue = driver.findElement(By.xpath("(//td[normalize-space()='Learn to interact with Elements']//following::td[1])[1]"));
		String percentagevalue = progressvalue.getText();
		System.out.println("The percentage value "+ percentagevalue);
		
		List<WebElement> leastone = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		for (WebElement webElement : leastone) {
			String indivitualValue = webElement.getText().replace("%", "");
			numberList.add(Integer.parseInt(indivitualValue));
			

			
			
		}				
	}

}
