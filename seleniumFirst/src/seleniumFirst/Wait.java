package seleniumFirst;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html");
		//WebElement elem = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf());

		//غير مفضل استخدامها
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
