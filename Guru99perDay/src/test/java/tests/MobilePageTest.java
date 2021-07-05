package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import junit.framework.Assert;
import pages.MobilePage;

public class MobilePageTest extends BaseClass{
 
	 public static MobilePage mobilepageObj=new MobilePage();
	 public String priceOfSony;
	 public String modifiedPrice;
	
	 @Test(priority=1)
	 public void clickOnMobile() {
		    mobilepageObj.mobileBtn();
		    String actualTitle= mobilepageObj.mobileTitlePage();
			String expectedTitle=prop.getProperty("mobiletitle");
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("mobile title is successfull");
		}
	
	 @Test(priority=2)
	public void clickDropDown() {
		
		int numOfproducts=mobilepageObj.dropDown();
		
		ArrayList<String> givenList=new ArrayList<String>();
		List<WebElement> allproducts=mobilepageObj.allproductlist();
		
		
		for(int i=0;i<numOfproducts;i++) {
			WebElement singleProduct=allproducts.get(i);
			String productName=singleProduct.getText();
			System.out.println("Name of products on page=  "+productName);
			givenList.add(i, productName);
		}
		
		ArrayList<String> sortedList=new ArrayList<String>(givenList);
	    Collections.sort(givenList);
	    
		Assert.assertEquals(sortedList, givenList);
		
		System.out.println("mobile products is successfull");
	}
	 
	 public String priceActual() {
		 //on Mobile page
		 String price=mobilepageObj.sonyMobile();
		 priceOfSony=price.replace("$"," ");
		 return priceOfSony;
		 }
	 
	 public void titleSonyPage() {
		 String titleOfSonyPage=mobilepageObj.titleOfSonyPage();
		 Boolean statusOfTitle=titleOfSonyPage.contains("Sony Xperia");
		 Assert.assertTrue(statusOfTitle);
		 }
	 
	 public String priceExpected() {
		 String sonyprice=mobilepageObj.priceOnSonyPage();
		 modifiedPrice=sonyprice.replace("$"," ");
		 return modifiedPrice;
		 }
	 
	 @Test(priority=3)
	 public void checkbothPrice() {
		 priceActual();
		 titleSonyPage();
		 priceExpected();
		 Assert.assertEquals(modifiedPrice, priceOfSony);
		 System.out.println("Both price method done");
	 }
	 
}

