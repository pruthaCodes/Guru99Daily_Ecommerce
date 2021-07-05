package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomePageTest extends BaseClass{
public static HomePage homePgObj=new HomePage();


	
	
	@Test(priority=1)
	public void homeTitle() {
		String titleHomePage=homePgObj.getTitle();
		String expectedtitleHome=prop.getProperty("HomeTitle");
		Assert.assertEquals(titleHomePage, expectedtitleHome);
		System.out.println("Home Page is successfull");
	}

	
	
}	
	