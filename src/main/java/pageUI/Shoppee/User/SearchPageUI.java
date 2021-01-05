package pageUI.Shoppee.User;

public class SearchPageUI {
	public static final String TITLE_PAGE="//div[text()='Bộ lọc tìm kiếm']";
	public static final String PRODUCT_BY_NAME="//div[text()='%s']/ancestor::*[@data-sqe='item']";
	public final static String PRODUCT_INFOR="//div[text()='%s']/parent::*/following-sibling::*//div[contains(.,'₫')and contains(.,'%s') and contains(.,'%s')]/ancestor::*/preceding-sibling::*/img[contains(@src,'https://cf.shopee.vn')]";

}

