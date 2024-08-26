package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;


public class UtilityCls {
	
	public static WebDriver driver;
	
	public String sheetname;
		
	@Parameters({"Url","browser"})

	
public void browserLaunch(String Url, String browser) 
	
	{ 		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			
		
	    driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
	}

	public void browserClose()
	{
		driver.close();
	}
	
	
	public static String[][] readExcel(String sheetname) throws Exception {
		
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject\\src\\test\\resources\\DemoWebShopDataFile.xlsx");
		XSSFSheet sheet = book.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		short columncount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowcount][columncount];
		for(int i = 1 ; i <= rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j = 0; j < columncount; j++) {
				
				XSSFCell cell = row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		
		book.close();
		return data;
	}
	public String screenShot(String name) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\eclipse-workspace\\BestBuyProject\\snap\\"+name+".png");
		FileUtils.copyFile(src, dest);
		return name;
	}
	
	public void soft_assert(String actualText,String expectedText) 
	{
	SoftAssert obj = new SoftAssert();
	obj.assertEquals(actualText,expectedText);
	obj.assertAll();
	}


}
