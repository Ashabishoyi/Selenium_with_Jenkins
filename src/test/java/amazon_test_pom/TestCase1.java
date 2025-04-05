package amazon_test_pom;



import org.testng.annotations.Test;

import amazonsource_pom.Amz_HomePage;
import amazonsource_pom.Amz_loginpage;


public class TestCase1 extends launch_quit{
@Test
public void login_search_wishlist_cart_logout()
{
	//Loginpage,HomePage,Searchresultpage
	Amz_HomePage homepage=new  Amz_HomePage(driver);
	homepage.HoverOveronAccountandList (driver);
	homepage.signin_click();
	homepage.search();
	
Amz_loginpage loginpage=new Amz_loginpage(driver);
	loginpage.enterUsername(null);
	loginpage.clickContinue();
	loginpage.enterPassword(null);
	loginpage.clickSignIn();
	
	
	
	AmazonProductPage1 wishlist=new AmazonProductPage1(driver);
	wishlist.addtowishlist_click();
	wishlist.viewyourlist_click();
	wishlist.addtocart();
	wishlist.viewcart();
}

	
	
}
}

