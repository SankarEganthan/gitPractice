package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void enterUrl(String url) {
		driver.get(url);
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public WebElement elementFindById(String username) {
		WebElement element = driver.findElement(By.id(username));
		return element;
	}
	public void elementSendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	public void elementClick(WebElement element) {
		element.click();
	}
	public String elementGetAttribute(WebElement element) {
		String value = element.getAttribute("value");
		return value;
	}
	public void selectByVisibleText(WebElement element, String text){
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public int getExcelRowNumbers(String filePath, String sheetName) throws IOException {
		File file = new File(filePath);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		return numberOfRows;
		}
	public String getExcelCellValue(String filePath, String sheetName, int rownum, int cellnum) throws IOException {
		File file = new File(filePath);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		String value=null;
				switch(cellType) {
				case STRING:
					value = cell.getStringCellValue();
				break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
						value = simpleDateFormat.format(dateCellValue);
					}else {
						double numericCellValue = cell.getNumericCellValue();
						long round = Math.round(numericCellValue);
						if(round == numericCellValue) {
							value = String.valueOf(round);
						}else {
							value = String.valueOf(numericCellValue);
						}
					}break;
					default:
						break;
				}
				System.out.println(value);
				return value;
	}
	public void attributeValueWriteInExcel(String filePath, String sheetName, int rownum, int cellnum, String value) throws IOException {
		File file = new File(filePath);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(value);
		FileOutputStream stream1 = new FileOutputStream(file);
		workbook.write(stream1);	
	}
	public void quit() {
		driver.quit();
	}

}
