package gitpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://doodles.google/about/#:~:text=Google%20Doodles%20are%20the%20spontaneous,individuals%20who%20have%20impacted%20culture.");
		WebElement ele=driver.findElement(By.xpath("//span[text()='2021']"));
		//int yaxis=ele.getLocation().getY();
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollTo(0,"+yaxis+")");
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		
		

	}

}
