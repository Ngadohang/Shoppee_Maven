package pageObject.Shoppee.User;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import common.PageObjectManager;
import pageUI.Shoppee.User.LogInPageUI;

public class LoginPageObject extends AbstractPage {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean titlePageDisplayed() {
		return isElementDisplay(driver, LogInPageUI.LOGIN_TITLE_PAGE);
	}

	public void inputToUserNameTextBox(String phone) {
		waitForElementVisible(driver, LogInPageUI.USERNAME_TEXTBOX);
		senkeyToElement(driver, LogInPageUI.USERNAME_TEXTBOX, phone);
	}

	public void inputToPassWordTextBox(String password) {
		waitForElementVisible(driver, LogInPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, LogInPageUI.PASSWORD_TEXTBOX, password);
	}

	public void clickToLoginButton() {
		waitForElementVisible(driver, LogInPageUI.LOGIN_BUTTON);
		clickToElement(driver, LogInPageUI.LOGIN_BUTTON);
	}

	public HomePageObject clickToVerifyButton() {
		sleepInMilisecond(20000);
		String textNeed = getTextAttribute(driver, LogInPageUI.CODE_TEXBOX, "value");
		System.out.println(textNeed);
		try {
			if (textNeed.length() ==6) {
				System.out.println(textNeed);
				waitForElementVisible(driver, LogInPageUI.VERIFY_BUTTON);
				clickElementByJs(driver, LogInPageUI.VERIFY_BUTTON);
			}
		} catch (Exception e) {
			log.info("you don't input the code");
		}

		return PageObjectManager.getHomePageObject(driver);
	}

}
