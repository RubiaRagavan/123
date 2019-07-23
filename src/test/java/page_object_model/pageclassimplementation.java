package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageclassimplementation {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\Browser and Drivers\\chromedriver_win32\\chromedriver.exe");  
		  WebDriver  driver=new ChromeDriver();
		  pageclass pobject=new pageclass(driver);
		  String url="http://demowebshop.tricentis.com/login";
		  driver.get(url);
		  driver.manage().window().maximize();
		  pobject.clicklink();
		  String username="rubiaragavan@gmail.com";
		  pobject.typeuname(username);
		  String password="jesusRuby98$";
		  pobject.typepwd(password);
		  pobject.clicklogin();
		  System.out.println("Title of the page is"+driver.getTitle());
	}

}
