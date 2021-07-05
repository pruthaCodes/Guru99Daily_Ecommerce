package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import junit.framework.Assert;
import pages.SonyXperiaPage;

public class SonyExperiaTest extends BaseClass{
 public static SonyXperiaPage sonyPageObj=new SonyXperiaPage();
	
    @Test(priority=1)
	public void onSonyPage() {
    	//click on Sony mobile and go to Sony page
    	sonyPageObj.mobileBtn();
    	System.out.println("here");
		String actualTitlepg=sonyPageObj.titleOfSonyPage();
		String expTitlepg=prop.getProperty("sonyPageTitle");
		Assert.assertEquals(expTitlepg, actualTitlepg);
		System.out.println("SucessFUlly get title of Sony Experia Page");
		
	}
    
    @Test(priority=2)
    public void captureMsg() {
    	sonyPageObj.inputQuantity();
    	sonyPageObj.cartBtn();
    	String errorMsg=sonyPageObj.errorMSG();
    	System.out.println(errorMsg);
    	String cartMessage= sonyPageObj.cartClick();
    	System.out.println(cartMessage);
    	System.out.println("Day 3 work has been done");
    	
    }
    
    
}
