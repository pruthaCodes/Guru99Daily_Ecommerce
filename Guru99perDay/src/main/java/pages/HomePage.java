package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass{

	   
	 public String getTitle() {
		 
		 String homePgTitle=driver.getTitle();
		 return homePgTitle;
		 
	 }

}
