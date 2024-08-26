package test;

import org.testng.annotations.Test;

import base.ProjectSpecif;
import page.HomePage;
import page.MenuVerify;
import page.SignInPage;

public class VerifyMenuTC_001 extends ProjectSpecif{
@Test
	public  void verifyTC() throws Exception {
		HomePage ob = new HomePage(driver);
		
		MenuVerify obj= new MenuVerify(driver);
		ob.SelectCountry();
		obj.clickSchool().clickColg().clickTopDeal().clickDeal().clickBestBuy();
		obj.clickMore().clickGiftCard().browserClose();
		
		
	
	}

}
