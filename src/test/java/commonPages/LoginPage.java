package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public CountrySelectionPage countryPage;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a/p")
	WebElement getStarted;
	
	public CountrySelectionPage getStarted() {
		getStarted.click();
		countryPage=new CountrySelectionPage(driver);
		return countryPage;
		
	}

}
