package test;

import org.testng.annotations.Test;

import base.ProjectSpecif;
import page.HomePage;
import page.MenuVerify;

public class VerifyMenuTC_002 extends ProjectSpecif{
@Test
	public  void verifyTCInvalid() throws Exception {
		HomePage ob = new HomePage(driver);
		
		MenuVerify obj= new MenuVerify(driver);
		ob.SelectCountry();
		obj.clickSchool().clickColg().invalidclickTopDeal().clickDeal().clickBestBuy();
		obj.clickMore().clickGiftCard().browserClose();
		
		
	
	}

}
