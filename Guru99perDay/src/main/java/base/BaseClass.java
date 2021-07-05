package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop=new Properties();
	
	
	
	public static void readConfigFile() {
		 
		 String path_config= "P:\\Testing IT\\Project\\Guru99perDay\\src\\main\\java\\base\\config.properties";
		 try {
			
			 FileInputStream fs =new FileInputStream(path_config);
		     prop.load(fs);
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@BeforeTest
	public static void launchSite() {
		
		try {
			String chromePath="P:\\Testing IT\\Google chrome\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver=new ChromeDriver();
		}
		catch(Exception e) {
			System.out.println("Path not found for Browser");
			
		}
		 readConfigFile();
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	 
	}
	
	
	@AfterTest
	public static void tearDown() {
		driver.quit();
	}
	
}
