package baseComponent;

import org.testng.annotations.AfterMethod;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import commonPages.GenderSel;
import commonPages.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfigFile;

public class BaseClass extends ReadConfigFile {
   public WebDriver driver;
	public LandingPage page;
	
	@Parameters("browser")
	public WebDriver browserInitilize() throws IOException {
		String browser = fileReading();
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			//options.addArguments("--headless");
			options.addArguments("--enable-notifications");
			driver = new ChromeDriver(options);
		}
		else if (browser.equalsIgnoreCase("edge")) {
			// code here
		    EdgeOptions options = new EdgeOptions();
	        options.addArguments("-inprivate");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(options);
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			// code here
			
			FirefoxOptions options = new FirefoxOptions();
			options.addPreference("dom.webnotifications.enabled", false);
	        options.addPreference("permissions.default.desktop-notification", 2);
			//options.addArguments("-private");

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options);
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		return driver;
	}

	@BeforeMethod(alwaysRun=true)
	public LandingPage landingPageUrl() throws Throwable {
		String Url = Url();
		driver = browserInitilize();
		driver.get(Url);
		page = new LandingPage(driver);
		return page;
	}

	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.manage().deleteAllCookies();
	    driver.quit();
	}
}
