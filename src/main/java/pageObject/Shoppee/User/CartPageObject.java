package pageObject.Shoppee.User;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import pageUI.Shoppee.User.AbstractPageUI;
import pageUI.Shoppee.User.CartPageUI;

public class CartPageObject extends AbstractPage{
	private WebDriver driver;
	
	public CartPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean titleInforProductDisplayed(String string, String string2, String string3, String string4,
			String string5) {
		return false;
	}

	public boolean titleCartPageDisplayed() {
		return isElementDisplay(driver, CartPageUI.TITLE_PAGE);
	}

}
