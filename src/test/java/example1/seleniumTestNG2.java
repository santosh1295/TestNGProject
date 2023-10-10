package example1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class seleniumTestNG2 extends LaunchBrowser {
	@Test
	public void methodtwo() {
		System.out.println("Hi this method two");
		driver.findElement(By.id("firstname")).sendKeys("nileshte");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		alert.accept();
	}
}
