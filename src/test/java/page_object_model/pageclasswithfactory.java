package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageclasswithfactory {
WebDriver driver;
@FindBy(linkText="Log in") WebElement login;
@FindBy(how=How.ID,using="Email") WebElement email;
@FindBy(how=How.NAME,using="Password") WebElement pwd;
@FindBy(how=How.XPATH,using="//input[@value='Log in']") WebElement log;
public pageclasswithfactory(WebDriver driver) 
{
this.driver=driver;	
}
public void loginMethod(String username,String password) {
	login.click();
	email.sendKeys(username);
pwd.sendKeys(password);
log.click();
}

}