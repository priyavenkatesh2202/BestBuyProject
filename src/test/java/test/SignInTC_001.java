package test;

import org.testng.annotations.Test;

import base.ProjectSpecif;
import page.HomePage;
import page.SignInPage;

public class SignInTC_001 extends ProjectSpecif
{
@Test
				public void SignInT()throws Exception
{ 
				
				HomePage ob = new HomePage(driver);
				SignInPage obj = new SignInPage(driver);
				ob.SelectCountry();
				ob.clickAcc();
				obj.clickSign();
				obj.email("priyavenkatesh2202@gmail.com");
				obj.pas("Priya@123");
				obj.cicSign().verify().browserClose();
				
		}					

				}
		

	



