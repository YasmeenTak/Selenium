package seleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

		WebElement frameElm = driver.findElement(By.id("iframeResult"));
		//Switch to frame to deal with it
		driver.switchTo().frame(frameElm);

		WebElement firstNameElm = driver.findElement(By.id("fname"));
		WebElement lastNameElm = driver.findElement(By.id("lname"));
		WebElement submitElm = driver.findElement(By.cssSelector("input[value=\"Submit\"]"));
		firstNameElm.clear();
		lastNameElm.clear();
		firstNameElm.sendKeys("Test");
		lastNameElm.sendKeys("Test test");
		submitElm.click();

		driver.switchTo().defaultContent();
		WebElement runElm = driver.findElement(By.id("runbtn"));
		runElm.click();
	}

}