package seleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();

		// ----------------------- double-click ----------------------
//		WebElement searchInput = driver.findElement(By.name("q"));
//		searchInput.sendKeys("selenium");
//
//		Thread.sleep(2000);
//		WebElement searchButton = driver.findElement(By.name("btnK"));
//
//		Actions actionProvider = new Actions(driver);
//		actionProvider.doubleClick(searchButton).build().perform();

		// ----------------------- Right-click -----------------------
//		driver.get("https://www.linkedin.com/");
//		driver.manage().window().maximize();
//		WebElement signupLink = driver.findElement(By.linkText("Forgot password?"));

//		Actions actionProvider = new Actions(driver);
//		actionProvider.contextClick(signupLink).build().perform();

		// ----------------------- Click And Hold -------------------------
//        Actions actionProvider = new Actions(driver);
//        actionProvider.clickAndHold(signupLink).build().perform();

		// ----------------------- Move to Element (Secroll) -----------------
//		Actions actionProvider = new Actions(driver);
//
//		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
//		actionProvider.moveToElement(gmailLink).build().perform();

		// ----------------------- Move by of set (احداثيات) -----------------
		// Just work in the section is appear
//		driver.navigate().to("https://www.kooora.com/");
//		driver.manage().window().maximize();
//
//	    WebElement imgElement = driver.findElement(By.cssSelector("img[style=\"max-width:970px\"]"));
//	    int x = imgElement.getRect().getX();
//	    int y = imgElement.getRect().getY();
//	    
//		Actions actionProvider = new Actions(driver);
//		actionProvider.moveByOffset(x, y).build().perform();
//		actionProvider.contextClick(imgElement).build().perform();

		// ----------------------- Drag-and-Drop -----------------
//		driver.navigate().to("https://crossbrowsertesting.github.io/drag-and-drop");
//		driver.manage().window().maximize();
//
//		Actions actionProvider = new Actions(driver);
//
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
//
//		//actionProvider.dragAndDrop(source, target).build().perform();

		// ----------------------- Drag-and-Drop By -----------------
//		int x = target.getRect().getX();
//		int y = target.getRect().getY();
//		actionProvider.dragAndDropBy(source, x, y).build().perform();

		// ----------------------- Release -----------------
		//بشيل ايده عن كبسة الماوس
		driver.navigate().to("https://crossbrowsertesting.github.io/drag-and-drop");
		driver.manage().window().maximize();
		Actions actionProvider = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		actionProvider.clickAndHold(source).moveToElement(target).build().perform();
		actionProvider.release().build().perform();

	}

}
