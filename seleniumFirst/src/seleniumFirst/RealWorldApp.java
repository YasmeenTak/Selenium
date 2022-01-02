package seleniumFirst;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RealWorldApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Support\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		driver.manage().window().maximize();
		Instant currentTime = Instant.now();
		String currentTimeValue=String.valueOf(currentTime);
		
		WebElement sigupLink = driver.findElement(By.cssSelector("a[data-test=\"signup\"]"));
		sigupLink.click();
		sigupLink.click();
//		WebElement registrationWait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(signupLink));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Yasmeen");

		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Talal");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("yass" + currentTimeValue);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("yasmeen");

		WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
		confirmPassword.sendKeys("yasmeen");

		WebElement submitButton = driver.findElement(By.cssSelector("button[data-test=\"signup-submit\"]"));
		submitButton.click();

		boolean isUrlChanged = new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.urlContains("signin"));

		WebElement loginUsername = driver.findElement(By.id("username"));
		WebElement loginPassword = driver.findElement(By.id("password"));

		loginUsername.sendKeys("yass");
		loginPassword.sendKeys("yasmeen");

		WebElement loginButton = driver.findElement(By.cssSelector("button[data-test=\"signin-submit\"]"));
		loginButton.click();
		
		//Modal appears
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement dialog = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[data-test=\"user-onboarding-dialog\"]")));
		
		WebElement nextButton = driver.findElement(By.cssSelector("button[data-test=\"user-onboarding-next\"]"));
		nextButton.click();

		WebElement bankAccountInput= dialog.findElement(By.id("bankaccount-bankName-input"));
		bankAccountInput.sendKeys("palestine");
		WebElement routingNumber= dialog.findElement(By.id("bankaccount-routingNumber-input"));
		routingNumber.sendKeys("123456789");
		WebElement accountNumber= dialog.findElement(By.id("bankaccount-accountNumber-input"));
		accountNumber.sendKeys("122345678");
		WebElement saveButton = dialog.findElement(By.cssSelector("button[data-test=\"bankaccount-submit\"]"));
		saveButton.click();
		WebElement doneButton= new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(dialog.findElement(By
				.cssSelector("button[data-test=\"user-onboarding-next\"]"))));
		
		doneButton.click();
		
		WebElement newTransactionButton= driver.findElement(By.cssSelector("a[data-test=\"nav-top-new-transaction\"]"));
		newTransactionButton.click();
		
		WebElement searchUserInput= driver.findElement(By.id("user-list-search-input"));
		searchUserInput.sendKeys("Yasmeen");
		
		List<WebElement> usersList = driver.findElements(By.cssSelector("ul[data-test=\"users-list\"] >li"));
		Random random= new Random();
		usersList.get(random.nextInt(usersList.size())).click();
		
		//-------------------------------------------------------------
		WebElement amountElement = new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("amount"))));
		amountElement.sendKeys("330");
		WebElement noteElement=driver.findElement(By.id("transaction-create-description-input"));
		noteElement.sendKeys("test note");

	}

}
