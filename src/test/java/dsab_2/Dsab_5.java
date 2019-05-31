package dsab_2;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dsab_5 {
public Dsab_5(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}
		
		
	
	
	@FindBy(xpath="//input[@name='userName']")
	public static WebElement un;
	@FindBy(name="password") 
	public static WebElement psd;
	@FindBy(xpath="//input[@value='Login']") 
	public static WebElement ok;
	

}


