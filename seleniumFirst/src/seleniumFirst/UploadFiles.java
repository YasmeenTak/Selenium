package seleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	final static String url = "http://demo.guru99.com/test/upload/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Support\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\Support\\Desktop\\Capturse.PNG");

		WebElement turmElement = driver.findElement(By.id("terms"));
		turmElement.click();

		WebElement submitButton = driver.findElement(By.id("submitbutton"));
		submitButton.click();

	
	}

}
