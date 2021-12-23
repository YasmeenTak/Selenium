package seleniumFirst;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUps_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
		String buttonSelector = "a[onclick=\"window.alert('Sample alert')\"]";
		WebElement buttonElm = driver.findElement(By.cssSelector(buttonSelector));
		buttonElm.click();

		// ---------------Alerts -------------------

		WebDriverWait wait = new WebDriverWait(driver, 5000);
		// waiting alert to present
		Alert alertEx = wait.until(ExpectedConditions.alertIsPresent());
		String exampleTitlee = alertEx.getText();
		System.out.println(exampleTitlee);
		// To close alert
		alertEx.accept();

//      Other Solutions
//		Alert alertEx = ExpectedConditions.alertIsPresent().apply(driver);
//		String alertTitle = alertEx.getText();
//		System.out.println("Alert Test: " + alertTitle);

//      ---------------Confirm -------------------

		WebElement confirmElement = driver
				.findElement(By.cssSelector("a[onclick=\"window.confirm('Are you sure?')\"]"));
		confirmElement.click();
		Alert confirm = wait.until(ExpectedConditions.alertIsPresent());
		String confirmTitle = confirm.getText();
		System.out.println(confirmTitle);
		confirm.dismiss();

//      ---------------Prompt -------------------
		driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
		WebElement promptLink = driver.findElement(
				By.cssSelector("a[onclick=\"window.prompt('What is your tool of choice?',navigator.appName)\"]"));

		promptLink.click();
		Alert prompt = ExpectedConditions.alertIsPresent().apply(driver);
		String promptTitle = prompt.getText();
		System.out.println("Alert Title: " + promptTitle);
		prompt.sendKeys("Tesssssssssssssssssst");
		prompt.accept();

//      ---------------Enabled -------------------
		WebElement serchButton = driver.findElement(By.cssSelector("input[id=\"vehicleType\"]+button"));
		System.out.println(serchButton.isEnabled());

//-----------------------ButtonStatus----------------------------------		
//		driver.navigate().to("https://www.americanmuscle.com/search?keywords=&generationId=63&vehicleType=Camaro");
//		WebElement searchButton = driver.findElement(By.cssSelector("#vehicleType + button"));
//		boolean buttonstatus=searchButton.isEnabled();
//		System.out.println("button status: " +buttonstatus);
		
//----------------------check-box------------------------		
		// driver.navigate().to("http://www.testdiary.com/training/selenium/selenium-test-page/");
//		WebElement checkBox = driver.findElement(By.id("seleniumbox"));
//		checkBox.click();
//		WebElement checkBoxSelected = driver.findElement(By.id("restapibox"));
//		System.out.println("checkBox status: " +checkBoxSelected.isSelected());
		
//----------------------radioButton------------------------		
//		WebElement radioButton = driver.findElement(By.id("java1"));
//		System.out.println("radioButton status: " +radioButton.isSelected());
//		radioButton.click();
//		System.out.println(radioButton.getTagName());
//		Rectangle rec=radioButton.getRect();
//		System.out.println("Width: "+rec.getWidth()+" Height: "+rec.getHeight()+"\n x position:"+rec.getX()+"\n y position:"+rec.getY());
		
//----------------------background-color------------------------		
//		WebElement blueAlert = driver.findElements(By.cssSelector("div[class=\"alert blue\"]")).get(0);
//		System.out.println("background-color :"+blueAlert.getCssValue("background-color"));
		
//----------------------dropDown------------------------		
//		WebElement dropDownElement = driver.findElement(By.id("Shirts"));
//		Select dropdown = new Select(dropDownElement);
//		dropdown.selectByIndex(1);
//		dropdown.selectByValue("yellow");// recommended
//		dropdown.selectByVisibleText("Blue Shirt");
//		
//		List<WebElement> listOfDropDown = dropdown.getOptions();
//		for(WebElement currentElement:listOfDropDown) {
//			System.out.println(currentElement.getText());
//		}
//		System.out.println("Selected item :"+dropdown.getFirstSelectedOption().getText());
//		
//---------------------------------
		driver.navigate().to("https://demoqa.com/select-menu");
		WebElement carsDropdownElement = driver.findElement(By.id("cars"));
		Select carsObject = new Select(carsDropdownElement);
		carsObject.selectByIndex(0);
		carsObject.selectByIndex(1);
		System.out.println(carsObject.getAllSelectedOptions().size());
		// carsObject.deselectAll();
		carsObject.deselectByVisibleText("Volvo");
		System.out.print("does is it support Multiple selection:" + carsObject.isMultiple());


	}

}

//	WebElement eyeliner = (new WebDriverWait(driver, 10))
//	 .until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href=\"/shop/eyeliner\"]")));
