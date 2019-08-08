import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//test case to check the login functionality of Facebook using xpath locator only
public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poona\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");//URL to open in the browser
		//driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdef");// input 'abcdef' as email value(negative scenario)
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pqrstuv");// input 'pqrstuv' as password(negative scenario)
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//driver.close();// closes the current web browser on test case completion
		// Expected result of this test case is that Login Error page is displayed with an error 

	}

}
