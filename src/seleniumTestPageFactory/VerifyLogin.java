package seleniumTestPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import demowebshopPageFactory.LoginPageFactoryPOM;

public class VerifyLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPageFactoryPOM loginpage=PageFactory.initElements(driver, LoginPageFactoryPOM.class);
		
		loginpage.inputemail("deekshitha.teegala850@gmail.com");
		loginpage.inputpassword("deekshitha@123");
		loginpage.clicklogin();
	}

}
