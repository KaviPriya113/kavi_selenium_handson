package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccRegistrationPage extends basePage {

	public AccRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
@FindBy(xpath="//*[@id=\"input-firstname\"]")
WebElement firstname;

public void setFirstName (String fname) {
	firstname.sendKeys(fname);	
}

@FindBy(xpath="//*[@id=\"input-lastname\"]")
WebElement lastname;

public void setLastName (String lname) {
	lastname.sendKeys(lname);	
}

@FindBy(xpath="//*[@id=\"input-email\"]")
WebElement email;

public void setEmailID (String emails) {
	email.sendKeys(emails);	
}

@FindBy(xpath="//*[@id=\"input-telephone\"]")
WebElement phonenumber;

public void setPhone (String phone) {
	phonenumber.sendKeys(phone);	
}

@FindBy(xpath="//*[@id=\"input-password\"]")
WebElement password;

public void setPassword (String pw) {
	password.sendKeys(pw);	
}

@FindBy(xpath="//*[@id=\"input-confirm\"]")
WebElement confirmpassword  ;

public void setConfirmPassword (String cpw) {
	confirmpassword.sendKeys(cpw);	
}

@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
WebElement checkboxpolicy;

public void setCheckboxPolicy () {
	checkboxpolicy.click();
}

@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
WebElement continuebutton;

public void clickContinueButton () {
	continuebutton.click();
}

@FindBy(xpath="//*[@id=\"content\"]/h1")
WebElement msgconfirmation;

public String getConfirmationMessage() {
	try {
		return (msgconfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());
	}
	
}



	
	

}
