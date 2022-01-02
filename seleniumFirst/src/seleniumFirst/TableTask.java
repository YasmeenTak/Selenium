package seleniumFirst;

import java.text.NumberFormat;
import java.time.Duration;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nyse.com/ipo-center/filings");
		driver.manage().window().maximize();
		double max = 0, temp = 0;
		// Number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[3]/tbody/tr"));
//      ------------------------------------ Max value -------------------------------------
		for (int i = 1; i < rows.size(); i++) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			String maxElementCol = driver.findElement(By.xpath("//table[3]/tbody/tr[" + (i + 1) + "]/td[7]")).getText();
			max = Double.parseDouble(maxElementCol.replace(",", ""));
			if (max > temp) {
				temp = max;
			}
		}
		NumberFormat nf = NumberFormat.getInstance(Locale.US);
		System.out.println("The Maximum current amount is : " + nf.format(temp)+"\n");

//      ------------------------------------ Print table content -------------------------------------
		System.out.println("Table Content: "+"\n");
		for (WebElement row : rows) {
			List<WebElement> allElement = row.findElements(By.xpath("//table[3]/tbody/tr/td"));

			for (WebElement cell : allElement) {
				System.out.println(cell.getText());
			}
		}

	}

}
