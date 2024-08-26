package page;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecif;

public class MenuVerify extends ProjectSpecif
{
	public static WebDriver driver;
	
	@FindBy(xpath="//span[text()='Back to School']") WebElement clickB2School;
	
	@FindBy(xpath="//a[text()='College Shop']") WebElement college;
	
	@FindBy(xpath="//h1[text()='Back to School Student Hub']") WebElement ColgText;
	
	@FindBy(xpath="//a[text()='Top Deals']")WebElement topDeal;
	
	@FindBy(xpath="//h2[text()='Top Deals']")WebElement TopDealTxt;
	
	@FindBy(xpath="//a[text()='Deal of the Day']") WebElement deal;
	
	@FindBy(xpath="//h2[text()='Bonus Deals of the Day']") WebElement dealTxt;
	
	@FindBy(xpath="(//a[text()='Yes, Best Buy Sells That'])[1]") WebElement bestBuySell;
	
	
	@FindBy(xpath="//h2[text()='Explore featured products']")WebElement bestBuytxt;
	
	@FindBy(xpath="//span[text()='More']")WebElement clickMore;
	//(//a[@class='utility-menu-flyout-list-item'])[1]
	//(//a[text()='Gift Cards'])[2]
	@FindBy(xpath="(//a[text()='Gift Cards'])[2]")WebElement giftCard;
	
	@FindBy(xpath="//h1[text()='Best Buy Gift Cards']")WebElement gifttxt;
	
//	@FindBy(xpath="//span[text()='Recently Viewed']") WebElement recent;

//	@FindBy(xpath="//span[text()='Order Status']") WebElement orderStatus;
	
//	@FindBy(xpath="//span[text()='Saved Items']")WebElement savedItem;
	
	
	
	public MenuVerify(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public MenuVerify clickSchool()
	{
		clickB2School.click();
		return this;
		 
	}
	
	public MenuVerify clickColg()
	{
		college.click();
		String actualText = "Back to School Student Hub";
		String expectedText = ColgText.getText();
		soft_assert(actualText, expectedText);
		return this;
	}
	
	public MenuVerify clickTopDeal()
	{
	
			
		topDeal.click();
		String actualText = "Top Deals";
		String expectedText = TopDealTxt.getText();
		soft_assert(actualText, expectedText);
		return this;
		
	}
	
	public MenuVerify invalidclickTopDeal() throws Exception
	{
	
			
		topDeal.click();
		String actualText = "Top Deals";
		String expectedText = TopDealTxt.getText();
		screenShot("InvalidtextfromMenu");
		soft_assert(actualText, expectedText);
		return this;
		
	}
	
	
	public MenuVerify clickDeal()
	{
		deal.click();
		String actualText = "Bonus Deals of the Day";
		String expectedText = dealTxt.getText();
		soft_assert(actualText, expectedText);
		
		return this;
		
	}
	public MenuVerify clickBestBuy()
	{
	
			
		bestBuySell.click();
		String actualText = "Explore featured products";
		String expectedText = bestBuytxt.getText();
		soft_assert(actualText, expectedText);
		return this;
	}
	
	public MenuVerify clickMore()
	{
		clickMore.click();
		return this;
	}
	
	public MenuVerify clickGiftCard() throws Exception
	{
	
			
		giftCard.click();
		String actualText = "Best Buy Gift Cards";
		String expectedText = gifttxt.getText();
		screenShot("validTextfromMenu");
		soft_assert(actualText, expectedText);
		
		return this;
	}
	
	
	
	

	

	

}
