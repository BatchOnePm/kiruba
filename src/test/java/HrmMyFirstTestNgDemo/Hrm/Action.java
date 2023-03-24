package HrmMyFirstTestNgDemo.Hrm;


import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");

		WebElement dragMe = driver.findElement(By.id("draggable"));

		WebElement dropHere = driver.findElement(By.id("droppable"));
		Thread.sleep(1000);

		Actions ac = new Actions(driver);
		ac.dragAndDrop(dragMe, dropHere).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();

	}

}


