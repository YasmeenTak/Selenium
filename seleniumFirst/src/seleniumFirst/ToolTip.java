package seleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("[class=\"demo-frame\"]")));
		
		WebElement ageEle = driver.findElement(By.id("age"));
		String expectedResultToolTipTitle = "We ask for your age only for statistical purposes.";
		String actualResultToolTipTitle = ageEle.getAttribute("title");
		if (expectedResultToolTipTitle.equals(actualResultToolTipTitle)) {
			System.out.println("pass");

		} else {
			System.out.println("fail");
		}
//      -------------------------------------------------------------------
		driver.navigate().to("http://demo.guru99.com/test/tooltip.html");
		WebElement downloadNowBut = driver.findElement(By.id("download_now"));

		Actions action = new Actions(driver);
		action.moveToElement(downloadNowBut).build().perform();
		
		WebElement toolTipElement = driver.findElement(By.cssSelector("div.tooltip>a"));
		System.out.println(toolTipElement.getText());
		
		

	}

}
