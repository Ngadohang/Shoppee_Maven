package common;

import org.openqa.selenium.WebDriver;

import pageObject.Shoppee.User.CartPageObject;
import pageObject.Shoppee.User.DetailProductPageObject;
import pageObject.Shoppee.User.HomePageObject;
import pageObject.Shoppee.User.LoginPageObject;
import pageObject.Shoppee.User.SearchPageObject;

public class PageObjectManager {
	
	public static HomePageObject getHomePageObject(WebDriver driver) {
		return new HomePageObject(driver);
		
	}

	public static SearchPageObject getSearchPageObject(WebDriver driver) {
		return new SearchPageObject(driver);
	}

	public static LoginPageObject getLoginPageObject(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	
	public static DetailProductPageObject getDetailProductPageObject(WebDriver driver) {
		return new DetailProductPageObject(driver);
	}
	public static CartPageObject getCartPageObject(WebDriver driver) {
		return new CartPageObject(driver);
	}
}

