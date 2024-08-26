package page;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecif;

public class SelectBrand extends ProjectSpecif 
{
public static WebDriver driver;

@FindBy(xpath="//button[@aria-label='Menu']")WebElement cliMenu;

@FindBy(xpath="//button[text()='Brands']") WebElement cBrand;

@FindBy(xpath="(//a[text()='Apple'])[1]") WebElement apple;

@FindBy(xpath="(//a[text()='Mac'])[1]") WebElement mac;

@FindBy(xpath="//a[text()='Mac mini']") WebElement macMini;



@FindBy(id="store-pickup-pickuptoday") WebElement clicklocationAvail;

//(//button[@data-button-state='ADD_TO_CART'])[1]
//(//button[@data-button-state='ADD_TO_CART'])[3]
//(//button[@data-sku-id='6427500'])[1]
//(//button[@data-button-state='ADD_TO_CART'])[1]
@FindBy(xpath="(//button[@data-button-state='ADD_TO_CART'])[1]") WebElement AdCart;

@FindBy(xpath="//a[text()='Go to Cart']") WebElement GoTo;

@FindBy(xpath="//button[@aria-label='Update location']") WebElement changezipcode;

@FindBy(id="location") WebElement enterLocation;

@FindBy(xpath="//button[text()='Update']") WebElement update;


@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']") WebElement closeAlert;
//button[text()='Checkout']
//button[@class='checkout-buttons__paypal btn v-medium']
@FindBy(xpath="//button[text()='Checkout']") WebElement Checkout;

@FindBy(xpath="//button[text()='Continue as Guest']") WebElement ContiGuest;

@FindBy(id="user.emailAddress")WebElement EnterMail;

@FindBy(id="user.phone") WebElement EnterNum;

@FindBy (id="text-updates")WebElement checkBox;

@FindBy(xpath="//span[text()='Continue to Payment Information']") WebElement ContiPayment;

@FindBy(xpath="//span[text()='Request failed because of network connection']") WebElement text;

@FindBy(xpath="//span[text()='Return to Cart']")WebElement returnToCart;

public SelectBrand (WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}

public SelectBrand clickMenu()
{
	
	
	cliMenu.click();
	return this;
}
public SelectBrand clicBrand()
{
	cBrand.click();
	return this;
}
public SelectBrand clicapple()
{
	apple.click();
	return this;
}

public SelectBrand clickmac()
{
	mac.click();
	return this;
}

public SelectBrand clickminimac()
{
	macMini.click();
	return this;
}
public SelectBrand clicklocationavi()
{
	clicklocationAvail.click();
	return this;
}



public SelectBrand clickaddCart()
{
	
	
//	JavascriptExecutor js =(JavascriptExecutor)driver;
//	js.executeScript("arguments(0).scrollIntoView(true);" ,AdCart);
//
//	Actions act = new Actions(driver);
//	act.moveToElement(AdCart).click().perform();
	AdCart.click();
	return this;
}
public SelectBrand clickzipcode()
{
	changezipcode.click();
	return this;
}


public SelectBrand enterpin(String zip)
{
	enterLocation.sendKeys(zip);
	return this;
}

public SelectBrand clickUpdate()
{
	update.click();
	return this;
}

public SelectBrand clickGoto()
{
	GoTo.click();
	return this;
}

public SelectBrand closealert()
{
	closeAlert.click();
	return this;
}

public SelectBrand clickcheckot()
{
	Checkout.click();
	return this;
}

public SelectBrand contiGuest()
{
	ContiGuest.click();
	return this;
}

public SelectBrand entermail(String mail)
{
	EnterMail.sendKeys(mail);
	return this;
}
public SelectBrand enterPh(String pH)
{
	EnterNum.sendKeys(pH);
	return this;
}
public SelectBrand clickCheckBox()
{
	checkBox.click();
	return this;
}
public SelectBrand contiPayment()
{
	ContiPayment.click();
	return this;
}


public SelectBrand verifyText() throws Exception
{
	
	
	String actualText="Request failed because of network connection";
	String expectedText=text.getText();
	
	soft_assert(actualText, expectedText);
	//screenShot("SearchedBrand");
	return this;
}


}
