import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
// Testing oal.tamu.edu 
//Test case to print output/error message when random string is input in search bar of website 
public class Search_TC01 {
	public static void main(String[] args) {
		//Creating driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poona\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://oal.tamu.edu");//URL to open in the browser
		System.out.println(driver.getTitle());//validate if page title is correct
		System.out.println(driver.getCurrentUrl());//validate if you landed on correct URL
		driver.findElement(By.name("p$lt$searchbox$txtWord")).sendKeys("abcdef");// inputs abcdef in the search bar
		driver.findElement(By.name("p$lt$searchbox$txtWord")).sendKeys(Keys.RETURN);// send enter key to trigger search
		System.out.println(driver.findElement(By.xpath("//*[@id=\'p_lt_CMSPagePlaceholder_lt_ctl00_SmartSearchResults_srchResults_lblNoResults\']")).getText());//prints the error message on console when search item 'abcdef' is not found
		driver.close();// closes the current web browser on test case completion
	}

}
