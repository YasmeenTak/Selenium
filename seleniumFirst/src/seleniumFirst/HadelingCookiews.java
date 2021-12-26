package seleniumFirst;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HadelingCookiews {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://example.com/some404page");
		Cookie testCookie = new Cookie("testKey", "testValue");
		driver.manage().addCookie(testCookie);

		Cookie testCookie2 = new Cookie("testKey2", "testValue2");
		driver.manage().addCookie(testCookie2);

		Cookie testCookie3 = new Cookie("testKey3", "testValue3");
		driver.manage().addCookie(testCookie3);

		String currentCookieValue = driver.manage().getCookieNamed("testKey").getValue();
		System.out.println("Cookie value: " + currentCookieValue);
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies);

//		driver.manage().deleteCookieNamed("testKey3");
//		
//		allCookies = driver.manage().getCookies();
//		System.out.println(allCookies);
		//driver.manage().deleteAllCookies();
//		
//		driver.manage().deleteCookie(testCookie2);
//		allCookies = driver.manage().getCookies();
//		System.out.println(allCookies);

		for (Cookie cookie : allCookies) {
			System.out.println(cookie.getDomain());
		}

	}

}

//
//import java.util.Set;
//
//import org.openqa.selenium.Cookie;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class HandlingCockies {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://example.com/some404page");
//		Cookie testCookie = new Cookie("testKey", "testValue");
//		driver.manage().addCookie(testCookie);
//		
//		Cookie testCookie2 = new Cookie("testKey2", "testValue2");
//		driver.manage().addCookie(testCookie2);
//		
//		Cookie testCookie3 = new Cookie("testKey3", "testValue3");
//		driver.manage().addCookie(testCookie3);
//		
//		
//		String currentCookieVal = driver.manage().getCookieNamed("testKey").getValue();
//		System.out.println(currentCookieVal);
//		Set <Cookie>allCookies = driver.manage().getCookies();
//		System.out.println(allCookies);
//		
////		driver.manage().deleteCookieNamed("testKey3");
////		
////		allCookies = driver.manage().getCookies();
////		System.out.println(allCookies);
//		//driver.manage().deleteAllCookies();
//	
////		driver.manage().deleteCookie(testCookie2);
////		
////		allCookies = driver.manage().getCookies();
////		System.out.println(allCookies);
//		
//		for(Cookie cookie:allCookies ) {
//			System.out.println(cookie.getDomain());
//		}
//		
//		
//	}
//
//}
