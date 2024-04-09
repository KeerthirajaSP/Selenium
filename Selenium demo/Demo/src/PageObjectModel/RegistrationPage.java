package PageObjectModel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	WebDriver driver;
	By reglink =By.linkText("REGISTER");
	By FirstName =By.name("firstName");
	By LastName =By.name("lastName");
	By phone =By.name("phone");
	By email =By.name("userName");
	By adderss1 =By.name("address1");
	By city =By.name("city");
	By state =By.name("state");
	By postalCode =By.name("postalCode");
	By country =By.name("country");
	By username =By.name("email");
	By password =By.name("password");
	By confirmpassword =By.name("confirmPassword");
	By registrationBtn =By.name("submit");
	
	RegistrationPage(WebDriver d){
		//this.driver=driver;
		driver=d;
	}
	public void clickRegLink(){
		driver.findElement(reglink).click();
		
	}
	public void setFirstname(String fname){
		driver.findElement(FirstName).sendKeys(fname);
		
	}
	public void setLastname(String lname){
		driver.findElement(LastName).sendKeys(lname);
		
	}
	public void setPhone(String ph){
		driver.findElement(phone).sendKeys(ph);
		
	}
	public void setEmail(String mail){
		driver.findElement(email).sendKeys(mail);
		
	}
	public void setaddress1(String Address1){
		driver.findElement(adderss1).sendKeys(Address1);
		
	}
	
	public void setcity(String cty){
		driver.findElement(city).sendKeys(cty);
		
	}
	public void setstate(String st){
		driver.findElement(state).sendKeys(st);
		
	}
	public void setpostalcode(String pcode){
		driver.findElement(postalCode).sendKeys(pcode);
		
	}
	public void setCountry(String coun){
	
		WebElement cn=driver.findElement(country);
		Select drop=new Select(cn);
		drop.selectByVisibleText(coun);
	}
	public void setUserName(String uname){
		driver.findElement(username).sendKeys(uname);
		
	}
	public void setPassword(String pswd){
		driver.findElement(password).sendKeys(pswd);
		
	}
	public void setConfirmPassword(String cfmpswd){
		driver.findElement(confirmpassword).sendKeys(cfmpswd);
		
	}
	public void clickRegBtn(){
		driver.findElement(registrationBtn).click();
		
	}
	
}
