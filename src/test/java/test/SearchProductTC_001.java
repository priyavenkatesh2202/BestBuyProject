package test;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.ProjectSpecif;
import page.HomePage;

import page.SearchItem;
import page.SelectBrand;

public class SearchProductTC_001  extends ProjectSpecif{

	@Test
	public  void SearchProduct()throws Exception
	
	{
		HomePage ob = new HomePage(driver);
		SearchItem obj = new SearchItem(driver);
		SelectBrand obj1 = new SelectBrand(driver);
	
		
		ob.SelectCountry();
		obj.clickMenu();
		obj.appliance().smallAppli().blender().selProduct()
		
		.addcart().ContiShopping();

		
			
		
		obj1.clickMenu().clicBrand().clicapple().clickmac().clickminimac().clickaddCart().clickGoto();
	//	obj1.closealert();
		
		obj1.clickcheckot().contiGuest()
		.entermail("abc@gmail.com").enterPh("9566700270")
		.clickCheckBox().contiPayment().verifyText().browserClose();

	}

}
