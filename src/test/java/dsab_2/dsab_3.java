package dsab_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dsab_3 {
	WebDriver driver;
	@Given("user login")
	public void user_login() {
		System.out.println("user launched chromebrowser And enters TestMeApp URL");
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("user selects product using category")
	public void user_selects_product_using_category() {
		System.out.println("using category user selects product ");
	}

	@Then("verify the list of products")
	public void verify_the_list_of_products() {
		System.out.println("the list of products is verified ");
	}

	@Then("close application")
	public void close_application() {
		System.out.println("application is closed ");
	}

	@When("user selects product using sub-category")
	public void user_selects_product_using_sub_category() {
		System.out.println("using sub-category user selects product ");
	}

	@When("user selects product using product name")
	public void user_selects_product_using_product_name() {
		System.out.println("using product name user selects product ");
	}

}
