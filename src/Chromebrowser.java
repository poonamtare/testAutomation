import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Keys;

public class Chromebrowser {
	public static void main(String[] args) {
		//Creating driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poona\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://oal.tamu.edu");//URL to open in the browser
		driver.close();// closes the current web browser on test case completion
	}

}