package com.Shoppee.User;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import common.AbstractTest;
import common.PageObjectManager;
import pageObject.Shoppee.User.CartPageObject;
import pageObject.Shoppee.User.DetailProductPageObject;
import pageObject.Shoppee.User.HomePageObject;
import pageObject.Shoppee.User.LoginPageObject;
import pageObject.Shoppee.User.SearchPageObject;

public class User_Shoppee extends AbstractTest {
	public static WebDriver driver;
	String namePro="[Mã TOYJAN hoàn 20K xu đơn 50K] COMBO 3 Gạch Technic NO.495 - Phụ Kiện Tương Thích 32056 Và 32250";
	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browserName,String url) {
		
		driver= getBrowserDriver(browserName,url);
		log.info("Go to Homepage");
		homepage= PageObjectManager.getHomePageObject(driver);
		log.info("popup homepage is displayed");
		verifyTrue(homepage.popupHomePageDisplayed());
		log.info("image popup is displayed");
		verifyTrue(homepage.imagePopupDisplayed());
		homepage.closeToPopup();
		log.info("Go to Login page");
		loginpage=homepage.clickToLoginButton();
		log.info("Input phone number, password to textbox");
		verifyTrue(loginpage.titlePageDisplayed());
		loginpage.inputToUserNameTextBox("0963915537");
		loginpage.inputToPassWordTextBox("Ngahuyenhai");
		loginpage.clickToLoginButton();
		log.info("Đến bước xác nhận mã sms trả về, cái này handle phức tạp,có 2 cách 1 là nhờ dev fix cứng mã, 2 là trick moblie,cách này chưa bit làm nên bước này vui lòng nhập tay");
		homepage=loginpage.clickToVerifyButton();
		homepage.closeToPopup();
		log.info("Login success");
		verifyTrue(homepage.accountNameDisplayed("1017ss426a"));
	}
	
	@Test
	public void TC_01_Search_Product() {
		log.info("Search product at Homepage");
		homepage.inputToSearchTextBox(namePro);
		searchpage=homepage.clickToSearchButton();
		log.info("Search page is displayed");
		verifyTrue(searchpage.searchPageTitleDisplay());
		log.info("product is dispayed");
		verifyTrue(searchpage.productDisplayOnSearchpage(namePro,"3.000","6.000"));
		detailProductPage=searchpage.clickToProduct(namePro);
	}
	
	public void TC_02_Check_Cart_Before_Select_Product() {
		log.info("Cart is empty");
		verifyFalse(detailProductPage.cartEmptyDisplayed());
		detailProductPage.hoverToCart();
		log.info("product quantity is displayed on header page is ");
		verifyTrue(detailProductPage.cartEmptyMessageDisplayed());
	}
	
	public void TC_03_Add_Product_To_Cart() {
		log.info("product name detail is displayed");
		verifyTrue(detailProductPage.productNameDisplayed(namePro));
		log.info("product image detail dispay");
		verifyTrue(detailProductPage.productImageDisplayed());
		log.info("product detail price is displayed");
		verifyTrue(detailProductPage.productPriceInforDisplayed("₫3.000 - ₫6.000"));
		log.info("product detail brand is displayed");
		verifyTrue(detailProductPage.productBranchDisplayed("kuken_shop"));
		detailProductPage.selectPlaceTransportTo("Bắc Ninh","Thị Xã Từ Sơn");
		log.info("Transport Info is displayed");
		verifyTrue(detailProductPage.transportFeeDisplayed("Thị Xã Từ Sơn, Bắc Ninh"));
		detailProductPage.selectMaterialProduct("Mẫu 1");
		verifyTrue(detailProductPage.productPriceInforDisplayed("₫6.000"));
		detailProductPage.clickAddToCartButton();
	}
	
	public void TC_04_Check_Cart_After_Add_Product_To_Cart(){
		detailProductPage.clickAddToCartButton();
		log.info("product quantity is displayed on header page is '1'");
		verifyTrue(detailProductPage.cartDisplayedwithQuantity("1"));
		log.info("product is displayed in cart popup");
		verifyTrue(detailProductPage.productDisplayedInCart("[Mã TOYJAN hoàn 20K xu đơn 50K]","₫6.000"));
		cartpage=detailProductPage.clickToViewCart();
		log.info("Cart page is displayed");
		verifyTrue(cartpage.titleCartPageDisplayed());
		log.info("Product header is displayed");
		verifyTrue(cartpage.titleInforProductDisplayed("Sản phẩm","Đơn giá","Số lượng","Số tiền","Thao tác"));
		log.info("Product detail infor is displayed in cart page");
	}
	
	public void afterClass() {
		driver.quit();
	}
	
	HomePageObject homepage;
	SearchPageObject searchpage;
	DetailProductPageObject detailProductPage;
	LoginPageObject loginpage;
	CartPageObject cartpage;
}
