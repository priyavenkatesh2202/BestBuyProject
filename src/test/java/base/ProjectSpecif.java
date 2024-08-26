package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.UtilityCls;

public class ProjectSpecif extends UtilityCls
{

	
	@Parameters({"Url","browser"})
	@BeforeMethod
	public void launchingBrowser(String Url , String browser)
	{
		browserLaunch(Url,browser);
	}
	

	public void closingBrowser()
	{
		browserClose();
	}
	
	
}
