package pageUI.Shoppee.User;

public class AbstractPageUI {
	public final static String SEARCH_TEXTBOX="//input[@class='shopee-searchbar-input__input']";
	public final static String SEARCH_BUTTON="//*[name()='svg' and @class='shopee-svg-icon ']/parent::*";
	public static final String ACCOUNT_INFOR_HEADER="//*[name()='svg' and @class='shopee-svg-icon icon-headshot']//ancestor::*/following-sibling::*[text()='%s']";
	public static final String CART_NOT_EMPTY="//*[name()='svg' and @class='shopee-svg-icon navbar__link-icon icon-shopping-cart-2']/following-sibling::*";
	public static final String CART_ICON="//a[@class='cart-drawer flex v-center']";
	public static final String CART_EMPTY_MESSAGER="//div[@id='stardust-popover47']";
	public static final String CART_WITH_QUANTITY="//*[name()='svg' and @class='shopee-svg-icon navbar__link-icon icon-shopping-cart-2']/following-sibling::*[text()='%s']";
	public static final String VIEW_CART_BUTTON="//a[ contains(.,'Xem Giỏ hàng')]";
	
}


