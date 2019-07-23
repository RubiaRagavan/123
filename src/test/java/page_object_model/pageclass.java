package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclass {
WebDriver driver=null;
By log=By.linkText("Log in");
By un=By.id("Email");
By pwd=By.id("Password");
By btn=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
public pageclass(WebDriver driver) {
this.driver=driver;
}
public void clicklink()
{
	driver.findElement(log).click();
}
public void typeuname(String username) {
	driver.findElement(un).sendKeys(username);
}
public void typepwd(String password) {
	driver.findElement(pwd).sendKeys(password);	
}
public void clicklogin() {
	driver.findElement(btn).click();
}
}
