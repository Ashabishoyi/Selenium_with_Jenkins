package amazonsource_pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchresult_page {
	
	
	
	
@FindBy(xpath="//div[@class='a-section aok-relative s-image-fixed-height']")
	WebElement product;
public void firstproduct_click(WebDriver driver)
{
	firstproduct.click();

Set<String>pcid=driver.getWindowHandles();
System.out.println(pcid);
Iterator <String>pc=pcid.iterator();//for seperation of pcid and cd
String parentid=pc.next();
String childid=pc.next();
System.out.println(parentid);
System.out.println(childid);
driver.switchTo().window(childid);

//	@FindBy(id="continue")
////	WebElement continue_button;
////	@FindBy(name="password")
////	WebElement password;
////	@FindBy(id="auth-signin-button")
////	WebElement signin_button;
////	

//public void Product() {
//	product.click();
//}
//public void search() {
//	searchbox	.sendKeys("story books"+Keys.ENTER);
//}
//step3
public Amz_HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}