package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {

	CarSearchPageLocators carsSearchPageLocators = null;

	public CarsSearchPageActions() {
		this.carsSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsSearchPageLocators);
	}

	public void selectCarMake(String carBrand) {

		Select selectCarMaker = new Select(carsSearchPageLocators.carmakeDropDown);
		selectCarMaker.selectByVisibleText("BMW");
	}

	public void selectCarModel(String carModel) {

		Select selectCarMaker = new Select(carsSearchPageLocators.selectModelDropDown);
		selectCarMaker.selectByVisibleText("1 SERIES");
	}

	public void selectCarLocation(String carLocation) {

		Select selectCarMaker = new Select(carsSearchPageLocators.selectLocationDropDown);
		selectCarMaker.selectByVisibleText("Australia");
	}

	public void selectCarPrice(String carPrice) {

		Select selectCarMaker = new Select(carsSearchPageLocators.priceDropDown);
		selectCarMaker.selectByVisibleText("$1,000");
		
	}

	public void clickOnFindMyNextCarButton() {

		carsSearchPageLocators.findMyNextCarBtn.click();
	}

}
