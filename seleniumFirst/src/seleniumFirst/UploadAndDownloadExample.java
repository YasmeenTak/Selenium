package seleniumFirst;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAndDownloadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// Upload Files
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();

		WebElement uploadElement = driver.findElement(By.id("file-upload"));
		uploadElement.sendKeys("C:\\Users\\Support\\Desktop\\Capturse.PNG");

		WebElement submitButton = driver.findElement(By.id("file-submit"));
		submitButton.click();

		// Download Files
		driver.navigate().to("https://the-internet.herokuapp.com/download");
		driver.manage().window().maximize();

		WebElement downloadFile = driver.findElement(By.cssSelector("a[href=\"download/4.JPG\"]"));

		String sourceLocation = downloadFile.getAttribute("href");
		System.out.println(sourceLocation);

		String wgetCommand = "cmd /c C:\\Wget\\wget.exe -P D:\\dwonload --no-check-certificate " + sourceLocation;
		try {
			Process exec = Runtime.getRuntime().exec(wgetCommand);
			int exitVal = exec.waitFor();
			System.out.println("Exit value: " + exitVal);
		} catch (InterruptedException | IOException ex) {
			System.out.println(ex.toString());
		}

	}

}
