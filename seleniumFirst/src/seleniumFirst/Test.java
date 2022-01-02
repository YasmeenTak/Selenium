package seleniumFirst;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws ParseException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Support\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nyse.com/ipo-center/filings");
		driver.manage().window().maximize();
//		Thread.sleep(2000);

		// Number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[3]/tbody/tr"));
		int i = 0, j = 0, max = 0;
		for (int RowNumber = 1; RowNumber <= rows.size(); RowNumber++) {
			String col = driver.findElement(By.xpath("//table[3]/tbody/tr[" + RowNumber + "]/td[7]")).getText();
			i = Integer.parseInt(col);
			if (i > j) {
				max = j = i;
			}
		}
		System.out.println("Heighest marks from all of the subject is:" + max);
	}
}
