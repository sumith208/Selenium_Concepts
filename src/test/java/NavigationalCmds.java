import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCmds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
//		to enter the URL
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
//		navigate back to the previous page
		driver.navigate().back();
		Thread.sleep(3000);
//		navigate to the next page
		driver.navigate().forward();
		Thread.sleep(3000);
//		to refresh the current page
		driver.navigate().refresh();

	}

}
