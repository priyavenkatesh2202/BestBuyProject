package page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecif;

public class SignInPage extends ProjectSpecif
{
	
	public static WebDriver driver;
		
	
 @FindBy(xpath="//a[text()='Sign In']")
 WebElement SignIn;
 
 @FindBy(id="fld-e")
 WebElement Email;

 @FindBy(id="fld-p1")
 WebElement pwd; 
 
 @FindBy(xpath="//button[text()='Sign In']")
 WebElement clickSignIn;
 
 @FindBy(xpath="//div[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none']")
WebElement verifytext; 
 
 
 @FindBy(xpath="//p[text()='Please enter a valid email address.']") WebElement verifyInvalid;
 
 	public  SignInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 	
 	public SignInPage clickSign()
 	{
 		SignIn.click();
 		return this;
 	}
 	public SignInPage email (String mail)
 	{
 		Email.sendKeys(mail);
 		return this;
 	}
 	public SignInPage pas(String Pass)
 	{
 		pwd.sendKeys(Pass);
 		return this;
 	}
 	
 	public SignInPage cicSign()
    { 
    	clickSignIn.click();
		return this;
	}
 	public SignInPage verify()throws Exception
    { 
 		String actualText = "Sorry, something went wrong. Please try again.";
		String expectedText = verifytext.getText();
		screenShot("ValidateSignUp");
		soft_assert(actualText, expectedText);
 		
 		
 		
		
 		return this;
	}
 	public SignInPage verifyinvalidmail()throws Exception
    { 
      
 		String actualText = "Sorry, something went wrong. Please try again.";
		String expectedText = verifyInvalid.getText();
		screenShot("InValidateSignUp");
		soft_assert(actualText, expectedText);
 		
 		
 		
		
 		return this;
	}

	
 	
 
}
