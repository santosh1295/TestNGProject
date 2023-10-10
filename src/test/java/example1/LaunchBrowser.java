package example1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	WebDriver driver;

	@BeforeMethod
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/choug/Videos/Selenium%20with%20Java/Html%20task/Html%20task/Task1/signup.html");
	}

	@Test
	public void alertdemo() {
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		// String alerttext= driver.switchTo().alert().getText();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		alert.accept();
		// alert.dismiss();
	}

	@Test
	public void methodtwo() {
		System.out.println("Hi this method two");
		driver.findElement(By.id("firstname")).sendKeys("Santosh");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		alert.accept();
	}

	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}
