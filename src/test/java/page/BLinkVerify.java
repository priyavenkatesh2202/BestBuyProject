package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecif;

public class BLinkVerify extends ProjectSpecif{
	public static WebDriver driver;
	
	
	
	@FindBy(xpath="//a[normalize-space()='Accessibility']") WebElement clickAcess;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[8]")WebElement sensitive;
	
	@FindBy(xpath="//a[text()='Privacy']")WebElement privacy;
	
	@FindBy(xpath="//a[normalize-space()='CA Supply Chain Transparency Act']")WebElement supply;
	
	

	public  BLinkVerify (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public BLinkVerify cliAcces() 
	{
	clickAcess.click();
	String actualTxt=driver.getTitle();
	String expectedTxt="Accessibility - Best Buy";
	soft_assert(actualTxt, expectedTxt);
	return this;
	}
	
	public BLinkVerify cliSensit() 
	{
	sensitive.click();
	String actualTxt=driver.getTitle();
	String expectedTxt="Best Buy";
	soft_assert(actualTxt, expectedTxt);
	
	return this;
	}
	
	public BLinkVerify health() 
	{
	privacy.click();
	String actualTxt=driver.getTitle();
	String expectedTxt="Privacy Policy Hub - Best Buy";
	soft_assert(actualTxt, expectedTxt);
	
	
	return this;
	}
	
	public BLinkVerify supplyChain() throws Exception 
	{
	supply.click();
	String actualTxt=driver.getTitle();
	String expectedTxt="California Supply Chain Transparency Act - Best Buy";
	screenShot("ValidBottomLinkVerify");
	soft_assert(actualTxt, expectedTxt);
	return this;
	}
	
	public BLinkVerify invalidsupplyChain() throws Exception 
	{
	supply.click();
	String actualTxt=driver.getTitle();
	String expectedTxt="California SupplyChain Transparency ActBest Buy";
	screenShot("invalidBottomLinkVerify");
	soft_assert(actualTxt, expectedTxt);
	return this;
	}
	
	
	

}
