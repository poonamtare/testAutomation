//test case to handle autosuggestive dropdowns
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\poona\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Java\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");// access this URL in browser
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(1000);
		source.click();
		Thread.sleep(1000);
		source.sendKeys("Mum");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		source = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(1000);
		source.click();
		Thread.sleep(1000);
		source.sendKeys("DEL");
		Thread.sleep(1000);
		for(int i=0;i<3;i++) {
			source.sendKeys(Keys.ARROW_DOWN);
		}
		source.sendKeys(Keys.ENTER);
		
	}

}
