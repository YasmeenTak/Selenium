package seleniumFirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
//		driver.manage().window().maximize();
//		
//		WebElement fourthCell = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
//		System.out.println(fourthCell.getText());

//      ----------------------- nested-table -----------------
//		driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
//		driver.manage().window().maximize();
//		WebElement nestedCell = driver.findElement(By.xpath("//table//tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]"));
//		System.out.println(nestedCell.getText());

//      -----------------------nested nested nested-table -----------------
//		driver.get("http://demo.guru99.com/test/newtours/");
//		driver.manage().window().maximize();
//		WebElement nestCell = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td"));
//		System.out.println(nestCell.getText());

//      -----------------------nested nested nested-table -----------------
//		driver.get("http://demo.guru99.com/test/newtours/");
//		driver.manage().window().maximize();
//		WebElement nestCell2 = driver.findElement(By.xpath("//table[@width=\"277\"]/tbody/tr[3]/td[2]"));
//		System.out.println(nestCell2.getText());

//      -----------------------Dynamic tables -----------------
//		driver.get("http://demo.guru99.com/test/web-table-element.php");
//		driver.manage().window().maximize();
//		WebElement tableElement = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]"));
//		// Numbers of rows
//		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
//		System.out.println(rows.size());
//		
//		//Numbers of columns
//		List <WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//		System.out.println(columns.size());
		
//      ---------------------------- Example ----------------------------------
		driver.get("https://www.nyse.com/ipo-center/filings");
		driver.manage().window().maximize();
		WebElement tableElement = driver.findElement(By.xpath("//table[3]"));
		// Numbers of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[3]/tbody/tr"));
		System.out.println(rows.size());
		
		//Numbers of columns
		List <WebElement> columns = driver.findElements(By.xpath("//table[3]/tbody/tr[1]/td"));
		System.out.println(columns.size());
		
		//Finding cell value at 4th row and 3rd column
		WebElement specificCell = driver.findElement(By.xpath("//table[3]/tbody/tr[4]/td[3]"));
		System.out.println(specificCell.getText());
		
		

		


	}

}
