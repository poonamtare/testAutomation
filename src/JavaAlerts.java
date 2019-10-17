import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// Test case to handle Java Alerts using Selenium
		String text = "Poonam";
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\poona\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Java\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys(text);
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		System.out.println(driver.switchTo().alert().getText());//printing pop up text in console
		driver.switchTo().alert().accept();// selecting OK option on pop up
		driver.switchTo().alert().accept();	// selecting OK option from 2nd pop up alert
	}

}
