package HrmMyFirstTestNgDemo.Hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class Amazonparameter {

	@org.testng.annotations.Test
	@Parameters({"a","b","c"})
	public void parameter(String use,String pass,String pass2 ) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		WebElement emailid = driver.findElement(By.cssSelector("input[name='email'][type='email']"));
		emailid.sendKeys(use);
		driver.findElement(By.cssSelector("input[tabindex='5']")).click();
		WebElement passwoed= driver.findElement(By.cssSelector("input[type='password']"));
		passwoed.sendKeys(pass);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(1000);
		WebElement anotherpassdri = driver.findElement(By.cssSelector("input[name='password'][tabindex='2']"));
		anotherpassdri.sendKeys(pass2);
		

	}
}
