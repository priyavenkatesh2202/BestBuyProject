package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecif;


public class SearchItem extends ProjectSpecif {
	public static WebDriver driver;

	
	
	@FindBy(xpath="//button[@aria-label='Menu']")WebElement menu;
	
	@FindBy(xpath="//button[normalize-space()='Appliances']") WebElement Appliance;
	
	@FindBy(xpath="//button[@data-id='node-115']") WebElement smallAppliance;
	
	@FindBy(xpath="//a[text()='Blenders & Juicers']") WebElement blenderJuicer;
	
	@FindBy(xpath="(//a[text()='Ninja - Mega Kitchen System 72-Oz. Blender - Black'])[1]") WebElement Product;
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART']") WebElement addCart;
	
	
	//button[@class='c-button-link continue-shopping']
	@FindBy(xpath="//button[@class='c-button-link continue-shopping']") WebElement ContinueShoping;
	@FindBy(xpath="//a[text()='Go to Cart']") WebElement goToCart;
	
	@FindBy(xpath="//button[normalize-space()='Find a Store']")WebElement findStore;
	
	@FindBy(id="sam-input") WebElement pinCode; // 96732
	
	@FindBy(xpath="//button[text()='Go!']") WebElement Go;
	
	@FindBy(xpath="//button[text()='Pick up here']") WebElement pickUp;
	
	//@FindBy(xpath="(//button[text()='Add to Cart'])[1]")WebElement addCart;
	
	@FindBy(xpath="//button[normalize-space()='Checkout']")WebElement checkOut;
	
	@FindBy(xpath="//button[text()='Checkout']") WebElement checkOt;
	
	@FindBy(xpath="//button[normalize-space()='Continue as Guest']") WebElement contiGuest;
	
	@FindBy(id="user.emailAddress") WebElement enteremail;
	
	@FindBy(id="user.phone")WebElement enterPhNum;
	
	@FindBy (id="text-updates")WebElement checkBox;
	
	@FindBy(xpath="//span[text()='Continue to Payment Information']") WebElement ContiPayment;
	
	@FindBy(xpath="//span[text()='Request failed because of network connection']") WebElement text;
	//Blenders & Juicers
	public SearchItem(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public SearchItem clickMenu()
	{
		menu.click();
		return this;
	}
	public SearchItem appliance()
	{
		Appliance.click();
		return this;
	}
	
	public SearchItem smallAppli()
	{
		smallAppliance.click();
		return this;
	}
	public SearchItem blender()
	{
		blenderJuicer.click();
		return this;
	}
	public SearchItem selProduct()
	{
		Product.click();
		return this;
	}
	public SearchItem addcart()
	{
		addCart.click();
		return this;
	}

	public SelectBrand ContiShopping()
	{
	 ContinueShoping.click();
	 return new SelectBrand(driver);
	}
	
	
	
	public SearchItem goToCart()
	{
		goToCart.click();
		return this;
	}
	
	
	public SearchItem checkot()
	{
		checkOt.click();
		return this;
	}
	public SearchItem contiGuest()
	{
		contiGuest.click();
		return this;
	}
	
	public SearchItem entermail(String mail)
	{
		enteremail.sendKeys(mail);
		return this;
	}
	public SearchItem enterPh(String pH)
	{
		enterPhNum.sendKeys(pH);
		return this;
	}
	public SearchItem clickCheckBox()
	{
		checkBox.click();
		return this;
	}
	public SearchItem contiPayment()
	{
		ContiPayment.click();
		return this;
	}

	public SearchItem verifyText() throws Exception
	{
		
		
		String actualText="Request failed because of network connection";
		String expectedText=text.getText();
		screenShot("SearchedItem");
		soft_assert(actualText, expectedText);
		return this;
	}
	
}
