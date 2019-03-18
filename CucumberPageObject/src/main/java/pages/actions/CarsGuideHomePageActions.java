package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);

	}

	public void moveToCarsForSaleMenu() {
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyPlusSellLink).perform();

	}
	
public void moveToNewsMenu() {
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.newsLink).perform();

	}

	public void clickOnSearchCarsMenu() {
		
		carsGuideHomePageLocators.searchCarsLink.click();

	}

	public void clickOnUsedCarsMenu() {
		carsGuideHomePageLocators.usedLink.click();

	}
	
	public void moveToReviewsMenu() {
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.reviewsLink).perform();
		
		
	}

}
