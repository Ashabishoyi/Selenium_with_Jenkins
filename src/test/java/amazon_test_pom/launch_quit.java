package amazon_test_pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class launch_quit {
	WebDriver driver;
 
public void launch() {
	driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in");
}



	@AfterMethod
public void quit() throws InterruptedException{
	Thread.sleep(2000);
	driver.quit();
}
}

