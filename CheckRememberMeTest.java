package testingSalseForceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckRememberMeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	checkRememberMe();
	//forgotPasswordA();
	//forgotpasswordB();
	//lead();
	
	}
	
	
	private static void forgotpasswordB() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("123");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("22131");
	WebElement login=driver.findElement(By.id("Login"));
	login.click();
	WebElement error=driver.findElement(By.id("error"));
	String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	String actual=error.getText();
	if (expected.equalsIgnoreCase(actual)) {
		System.out.println("Test case is pass");
		}else {
			System.out.println("Test case is fail");}


	
	}


	private static void forgotPasswordA() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);
		By ob=By.id("username");
		WebElement username=driver.findElement(ob);
	username.sendKeys("hi@tekarch.com");
	WebElement forgot =driver.findElement(By.id("forgot_password_link"));
	forgot.click();
	String expected="Forgot Your Password";
WebElement Title=driver.findElement(By.id("header"));
String actual=Title.getText();
if (expected.equalsIgnoreCase(actual)) {
	System.out.println("Test case is pass");
	}else {
		System.out.println("Test case is fail");}

	}


	private static void checkRememberMe() throws InterruptedException {
		// TODO Auto-generated method stub
	
 String expected="hi@tekarch.com";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);
		By ob=By.id("username");
		WebElement username=driver.findElement(ob);
	username.sendKeys("hi@tekarch.com");
			
	WebElement password=driver.findElement(By.id("password"));
password.sendKeys("Tryhard2work");
WebElement rememberme=driver.findElement(By.id("rememberUn"));
rememberme.click();
By ob1=By.id("Login");
WebElement login=driver.findElement(ob1);
login.click();
Thread.sleep(5000);
WebElement logout=driver.findElement(By.id("userNavLabel"));
logout.click();
WebElement logout1=driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]"));
logout1.click();
Thread.sleep(5000);
WebElement username1=driver.findElement(By.id("idcard-identity"));
String actual =username1.getText();
if (expected.equalsIgnoreCase(actual)) {
	System.out.println("Test case is pass");
	}else {
		System.out.println("Test case is fail");}
	}
	public static void lead() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);
		By ob=By.id("username");
		WebElement username=driver.findElement(ob);
	username.sendKeys("hi@tekarch.com");
			
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("Tryhard2work");
	By ob1=By.id("Login");
	WebElement login=driver.findElement(ob1);
	login.click();
	WebElement lead=driver.findElement(By.id("Lead_Tab"));
	lead.click();
	Thread.sleep(3000);
	WebElement close=driver.findElement(By.id("tryLexDialogX"));
	close.click();
	WebElement usermenu=driver.findElement(By.id("userNavLabel"));
	usermenu.click();
	WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
	logout.click();
	Thread.sleep(3000);
	String s= driver.getTitle();
	System.out.println(s);
	}
	

	
	
	}


