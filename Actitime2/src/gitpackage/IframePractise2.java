package gitpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractise2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.name("mytext3")).sendKeys("padmini");
		Thread.sleep(3000);
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("(//div[@class='vd3tt'])[3]"));
		ele.click();
		driver.findElement(By.xpath("//input[@class='Hvn9fb zHQkBf']")).sendKeys("program ended");
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
