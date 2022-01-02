package seleniumFirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CalenderHandeling {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.get("http://demo.guru99.com/test/");
//
//		WebElement datePicker = driver.findElement(By.name("bdaytime"));
//		datePicker.sendKeys("29031994");
//		datePicker.sendKeys(Keys.TAB);
//		datePicker.sendKeys("0103AM");
//		WebElement submitBtn = driver.findElement(By.cssSelector("[type=\"submit\"]"));
//		submitBtn.click();

//     -----------------------------------------------------------------
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement divElement = driver.findElement(By.cssSelector("body"));
		divElement.click();
		WebElement datePicker2 = driver.findElement(By.cssSelector("[data-cy=\"departureDate\"]"));
		datePicker2.click();
		WebElement closElement = driver.findElement(By.cssSelector("[class=\"langCardClose\"]"));
		closElement.click();
		WebElement date = driver.findElement(By.cssSelector("div[aria-label=\"Sat Jan 15 2022\"]"));
		date.click();

	}

}
