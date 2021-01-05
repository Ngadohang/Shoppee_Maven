package pageObject.Shoppee.User;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import common.PageObjectManager;
import pageUI.Shoppee.User.SearchPageUI;

public class SearchPageObject extends AbstractPage {
	private WebDriver driver;

	public SearchPageObject(WebDriver driver) {
		this.driver=driver;
	}

	public boolean productDisplayOnSearchpage(String...value) {
		return isElementDisplay(driver, SearchPageUI.PRODUCT_INFOR, value);
	}

	public DetailProductPageObject clickToProduct(String namePro) {
		waitForElementVisible(driver, SearchPageUI.PRODUCT_BY_NAME, namePro);
		clickToElement(driver, SearchPageUI.PRODUCT_BY_NAME, namePro);
		return PageObjectManager.getDetailProductPageObject(driver);
	}

	public boolean searchPageTitleDisplay() {
		return isElementDisplay(driver, SearchPageUI.TITLE_PAGE);
	}

}
