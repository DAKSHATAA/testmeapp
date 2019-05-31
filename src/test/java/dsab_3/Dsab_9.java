package dsab_3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dsab_2.Dsab_5;
public class Dsab_9 {
WebDriver driver;
	
	
	@Given("user launching TestMeApp")
	public void user_launching_TestMeApp() {
		
		System.out.println("chrome browser is launched and URL is entered");
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.navigate().to("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	}

	@When("user enter username as {string} And password as {string}")
	public void user_enter_username_as_And_password_as(String un, String psd) {
		Dsab_5 lp = new Dsab_5(driver);
		lp.un.sendKeys(un);
	    lp.psd.sendKeys(psd);
		
	    
	}

	@Then("Click Ok")
	public void click_Ok() {
		Dsab_5 lp = new Dsab_5(driver);
		Dsab_5.ok.click();
	    
	}

	@Then("verify login result")
	public void verify_login_result() {
	    
	}
	

}


