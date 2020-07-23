package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//element library
	//WebElement WebElement_USERNAME_FIELD = driver.findElement(By.xpath("//*[@id='username']"));
	//By USERNAME_FIELD_LOCATOR = By.xpath("//*[@id=\"username\"]");
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"username\"]") 
	WebElement USERNAME_FIELD ;
	@FindBy(how = How.XPATH, using ="//*[@id=\"password\"]")
	WebElement PASSWORD_FIELD ;
	@FindBy(how = How.NAME, using ="login") 
	WebElement SIGING_BUTTON_FIELD ;
	
	
	//methods to interact with elements 
	
	public void enterUserName(String userName){
		
		USERNAME_FIELD.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}
	
	public void clinkSignButton() {
		SIGING_BUTTON_FIELD.click();
	}

}
