package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement fstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lstName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_Email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txt_telPhone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement passWord;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement cnfpassWord;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkButton;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueBttn;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	
	
	public void SetFirstName(String fname)
	{
		fstName.sendKeys(fname);
		
	}
	
	public void SetLastName(String lname)
	{
		lstName.sendKeys(lname);
		
	}
	
	public void SetEmail(String email)
	{
		txt_Email.sendKeys(email);
	}
	
	
	public void SetPhone(String phone)
	{
		txt_telPhone.sendKeys(phone);
	}
	
	public void SetPassword(String psswd)
	{
		passWord.sendKeys(psswd);
	}
	
	public void SetConfirmPasswd(String cnfpaswd)
	{
		cnfpassWord.sendKeys(cnfpaswd);
	}
	
	public void SetPrivatePolicy()
	{
		chkButton.click();
		
	}
	
	public void SetContinue()
	{
		continueBttn.click();
	}
	
	public String getMessageConfirmation()
	{
		try {
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
}
