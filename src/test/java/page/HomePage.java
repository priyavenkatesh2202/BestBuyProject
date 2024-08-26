package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecif;

public class HomePage extends ProjectSpecif{
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//a[@class='us-link'])[1]")
	WebElement selectUSA;
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement clickAc;
	
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement createAc;

	
	
	

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage SelectCountry() 
	{
		selectUSA.click();
		return this;
		
	}
	
	public HomePage clickAcc() 
	{
		clickAc.click();
		return this;
	}
	public HomePage createAc()
	{
		createAc.click();
		return this;
	}
}

	
		
	



