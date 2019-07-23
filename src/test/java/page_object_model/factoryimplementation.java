package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class factoryimplementation {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\Browser and Drivers\\chromedriver_win32\\chromedriver.exe");  
		  WebDriver  driver=new ChromeDriver();
		  String url="http://demowebshop.tricentis.com/login";
		  driver.get(url);
		  driver.manage().window().maximize();
		  pageclasswithfactory locateElements=PageFactory.initElements(driver, pageclasswithfactory.class);
		  locateElements.loginMethod("rubiaragavan@gmail.com","jesusRuby98$");
	}

}
