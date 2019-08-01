import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		//selenium code
		//Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poona\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://google.com");
		//hit specified URL on the chrome browser
		//System.out.println(driver.getTitle());
		//validate if page title is correct
		//System.out.println(driver.getCurrentUrl());
		//validate if you landed on correct URL
		//System.out.println(driver.getPageSource());
		//print the page source
		
		//driver.navigate().back();// the browser will navigate back one page
		//driver.close();// closes the current web browser on test case completion
		//driver.quit();// closes all the web browsers opened by Selenium script
		driver.get("https://oal.tamu.edu");//URL to open in the browser
		driver.findElement(By.name("p$lt$searchbox$txtWord")).sendKeys("print");
	}

}
