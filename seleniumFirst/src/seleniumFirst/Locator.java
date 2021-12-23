package seleniumFirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americanmuscle.com/");
		// all (a) element
		List<WebElement> anchorTags = driver.findElements(By.tagName("a"));
		System.out.println(anchorTags.size());

		WebElement element = driver.findElement(By.className("camaro_trigger"));
		System.out.println(element.getTagName());

		WebElement cssSelectorElement = driver.findElement(By.cssSelector("a[data-qatgt=\"camaro_trigger\"]"));
		System.out.println(cssSelectorElement.getTagName());

		WebElement elementText = driver.findElement(By.linkText("Dodge Challenger Accessories & Parts"));
		WebElement elementPartialText = driver.findElement(By.partialLinkText("Dodge Challenger Accessories"));

		boolean check = elementText.equals(elementPartialText);
		System.out.println(check);

		WebElement elemenXPath = driver.findElement(By.xpath("//a[@data-qatgt=\"challenger_trigger\"]"));
		System.out.println(elemenXPath);

		// Id Locator
		// Name Locator

		driver.navigate().to("https://www.americanmuscle.com/2016-camaro-accessories-parts.html?rd=1");

		By changeVehicleSelector = RelativeLocator.with(By.tagName("a"))
				.below(By.cssSelector("a[data-target=\"gen_select_vfw\"]"));

		WebElement changeVehicleLink = driver.findElement(changeVehicleSelector);
		changeVehicleLink.click();

		// ---------------RelativeLocator below -------------------
		driver.navigate().to("https://www.facebook.com/");
		By passwordFieldSelector = RelativeLocator.with(By.tagName("input")).below(By.id("email"));
		WebElement submitButton = driver.findElement(passwordFieldSelector);
		submitButton.sendKeys("123");

		// ---------------RelativeLocator below + toLeftOf (chain) -------------------
		driver.navigate().to("https://www.atlassian.com/software/jira");
		By learnMoreSelector = RelativeLocator.with(By.tagName("a"))
				.below(By.xpath("//h2[text()=\" Connect your team's work to your product roadmap \"]"))
				.toLeftOf(By.id("6b199831"));
		WebElement learnMore = driver.findElement(learnMoreSelector);
		learnMore.click();
		// ---------------all images in specific section-------------------

		WebElement imagesContainer = driver
				.findElement(By.cssSelector("div[class=\"container-fluid md-cozy-bottom wcf-201–control n0\"]"));
		List<WebElement> ourImages = imagesContainer.findElements(By.tagName("img"));
		System.out.println(ourImages.size());

		// ---------------get all h1+ h2-------------------
//		List<WebElement> headings = driver.findElements(By.cssSelector("h1,h2"));
//		System.out.println(headings.size());
//		
//		for(WebElement elm : headings) {
//			System.out.println(elm.getText());
//		}

		// ----------------all active element ------------------
		driver.get("https://www.google.ps/");
		System.setProperty("file.encoding", "utf-8");

		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("java");
		
		WebElement activeElement = driver.switchTo().activeElement();
		String activeElementTitle = activeElement.getAttribute("title");
		System.out.println(activeElementTitle);
	}

}
