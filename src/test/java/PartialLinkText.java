import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
//		To find the element using partial link text.
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement partialLink = driver.findElement(By.partialLinkText("Forgot"));
		partialLink.click();
	}

}
