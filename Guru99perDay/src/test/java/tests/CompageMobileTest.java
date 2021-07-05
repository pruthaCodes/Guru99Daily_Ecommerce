package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CompareTwoMobiles;


public class CompageMobileTest extends BaseClass{

public static CompareTwoMobiles comparePgObj=new CompareTwoMobiles();


	@Test(priority=1)
	public void clickOnMobile() {
		comparePgObj.mobileBtn();
		System.out.println("click on mobile Btn");
	}
	
	@Test(priority=2)
	public void clickOnCompare() {
		comparePgObj.sonyBtnclick();
		comparePgObj.iphoneBtnclick();
		System.out.println("click on compare Btns");
	}
	
	@Test(priority=3)
	public void validityPopup() {
		comparePgObj.clickCompareBtn();
		System.out.println("here");
		String textOnPopup=comparePgObj.checkText();  //actual text
		System.out.println(textOnPopup);
		String expectedTextonPopup=prop.getProperty("givenText");
		System.out.println(expectedTextonPopup);
		Assert.assertEquals(textOnPopup, expectedTextonPopup);
		System.out.println("checked text on popup");
	}
	
	@Test(priority=4)
	public void validityMobileNames() {
		String comparemobileName1=comparePgObj.mobileName1();
		String expMobileName1=prop.getProperty("name1");
		String comparemobileName2=comparePgObj.mobileName2();
		String expMobileName2=prop.getProperty("name2");
		
		//System.out.println("comparemobileName1: "+comparemobileName1);
		//System.out.println("comparemobileName2: "+comparemobileName2);
		
		//match name 1
		if(comparemobileName1.equalsIgnoreCase(expMobileName1)) {
			System.out.println("Name 1 is matching");
		}
		else {
			System.out.println("Name 1 is Not matching");
		}
		
		//match name 2
		if(comparemobileName2.equalsIgnoreCase(expMobileName2)) {
			System.out.println("Name 2 is matching");
		}
		else {
			System.out.println("Name 2 is Not matching");
		}
	}
	
	@Test(priority=5)
	public void clickClose() {
		
		comparePgObj.closePopup();
		System.out.println("close popUp");
	}
}
