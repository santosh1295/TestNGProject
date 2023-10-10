package example1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTestNG1 extends LaunchBrowser {

	@Test
	public void firsttest() {
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		// String alerttext= driver.switchTo().alert().getText();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		alert.accept();
	}

}
