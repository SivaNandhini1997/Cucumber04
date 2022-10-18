package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 public static WebDriver driver;
	 public static JavascriptExecutor js;
	 public static TakesScreenshot tk;
	 public static Actions ac;
	
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	public static void ffBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	public static void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	public static void launchUrl(String s) {
		
		driver.get(s);	
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public static void minWindow() {
		driver.manage().window().minimize();
	}
	
	public static String pageUrl() {
		String c = driver.getCurrentUrl();
		return c;
	}
	
	public static void closeBroswer() {
		driver.close();
	}
	public static String pageTitle() {
		String t = driver.getTitle();
		return t;
	}
	
	public static void fillTextBox(WebElement ele, String s) {
		ele.sendKeys(s);
	}
	
	public static void btnClick(WebElement ele) {
		ele.click();
	}
	
	public static void jsFillTextBox(String txt,WebElement ele) {
		js.executeScript( "arguments[0].setAttribute('value',' "+ txt +" '", ele);
	}
	
//	public static void takeSnap(String path) {
//		File src = tk.getScreenshotAs(OutputType.FILE);
//		File dest=new File("path");
//		FileUtils.copyFile(src, );
//		}
//	
	
	public static void dblClick(WebElement ele) {
		ac.doubleClick(ele).perform();
	}

	public static String readFromExcel(String n,int rowNo,int cellNo) throws IOException {
		
		File f=new File("F:\\Maven1.30pm\\External\\Details.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook book=new XSSFWorkbook(fin);
		
		Sheet sh = book.getSheet(n);
		
		Row r = sh.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		int type = c.getCellType();
		
		String name="";
		
		if (type==1) {
			name= c.getStringCellValue();
		}
		
		else if (DateUtil.isCellDateFormatted(c)) {
			
			Date d = c.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
			 name = sim.format(d);
		}
		
		else {
			double val = c.getNumericCellValue();
			long l=(long)val;
			
			name = String.valueOf(l);
		}
		
		return name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









