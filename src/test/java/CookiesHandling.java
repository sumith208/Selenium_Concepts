import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		try {
			// Step 1: Open the testable website
			driver.get("https://the-internet.herokuapp.com");
			System.out.println("Opened website: " + driver.getTitle());

			// Step 2: Add a cookie
			Cookie testCookie = new Cookie("testCookie", "123456");
			driver.manage().addCookie(testCookie);
			System.out.println("Added Cookie: " + testCookie);

			// Step 3: Retrieve and print all cookies
			Set<Cookie> cookies = driver.manage().getCookies();
			System.out.println("\nAll Cookies:");
			for (Cookie cookie : cookies) {
				System.out.println("Name: " + cookie.getName() + ", Value: " + cookie.getValue());
			}

			// Step 4: Retrieve a specific cookie
			Cookie specificCookie = driver.manage().getCookieNamed("testCookie");
			System.out.println("\nSpecific Cookie Retrieved: ");
			if (specificCookie != null) {
				System.out.println("Name: " + specificCookie.getName() + ", Value: " + specificCookie.getValue());
			}

//			 Step 5: Delete a specific cookie by name
			driver.manage().deleteCookieNamed("testCookie");
			System.out.println("\nSpecific Cookie Deleted: testCookie");

			// Step 6: Verify deletion of the specific cookie
			specificCookie = driver.manage().getCookieNamed("testCookie");
			if (specificCookie == null) {
				System.out.println("Verification Passed: Cookie 'testCookie' is deleted.");
			}

			// Step 7: Delete all cookies
			driver.manage().deleteAllCookies();
			System.out.println("\nAll cookies deleted.");

			// Step 8: Verify deletion of all cookies
			if (driver.manage().getCookies().isEmpty()) {
				System.out.println("Verification Passed: No cookies are present.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Step 9: Close the browser
//			driver.quit();
//			System.out.println("\nBrowser closed.");
		}

	}

}
