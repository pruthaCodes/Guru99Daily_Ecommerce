package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class SonyXperiaPage extends BaseClass{

	
public void mobileBtn() {
		WebElement MobileBtn=driver.findElement(By.xpath(prop.getProperty("mobile")));
		MobileBtn.click();
 }	
	
	
public String titleOfSonyPage() {
		
		WebElement sonyMobile= driver.findElement(By.xpath(prop.getProperty("sonyMobile")));
		sonyMobile.click();
		String titleOfSonyXperia=driver.getTitle();
		return titleOfSonyXperia;
		}
	

  public void inputQuantity() {
	
	 WebElement quantityBox=driver.findElement(By.xpath(prop.getProperty("quantitybox" )));
	 quantityBox.sendKeys(prop.getProperty("noOfQuantity"));
	 
 }
	
  public void cartBtn() {
	WebElement addtoCartBtn=driver.findElement(By.xpath(prop.getProperty("AddtoCartBtn")));
	addtoCartBtn.click();
  }
	
	public String errorMSG() {
		WebElement errorMsg=driver.findElement(By.xpath(prop.getProperty("errorMsg")));
		return errorMsg.getText();
		
	}
	
	public String cartClick() {
		WebElement cartBtn=driver.findElement(By.xpath(prop.getProperty("cartBtn")));
		cartBtn.click();
		WebElement cartMsg=driver.findElement(By.xpath(prop.getProperty("cartMsg")));
		
		return cartMsg.getText();
	}
	
	
	
	
}
