package demowebshopPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactoryPOM {

	WebDriver driver;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginBtn;
	
	public LoginPageFactoryPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void inputemail(String mail) {
		email.sendKeys(mail);
	}
	public void inputpassword(String pw) {
		password.sendKeys(pw);
	}
	public void clicklogin() {
		loginBtn.click();
	}
}
