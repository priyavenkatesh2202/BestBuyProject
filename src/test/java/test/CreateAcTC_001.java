package test;

import org.testng.annotations.Test;

import base.ProjectSpecif;
import page.CAccountPage;
import page.HomePage;

public class CreateAcTC_001 extends ProjectSpecif {
@Test
	public void CreateAc() throws Exception
	{
		// TODO Auto-generated method stub
	
	HomePage ob = new HomePage(driver);
	CAccountPage obj = new CAccountPage(driver);
	ob.SelectCountry();
	ob.clickAcc();
	ob.createAc();
	obj.enterFirstN("Liza");
	obj.enterLastN("Ken");
	obj.enterEmail("Priyavenkatesh2202@gmail.com");
	obj.enterPaswrd("Priya@143");
	obj.enterCPaswrd("Priya@143").phNum("9566700270").CicCreateAC().verifyT().browserClose();

	}

}
