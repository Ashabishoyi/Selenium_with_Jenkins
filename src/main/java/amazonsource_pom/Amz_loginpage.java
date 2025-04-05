package amazonsource_pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AmzLoginPage {
    WebDriver driver;
    
    @FindBy(id = "ap_email")
    WebElement username;
    
    @FindBy(id = "continue")
    WebElement continueButton;
    
    @FindBy(name = "password")
    WebElement password;
    
    @FindBy(id = "signInSubmit")
    WebElement signInButton;

    public AmzLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String user) {
        username.sendKeys(user);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public void login(String user, String pass) {
        enterUsername(user);
        clickContinue();
        
        // Explicit wait for password field
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(password));
        
        enterPassword(pass);
        clickSignIn();
    }
}

public class Amz_loginpage {
    WebDriver driver;
    
    @FindBy(id = "ap_email")
    WebElement username;
    
    @FindBy(id = "continue")
    WebElement continueButton;
    
    @FindBy(name = "password")
    WebElement password;
    
    @FindBy(id = "signInSubmit")
    WebElement signInButton;

    public Amz_loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String user) {
        username.sendKeys(user);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public void login(String user, String pass) {
        enterUsername(user);
        clickContinue();
        
        // Explicit wait for password field
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(password));
        
        enterPassword(pass);
        clickSignIn();
    }
}
