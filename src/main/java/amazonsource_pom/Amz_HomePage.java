package amazonsource_pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Amz_HomePage {
	WebDriver driver;
//step1
	
	@FindBy(xpath="//a[@data-nav-ref='nav_ya_signin']")
	WebElement accountandlist;
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement signin;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	
	
	
	//step2
	public void HoverOveronAccountandList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	public void signin_click() {
		signin.click();
	}
	public void search() {
		searchbox	.sendKeys("story books"+Keys.ENTER);
	}
	//step3
	public Amz_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	}
	
	

