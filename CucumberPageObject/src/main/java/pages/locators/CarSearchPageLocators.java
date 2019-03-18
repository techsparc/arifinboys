package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {
	
	@FindBy(how=How.XPATH,using="//*[@id=\"makes\"]")
	public WebElement carmakeDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"models\"]")
	public WebElement selectModelDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"locations\"]")
	public WebElement selectLocationDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"price-max\"]")
	public WebElement priceDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search-submit\"]")
	public WebElement findMyNextCarBtn;
	

}
