package testingSalseForceApp;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {

	static WebDriver driver=null;
public static void getDriverInstance(String BrowserName) {
	switch(BrowserName) {
	case "chrome":  WebDriverManager.chromedriver().setup();
	                driver=new ChromeDriver();
	                driver.manage().window().maximize();
	                break;
	case "firefox":   WebDriverManager.firefoxdriver().setup();
    driver=new FirefoxDriver();
    driver.manage().window().maximize();
    break;              
	  default: System.out.println("please enter the correct Browser");              }
}
public static void correctlogin() {
	
	getDriverInstance("chrome");
	driver.get("https://login.salesforce.com/");
		//Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("hi@tekarch.com");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("Tryhard2work");
	By ob1=By.id("Login");
	WebElement login=driver.findElement(ob1);
	login.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


}

}
	


