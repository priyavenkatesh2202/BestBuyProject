package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecif;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class CAccountPage extends ProjectSpecif 

{
public static WebDriver driver;
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="fld-p1")
	WebElement password;
	
	@FindBy(id="reenterPassword")
	WebElement rPassword;
	
	@FindBy(id="phone")
	WebElement phNumber;
	
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement cickCreateAc;

	//strong[text()='Sorry, there was a problem creating your account.']
	//strong[text()='An account with this email already exists.']
	@FindBy(xpath="//span[text()='Your passwords match!']")WebElement AcTxt;
	
	
	@FindBy(xpath="//p[text()='Please enter a valid mobile phone number.']") WebElement invalidPhNum;
	public CAccountPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public CAccountPage enterFirstN(String Nam)
	{
		firstName.sendKeys(Nam);
		return this;
	}
	public CAccountPage enterLastN(String Name)
	{
		lastName.sendKeys(Name);
		return this;
	}
	public CAccountPage enterEmail(String mail)
	{
		Email.sendKeys(mail);
		return this;
	}
	public CAccountPage enterPaswrd(String pswrd)
	{
		password.sendKeys(pswrd);
		return this;
	}
	public CAccountPage enterCPaswrd(String paswrd)
	{
		rPassword.sendKeys(paswrd);
		return this;
	}
	public CAccountPage phNum(String Ph)
	{
		phNumber.sendKeys(Ph);
		return this;
	}
	public CAccountPage CicCreateAC()
	{
		cickCreateAc.click();
		return this;
	}
	
	
	
	public CAccountPage verifyT() throws Exception
	{
		String actualText="Your passwords match!";
		String expectedText=AcTxt.getText();
		screenShot("validAcCreation");
		soft_assert(actualText, expectedText);
		return this;
	}
	
	
	
	
	public CAccountPage verifyinvalidPhNum() throws Exception
	{
		String actualText="An account with this email already exists.";
		String expectedText=invalidPhNum.getText();
		screenShot("invalidAcCreation");
		soft_assert(actualText, expectedText);
		return this;
	}
}
