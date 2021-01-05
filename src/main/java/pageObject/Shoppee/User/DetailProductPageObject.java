package pageObject.Shoppee.User;

import org.openqa.selenium.WebDriver;

import common.AbstractPage;
import common.PageObjectManager;
import pageUI.Shoppee.User.AbstractPageUI;
import pageUI.Shoppee.User.DetailProductPageUI;

public class DetailProductPageObject extends AbstractPage {
	private WebDriver driver;

	public DetailProductPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean cartEmptyDisplayed() {
		return isElementDisplay(driver, AbstractPageUI.CART_NOT_EMPTY);
	}

	public void hoverToCart() {
		waitForElementVisible(driver, AbstractPageUI.CART_ICON);
		hoverMouseToElement(driver, AbstractPageUI.CART_ICON);
	}

	public boolean cartEmptyMessageDisplayed() {
		return isElementDisplay(driver, AbstractPageUI.CART_EMPTY_MESSAGER);
	}

	public boolean productNameDisplayed(String namePro) {
		return isElementDisplay(driver, DetailProductPageUI.NAME_PRO);
	}

	public boolean productImageDisplayed() {
		return isImageLoaded(driver, DetailProductPageUI.IMAGE_PRO);
	}

	public boolean productPriceInforDisplayed(String value) {
		return isElementDisplay(driver, DetailProductPageUI.PRICE_PRO, value);
	}

	public boolean productBranchDisplayed(String value) {
		return isElementDisplay(driver, DetailProductPageUI.BRANCH_PRO);
	}

	public void selectPlaceTransportTo(String state, String city ) {
		waitToElementClickable(driver, DetailProductPageUI.PARENT_SELECTION);
		clickToElement(driver, DetailProductPageUI.PARENT_SELECTION);
		waitForElementPresence(driver, DetailProductPageUI.CHIRLD_SELECTION);
		scrollToElement(driver,DetailProductPageUI.MY_SELECTION, state );
		waitToElementClickable(driver, DetailProductPageUI.MY_SELECTION, state);
		clickToElement(driver, DetailProductPageUI.MY_SELECTION, state );
		waitForElementPresence(driver,DetailProductPageUI.MY_SELECTION, city );
		scrollToElement(driver, DetailProductPageUI.MY_SELECTION, city);
		waitToElementClickable(driver, DetailProductPageUI.MY_SELECTION, city);
		clickToElement(driver, DetailProductPageUI.MY_SELECTION, city);
	}


	public boolean transportFeeDisplayed(String value) {
		return isElementDisplay(driver, DetailProductPageUI.LOCATION_SELECTION,value);
	}

	public void selectMaterialProduct(String value) {
		waitToElementClickable(driver, DetailProductPageUI.MATERIAL_SELECTION,value);
		clickToElement(driver, DetailProductPageUI.MATERIAL_SELECTION,value);
	}

	public void clickAddToCartButton() {
		waitToElementClickable(driver, DetailProductPageUI.ADD_BUTTON);
		clickToElement(driver, DetailProductPageUI.ADD_BUTTON);
	}

	public boolean cartDisplayedwithQuantity(String value) {
		return isElementDisplay(driver, AbstractPageUI.CART_WITH_QUANTITY, value);
	}

	public boolean productDisplayedInCart(String...value) {
		return isElementDisplay(driver, DetailProductPageUI.PRODUCT_IN_CART, value);
	}

	public CartPageObject clickToViewCart() {
		waitToElementClickable(driver, AbstractPageUI.VIEW_CART_BUTTON);
		clickToElement(driver, AbstractPageUI.VIEW_CART_BUTTON);
		return PageObjectManager.getCartPageObject(driver);
	}

}
