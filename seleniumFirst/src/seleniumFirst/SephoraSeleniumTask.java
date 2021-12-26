package seleniumFirst;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SephoraSeleniumTask {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Prevent Notifications popup
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sephora.com/");
		driver.manage().window().maximize();

		WebElement makeupElement = driver.findElement(By.id("top_nav_drop_2_trigger"));

		Actions action = new Actions(driver);
		action.moveToElement(makeupElement).perform();
		System.out.println("Done Mouse hover on 'Makeup' from nav");

		Thread.sleep(2000);
		WebElement eyePalettesElement = driver.findElement(By.cssSelector("a[href=\"/shop/eyeshadow-palettes\"]"));
		eyePalettesElement.click();

		WebElement closeModal = driver.findElement(By.cssSelector("[data-at=\"close_button\"]"));
		closeModal.click();

		WebElement firstProduct = driver.findElements(By.cssSelector("a[data-comp=\"ProductTile \"]")).get(0);
		System.out.println("first element" + firstProduct);
		firstProduct.click();

		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-at=\"add_to_basket_btn\"]")))
				.click();

		Thread.sleep(2000);
		WebElement modalClose = driver.findElement(By.cssSelector("[data-at=\"modal_close\"]"));
		modalClose.click();
		
		

	}

}
