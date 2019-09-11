// test case to handle checkboxes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxTestcase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\poona\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Java\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//checking the status of the checkbox, if unselected 'false' should be displayed on console
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		// we are using CSS selector with regular expression to identify the object
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		//Verifying that the checkbox has a tick/has been selected, if it has been selected the console will display 'true' in the output
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Verifying how many count of checkboxes are present on page by finding common Selector class for the checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
