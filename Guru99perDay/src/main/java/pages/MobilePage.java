package pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;


public class MobilePage extends BaseClass{

	private WebElement MobileBtn;
	private WebElement dropDownBtn;
	private List<WebElement> allProducts;
	
	
 public void mobileBtn() {
		
		MobileBtn=driver.findElement(By.xpath(prop.getProperty("mobile")));
		MobileBtn.click();
 }

 public String mobileTitlePage() {
	 
	return driver.getTitle();
	  }
 
 
 public List<WebElement> allproductlist() {
	   return allProducts=driver.findElements(By.xpath(prop.getProperty("products")));
   }
 
 
 public int dropDown() {
	    dropDownBtn =driver.findElement(By.xpath(prop.getProperty("dropdown")));
	    dropDownBtn.click();
		Select s=new Select(dropDownBtn);
		s.selectByVisibleText("Name");
		allproductlist();
		int noOfProduct=allProducts.size();
		return noOfProduct;
		
     }
	
	public String sonyMobile() {
		WebElement priceElement=driver.findElement(By.xpath(prop.getProperty("priceOnMobilePage")));
		String price=priceElement.getText();
		return price;
	}
	
	
	public String titleOfSonyPage() {
		
		WebElement sonyMobile= driver.findElement(By.xpath(prop.getProperty("sonyMobile")));
		sonyMobile.click();
		String titleOfSonyXperia=driver.getTitle();
		
		
		return titleOfSonyXperia;
		}

	public String priceOnSonyPage() {
		WebElement priceOnSonyPage=driver.findElement(By.xpath(prop.getProperty("priceOnSonyPage")));
		String price=priceOnSonyPage.getText();
		return price;
		
	}
 }	
		
	
		
		
 
