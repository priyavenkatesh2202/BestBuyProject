package test;

import org.testng.annotations.Test;

import base.ProjectSpecif;
import page.CAccountPage;
import page.HomePage;

public class CreateAcTC_002  extends ProjectSpecif {
@Test
	public void CreateAcInvalid() throws Exception
	{
		// TODO Auto-generated method stub
	
	HomePage ob = new HomePage(driver);
	CAccountPage obj = new CAccountPage(driver);
	ob.SelectCountry();
	ob.clickAcc();
	ob.createAc();
	obj.enterFirstN("Liza");
	obj.enterLastN("Ken");
	obj.enterEmail("abc2202@gmail.com");
	obj.enterPaswrd("abc@143");
	obj.enterCPaswrd("@143").phNum("9566770").CicCreateAC().verifyinvalidPhNum().browserClose();

	} 

}
