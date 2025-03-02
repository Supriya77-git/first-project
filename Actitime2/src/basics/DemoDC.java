package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDC {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.findElement(By.linkText("TASKS")).click();
	driver.findElement(By.xpath("//input[@placeholder='Start typing name ...']")).sendKeys("Dhoni");
	driver.findElement(By.xpath("//span[@class='highlightToken']/../../div[@class='editButton available']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@class,'edit_customer')]//div[text()='ACTIONS']")).click();
	driver.findElement(By.xpath("//div[.='Delete']")).click();
	driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
	String text = driver.findElement(By.className("innerHtml")).getText();
	System.out.println(text);
	driver.quit();
}
}
