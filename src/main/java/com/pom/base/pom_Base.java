package com.pom.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pom_Base {

	public static WebDriver driver;
	public static Properties prop;
	
	public pom_Base() {
		try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\anwar.kamal\\eclipse-workspace\\upwork_assignment\\src\\main\\java\\com\\pom\\config\\config.properties"); // Izza here you have to provide config.property path in your system
			prop.load(ip);
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void browser_lo(){
		String browserName =prop.getProperty("project_browser");
		
		if(browserName.equals("chrome")){
		//	System.setProperty("webdriver.chrome.driver","D://Automation//chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\anwar.kamal\\Anwar_Eclipse_workspace\\chromedriver.exe");  // FOR OFFICE SYSTEM
		//	driver = new ChromeDriver()
			
			
			/******************************************************************************/
			ChromeOptions handlingSSL = new ChromeOptions();
			 WebDriverManager.chromedriver().setup();
			 //Using the accept insecure cert method with true as parameter to accept the untrusted certificate
			 handlingSSL.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(handlingSSL);
			
			/******************************************************************************/
			
			
		}
		/*
		else if(browserName.equals("FF")){
			
			System.setProperty("webdriver.gecko.driver","F://browserdriver//geckodriver.exe");
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\anwar.kamal\\Anwar_Eclipse_workspace\\chromedriver.exe");  // FOR OFFICE SYSTEM
			driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("You have not set the Browser in the COnfig.Properties file:");
			}
	*/
		//driver.manage().window().maximize();
	driver.get(prop.getProperty("base_url"));
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	Timeouts wait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}