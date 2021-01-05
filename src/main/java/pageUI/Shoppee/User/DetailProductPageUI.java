package pageUI.Shoppee.User;

public class DetailProductPageUI {
	public static final String NAME_PRO="//div[text()='Yêu thích']/following-sibling::*[text()='%s']";
	public static final String IMAGE_PRO="(//div[text()='Yêu thích']/ancestor::*/preceding-sibling::*//img)[1]";
	public static final String PRICE_PRO="//div[text()='%s']";
	public static final String BRANCH_PRO="//img[@class='shopee-avatar__img']/ancestor::*/following-sibling::*/div[text()='%s']";
	public static final String CHIRLD_SELECTION="//span[contains(.,'Huyện Ba Vì, Hà Nội')]/parent::*/following-sibling::*//ul";
	public static final String PARENT_SELECTION="//span[contains(.,'Huyện Ba Vì, Hà Nội')]";
	public static final String MY_SELECTION="//li[text()='%s']";
	public static final String LOCATION_SELECTION="//span[contains(.,'%s')]";
	public static final String MATERIAL_SELECTION="//label[text()='Kiểu Mẫu']/following-sibling::*/button[text()='%s']";
	public static final String ADD_BUTTON="//span[text()='thêm vào giỏ hàng']/parent::button";
	public static final String PRODUCT_IN_CART="//div[text()='Sản phẩm mới thêm']/following-sibling::*/div[contains(@style,'url')]/following-sibling::*//*[contains(.,'%s')]//div[text()='%s']";
}
