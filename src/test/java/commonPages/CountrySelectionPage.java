package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountrySelectionPage {
	WebDriver driver;
	public GenderSel gender;
	
	public CountrySelectionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@alt='usa']")
	WebElement USA;
	@FindBy(xpath="//img[@alt='aus']")
	WebElement AUS;
	@FindBy(xpath="//img[@alt='ca']")
	WebElement CA;
	@FindBy(xpath="//img[@alt='uk']")
	WebElement UK;
	
	public GenderSel usa() {
		USA.click();
		gender=new GenderSel (driver);
		return gender;
	}
	public GenderSel aus() {
		AUS.click();
		gender=new GenderSel (driver);
		return gender;
	}
	public GenderSel ca() {
		CA.click();
		gender=new GenderSel (driver);
		return gender;
	}
	public GenderSel uk() {
		UK.click();
		gender=new GenderSel (driver);
		return gender;
	}

}
