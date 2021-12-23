package seleniumFirst;

import org.apache.commons.io.FileUtils;
import java.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Support\\Downloads\\chromedriver_win\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/");
		takeScreensoht("selenium_documentation");

	}

	public static void takeScreensoht(String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("C:\\Users\\Support\\Desktop\\seleniumFirst\\screenshot" + fileName + ".jpg"));

	}

}
