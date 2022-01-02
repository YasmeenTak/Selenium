package seleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement inputSearch = driver.findElement(By.cssSelector("input[name=\"q\"]"));
		// --------------Clicking Enter ---------------
//		 inputSearch.sendKeys("selenium" + Keys.ENTER);

		// --------------Clear input ---------------
		// inputSearch.clear();

		// --------------Keys down on keyboard ---------------
//		inputSearch.sendKeys("Web Driver" + Keys.ENTER);
//		Actions actionProvider = new Actions(driver);
//		//select all
//		Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
//		keydown.perform();
		
		// --------------Keys up keyboard ---------------
		Actions actionProvider = new Actions(driver);
		actionProvider.keyDown(Keys.SHIFT).sendKeys(inputSearch, "web driver").keyUp(Keys.SHIFT).sendKeys("web driver")
				.perform();

	}

}
