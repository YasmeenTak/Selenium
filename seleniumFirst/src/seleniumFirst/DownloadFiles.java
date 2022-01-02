package seleniumFirst;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFiles {
	final static String url = "http://demo.guru99.com/test/yahoo.html";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();

		WebElement downloadBtn = driver.findElement(By.id("messenger-download"));

		String sourceLocation = downloadBtn.getAttribute("href");

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
