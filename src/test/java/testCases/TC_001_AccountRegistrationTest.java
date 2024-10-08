package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test(groups= {"regression","master"})
	public void verify_account_registration()
	
	{
		logger.info("*******Starting TC_001_AccountRegistrationTest***** ");
		logger.debug("This is a debug log message");
		try
		{
		
		
		HomePage hp = new HomePage(driver);
		hp.clickAccount();
		logger.info("Clicked on the account link");
		
		hp.clickRegister();
		logger.info("Clicked on the register link");
		
		RegistrationPage regpage = new RegistrationPage(driver);
		
		logger.info("Providing customer details...");
		
		regpage.SetFirstName(randomeString().toUpperCase());
		regpage.SetLastName(randomeString().toUpperCase());
		regpage.SetEmail(randomeString()+"@gmail.com");
		regpage.SetPhone(randomeNumber());
		String password = randomAlphaNumeric();
		regpage.SetPassword(password);
		regpage.SetConfirmPasswd(password);
        regpage.SetPrivatePolicy();
    	regpage.SetContinue();
    	
    	logger.info("Validating comfirmation message...");
    	String confirm = regpage.getMessageConfirmation();
    	Assert.assertEquals(confirm,"Your Account Has Been Created!");
    	
    	logger.info("Test Passed");
		}
		catch(Exception e)
		{
			logger.error("Test Failed"+e.getMessage());
			Assert.fail("Test Failed"+e.getMessage());
		}
		finally
		{
			logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	

	

}
