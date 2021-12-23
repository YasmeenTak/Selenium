package seleniumFirst;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Support\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/");

		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.contentEquals("https://www.selenium.dev/documentation/")) {
			System.out.println("success url");
		} else {
			System.out.println("fail url");

		}
		String currentTitle = driver.getTitle();
		if (currentTitle.contentEquals("The Selenium Browser Automation Project | Selenium")) {
			System.out.println("success title");
		} else {
			System.out.println("fail title");

		}
		// System.out.println(driver.getPageSource());

		driver.navigate().to("https://www.katalon.com/");
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
		driver.manage().window().maximize();
//      driver.manage().window().fullscreen();
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.manage().window().setSize(new Dimension(1024, 760));
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();
		System.out.println(x);
		System.out.println(y);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);

		

		driver.close();

//		System.setProperty("webdriver.ie.driver","C:\\Users\\Support\\Downloads\\IEDriverServer_x64_4.0.0\\\\IEDriverServer.exe");
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Support\\Downloads\\geckodriver-v0.30.0-win64\\\\geckodriver.exe");

//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new InternetExplorerDriver();

	}

}
