package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import demoshop.LoginPOM;

public class CheckLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPOM login=new LoginPOM(driver);
	    login.enteremail("deekshitha.teegala850@gmail.com");
	    login.enterpassword("deekshitha@123");
	    login.clicklogin();
	}

}
