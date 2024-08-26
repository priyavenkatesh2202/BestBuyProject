package test;

import org.testng.annotations.Test;

import base.ProjectSpecif;
import page.BLinkVerify;
import page.HomePage;

public class BLinkTC_002 extends ProjectSpecif {
@Test
	public  void linkVerifyInvalid() throws Exception
	{
		HomePage ob= new HomePage(driver);
		BLinkVerify obj = new BLinkVerify(driver);
		ob.SelectCountry();
		
		obj.cliAcces();
		obj.cliSensit();
		obj.health().invalidsupplyChain().browserClose();

	} 
}
