package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest  extends BaseClass{
	
	@Test(groups = {"sanity","master"})
	public void verify_login()
	
	{
		try {
			
		logger.info("*******Started TC002_LoginTest******");
		logger.debug("Capturing application debug logs.....");
		
		//Homepage
		HomePage hp = new HomePage(driver);
		hp.clickAccount();
		logger.info("clicked on myaccount link on the home page..");
		hp.clickLogin(); //Login link under MyAccount
		logger.info("clicked on login link under myaccount..");
		
		
		//LoginPage
		LoginPage lp = new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();//clicked to login button
		logger.info("clicked on ligin button..");
		
		//My Account page
		MyAccountPage myacc = new MyAccountPage(driver);
		boolean target = myacc.isMyAccountPageExists();
		Assert.assertEquals(target, true, "Login Failed");
	}
		catch(Exception e)
		{
			Assert.fail();
		}
		finally
		{
			logger.info("**** Finished TC_002_LoginTest  ****");
		}
		
		
		
	}
	
	
	
	
	
	
	

}
