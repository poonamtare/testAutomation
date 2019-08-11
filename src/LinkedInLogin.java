import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//test case to check the login functionality of LinkedIn in chrome browser using combination of different css locator 

public class LinkedInLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poona\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");//URL to open in the browser
		driver.findElement(By.cssSelector("input.input__field--with-label")).sendKeys("abcdef");// input 'abcdef' as email value(negative scenario)
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("pqrstuv");// input 'pqrstuv' as password(negative scenario)
		driver.findElement(By.cssSelector("button.sign-in-form__submit-btn")).click();
		//driver.close();// closes the current web browser on test case completion
		// Expected result of this test case is that Login Error page is displayed with an error 

	}
	

}
