package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.BasePage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest extends BasePage {
	
	WebDriver driver;

 
//	
//	String userName = null;  
//	String password = null;   
//	
//	String fullName = null;   
//	String Company  = null;   
//	String Email  = null;   
//	String Phone  = null;   
//	String Address  = null;   
//	String City  = null;   
//	String State  = null;   
//	String Zip  = null;   
//	String Group  = null;   
// 
	@Test
	@Parameters({"userName","password","fullName","Company","Email","Phone","Address","City","State","Zip","Group"})
  public void  ValidUserShouldBeAbleToAddCustomer(String userName ,String password,String fullName,String Company,String Email,String Phone,String Address,String City,String State,String Zip, String Group) throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clinkSignButton();
		
		//DashboardPage dash = PageFactory.initElements(driver, DashboardPage.class);
		//dash.isDashboardDisplayed();
		
	  
		AddCustomerPage cos = PageFactory.initElements(driver, AddCustomerPage.class); 
		cos.clickCustomersButton();
		cos.clickAddCustomersButton();
		
		cos.insertFullName(fullName);
		cos.insertCompanyName(Company);
		cos.insertEmail(Email);
		cos.insertPhone(Phone);
		cos.insertAdress(Address);
		cos.insertCity(City);
		cos.insertState(State);
		cos.insertZip(Zip);
		cos.clickSaveButton();
		
	  
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}