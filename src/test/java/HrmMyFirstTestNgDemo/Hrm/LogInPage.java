package HrmMyFirstTestNgDemo.Hrm;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInPage {
	@Test
	@Parameters({"user","pws"})

	public void Browser(String Username, String password) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		WebElement UsernameTextox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		UsernameTextox.sendKeys(Username);
		WebElement psswordTextox = driver.findElement(By.xpath("//input[@type='password']"));
		psswordTextox.sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// driver.close();

	}
	public void Products() {
		
		
		
	}

}
