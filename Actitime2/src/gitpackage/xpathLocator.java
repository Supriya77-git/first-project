package gitpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocator {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("./data/commondata.properties.txt");
		Properties p =new Properties();
		p.load(f);
		String url=p.getProperty("url");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		FileInputStream fs=new FileInputStream("./data/login.xlsx");
		Workbook w=WorkbookFactory.create(fs);
		String s=w.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
		System.out.println(s);
		
		
		
		
		
	

	}

}
