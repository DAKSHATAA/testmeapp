package dsab_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dsab_6 {
	WebDriver driver;

	@Given("user login to TestMeApp")
	public void user_login_to_TestMeApp() {
		 {
			System.out.println("user launched chorme and naviagtes to TestMeApp");
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://newtours.demoaut.com");
	  System.out.println("user login");  
	}
	}
	@When("user selects product as {string}")
	public void user_selects_product_as(String hp) {
	  System.out.println("entered product is"+hp); 
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
	    System.out.println("user clicks on add to cart");
	}

	@When("user clicks on cart link")
	public void user_clicks_on_cart_link() {
		System.out.println("user clicks on cart link");
	}

	@When("user provides quantity as {int}")
	public void user_provides_quantity_as(Integer n) {
		System.out.println("user provides quantity as"+n);  
	}

	@When("user proceed checkout")
	public void user_proceed_checkout() {
		System.out.println("user proceed checkout");
	}

	@Then("verify the reiew and payment page")
	public void verify_the_reiew_and_payment_page() {
		System.out.println("verify the reiew and payment page");
	}

}

