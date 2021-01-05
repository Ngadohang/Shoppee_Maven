package pageObject.Shoppee.User;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import common.PageObjectManager;
import pageUI.Shoppee.User.AbstractPageUI;
import pageUI.Shoppee.User.HomePageUI;
import pageUI.Shoppee.User.LogInPageUI;

public class HomePageObject extends AbstractPage {
	private WebDriver driver;
	public HomePageObject(WebDriver driver) {
		this.driver=driver;
	}
	public void inputToSearchTextBox(String value) {
		waitForElementVisible(driver, AbstractPageUI.SEARCH_TEXTBOX);
		senkeyToElement(driver, AbstractPageUI.SEARCH_TEXTBOX, value);
	}
	public SearchPageObject clickToSearchButton() {
		waitForElementVisible(driver, AbstractPageUI.SEARCH_BUTTON);
		clickToElement(driver, AbstractPageUI.SEARCH_BUTTON);
		return PageObjectManager.getSearchPageObject(driver);
	}
	public LoginPageObject clickToLoginButton() {
		waitForElementVisible(driver, LogInPageUI.LOGIN_LINK);
		clickToElement(driver, LogInPageUI.LOGIN_LINK);
		return PageObjectManager.getLoginPageObject(driver);
	}
	public boolean accountNameDisplayed(String value) {
		return isElementDisplay(driver,AbstractPageUI.ACCOUNT_INFOR_HEADER, value);
	}
	public boolean popupHomePageDisplayed() {
		return isElementDisplay(driver, HomePageUI.IMAGES_POPUP);
	}
	public void closeToPopup() {
		waitForElementVisible(driver, HomePageUI.CLOSE_POPUP_BUTTON);
		clickToElement(driver, HomePageUI.CLOSE_POPUP_BUTTON);
	}
	public boolean imagePopupDisplayed() {
		return isElementDisplay(driver, HomePageUI.IMAGES_POPUP);
	}

}
