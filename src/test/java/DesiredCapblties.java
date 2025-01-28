import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapblties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // Run Chrome in headless mode
		options.addArguments("--disable-gpu");

		// Initialize the WebDriver with ChromeOptions
		WebDriver driver = new ChromeDriver(options);

		// Navigate to a test page
		driver.get("https://www.example.com");

		// Print the title of the page
		System.out.println("Page Title: " + driver.getTitle());

		// Close the browser
		driver.quit();
	}

}
