package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//Alert with ok button
		//driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		//Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		// Alert with ok & Cancel button
		/*driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(3000);
		Alert text=driver.switchTo().alert();
		System.out.println(text.getText());
		text.dismiss();*/
		// Alert with Prompt
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(3000);
		Alert prompt=driver.switchTo().alert();
		Thread.sleep(2000);
		prompt.sendKeys("padmini");
		System.out.println(prompt.getText());
		Thread.sleep(2000);
		prompt.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
