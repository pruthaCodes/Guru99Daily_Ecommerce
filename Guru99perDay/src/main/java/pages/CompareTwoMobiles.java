package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;


public class CompareTwoMobiles extends BaseClass{

	private WebElement mobileBtn;
	private WebElement compareSonyBtn;
	private WebElement compareIphoneBtn;
	private WebElement compareBtn;
	public  WebElement TextOnPopUp;
	public WebElement mobileName1;
	public WebElement mobileName2;
	public WebElement closePopup;
	
	
	//click on mobile
public void mobileBtn() {
		
		mobileBtn=driver.findElement(By.xpath(prop.getProperty("mobile")));
		mobileBtn.click();
 }
	
public void sonyBtnclick() {
	compareSonyBtn=driver.findElement(By.xpath(prop.getProperty("CompareSonyBtn")));
	compareSonyBtn.click();
}

public void iphoneBtnclick() {
	compareIphoneBtn=driver.findElement(By.xpath(prop.getProperty("CompareiPhoneBtn")));
	compareIphoneBtn.click();
} 
 
public void clickCompareBtn() {
	compareBtn=driver.findElement(By.xpath(prop.getProperty("compareBtn")));
	compareBtn.click();
}

public String checkText() {
	Set<String> allhandles=driver.getWindowHandles();
	
	Iterator<String> it=allhandles.iterator();
	
	String main=it.next();
	String child=it.next();
	
	driver.switchTo().window(child);
	
	
	TextOnPopUp=driver.findElement(By.xpath(prop.getProperty("textonPopUp")));
	String textPopup=TextOnPopUp.getText();
	return textPopup;
}

public String mobileName1() {
	mobileName1=driver.findElement(By.xpath(prop.getProperty("mobileName1")));
	String givenName1=mobileName1.getText();
	return givenName1;
	}
	
	
public String mobileName2() {	
	mobileName2=driver.findElement(By.xpath(prop.getProperty("mobileName2")));
	String givenName2=mobileName2.getText();
	return givenName2;
	
}

public void closePopup() {
	closePopup=driver.findElement(By.xpath(prop.getProperty("closePopup")));
	closePopup.click();
}
		
}

