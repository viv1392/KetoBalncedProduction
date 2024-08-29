package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;



public class LandingPage extends UtilisClass{
	
	public WebDriver driver;
	public GenderSel gender;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Take the Quiz '] ")
	WebElement ele;
	
    public GenderSel landingPage() throws InterruptedException {
    	Thread.sleep(2000);
    	//actionClass(driver,0,200);
    	scriptExecutor(ele,driver);
    	//ele.click();
    	gender=new  GenderSel(driver);
    	return gender;
    	 
    }
}
