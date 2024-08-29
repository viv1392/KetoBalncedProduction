package utilities;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UtilisClass {
	public WebDriver driver;
	public Faker fkr =new Faker();
	public void actionClass(WebDriver driver,int x,int y) {
		Actions action = new Actions(driver);
		action.scrollByAmount(x, y).build().perform();
	}
	
	public void elementWait(WebDriver driver,WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30)); 
		wait.until(ExpectedConditions.invisibilityOf(ele));	
	}
	
	public static String screenShot(WebDriver driver, String testName) throws IOException {
		File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath = System.getProperty("user.dir")+"//Screenshots//"+testName+".png";
		try {
			FileHandler.copy(srcScreenshot,new File(destinationScreenshotPath));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return destinationScreenshotPath;
	}
	public void scriptExecutor(WebElement ele ,WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
	}
	@Test
	public static Object[][] testData() throws IOException {
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"//testData//Book1.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fs);
		XSSFSheet sheet=book.getSheet("testDataKeto");
		int row=sheet.getPhysicalNumberOfRows();
		int cell=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] testData = new Object[row][cell];
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<cell;j++) {
				testData[i-1][j]=sheet.getRow(i).getCell(j);
			}
		}
		book.close();
		return testData;
	}
}
