package testingSalseForceApp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseMethods{

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
			//missedpassword();
			//correctlogin1();
			//selectusermenuDropdown();
		//MyProfile();
		//createAccount();
		//createnewview();
		//mergeaccount();
		//accountReport();
		uploadphoto();
	//Developerconsole();
		//logout();
		//opportunitiesdropdown();
		//lead();
		//leadSelectView();
		//defaultview();
		//TodaysLead();
		//NewButton();
		//NewContact();
		//NewView();
		//CheckContact();
		//MyContact();
		//ViewaContact();
		//errorMessage();
		//cancelbutton();
		//CheckNewButon();
		//VerifyUserName();
		
	}
		
		private static void VerifyUserName() {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement home=driver.findElement(By.id("home_Tab"));
			home.click();
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement exp=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[1]/h1/a"));
			String actual=exp.getText();
			String expected="hi ram";

			if(expected.equals(actual)) {
				System.out.println("Test case is pass");
			}else {
				System.out.println("Test case is fail");
				driver.close();
			}}


	

		private static void CheckNewButon() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
			contact.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement new2=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
			new2.click();
			WebElement lastName=driver.findElement(By.id("name_lastcon2"));
			lastName.click();
			lastName.sendKeys("Indian");
			WebElement accName=driver.findElement(By.id("con4"));
			accName.click();
			accName.sendKeys("Global Media");
			WebElement saveandedit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[2]"));
			saveandedit.click();

	}

		private static void cancelbutton() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
			contact.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement newview=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]"));
newview.click();
WebElement viewname=driver.findElement(By.id("fname"));
viewname.click();
viewname.sendKeys("ABCDEFGH");
WebElement viewuniquename=driver.findElement(By.id("devname"));
viewuniquename.click();
viewuniquename.sendKeys("EFGH");
WebElement cancel=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[2]"));
cancel.click();
WebElement exp=driver.findElement(By.id("fcf"));
String actual=exp.getText();
String expected="ABCDEFGH";

if(!expected.equals(actual)) {
	System.out.println("Test case is pass");
}else {
	System.out.println("Test case is fail");}}

	

		private static void errorMessage() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
			contact.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement newview=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]"));
			newview.click();
			WebElement viewuniquename=driver.findElement(By.id("devname"));
			viewuniquename.click();
			viewuniquename.sendKeys("EFGH");
			viewuniquename.click();
			WebElement save=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]"));
			save.click();
			WebElement exp=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]"));
			String actual=exp.getText();
			String expected="Error: You must enter a value";
	
			if(expected.equals(actual)) {
				System.out.println("Test case is pass");
			}else {
				System.out.println("Test case is fail");}}

			
	

		/*correctlogin();
		WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
		contact.click();
		Thread.sleep(3000);
		WebElement close=driver.findElement(By.id("tryLexDialogX"));
		close.click();
		WebElement Recentcontact=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
		Recentcontact.click();
		WebElement exp=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2"));
		String actual=exp.getText();
		String expected="hello";
		if(expected.equals(actual)) {
			System.out.println("Test case is pass");
		}else {
			System.out.println("Test case is fail");*/



		
	
	
		


	

		private static void ViewaContact() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
			contact.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement Recentcontact=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
			Recentcontact.click();
			WebElement exp=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2"));
			String actual=exp.getText();
			String expected="hello";
			if(expected.equals(actual)) {
				System.out.println("Test case is pass");
			}else {
				System.out.println("Test case is fail");}}


			
	

		private static void MyContact() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
			contact.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement view=driver.findElement(By.id("fcf"));
			view.click();
			Select menu=new Select(view);
			menu.selectByIndex(4);
			WebElement go=driver.findElement(By.xpath("//input[@name='go']"));
			go.click();
			WebElement exp=driver.findElement(By.xpath("//div[@title='Phone']"));
			String actual=exp.getText();
			String expected="Phone";
			if(expected.equals(actual)) {
				System.out.println("Test case is pass");
			}else {
				System.out.println("Test case is fail");}}

			
	

		private static void CheckContact() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
			contact.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement RecentlyViewed=driver.findElement(By.id("hotlist_mode"));
			RecentlyViewed.click();
			Select menu=new Select(RecentlyViewed);
			menu.selectByIndex(0);
			Thread.sleep(3000);
			WebElement exp=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[1]/h3"));
			String actual=exp.getText();
			String expected="Recent Contacts";
			if(expected.equals(actual)) {
				System.out.println("Test case is pass");
			}else {
				System.out.println("Test case is fail");}}


			
	

		private static void NewView() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
			contact.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement newview=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]"));
newview.click();
WebElement viewname=driver.findElement(By.id("fname"));
viewname.click();
viewname.sendKeys("Good");
WebElement viewuniquename=driver.findElement(By.id("devname"));
viewuniquename.click();
viewuniquename.sendKeys("luck");
WebElement save=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]"));
save.click();
WebElement exp=driver.findElement(By.id("00BDn00000OZzvu_listSelect"));
String actual=exp.getText();
String expected="Good";
if(expected.equals(actual)) {
	System.out.println("Test case is pass");
}else {
	System.out.println("Test case is fail");}}


	

		private static void NewContact() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement contact=driver.findElement(By.xpath("//a[@title='Contacts Tab']"));
			contact.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement new2=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
			new2.click();
			WebElement lastname=driver.findElement(By.id("name_lastcon2"));
			lastname.click();
			lastname.sendKeys("hello");
			WebElement accountname=driver.findElement(By.id("con4"));
			accountname.click();
			accountname.sendKeys("devi");
			WebElement save=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
			save.click();
			WebElement exp=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2"));
			String actual=exp.getText();
			String expected="hello";
			if(expected.equals(actual)) {
				System.out.println("Test case is pass");
			}else {
				System.out.println("Test case is fail");}}

	

		private static void NewButton() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
WebElement lead=driver.findElement(By.id("Lead_Tab"));
lead.click();
Thread.sleep(3000);
WebElement close=driver.findElement(By.id("tryLexDialogX"));
close.click();
WebElement newbutton=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[1]/form/table/tbody/tr/td[2]/input"));
newbutton.click();
WebElement lastname=driver.findElement(By.id("name_lastlea2"));
lastname.click();
lastname.sendKeys("ABCD");
WebElement companyname=driver.findElement(By.id("lea3"));
companyname.click();
companyname.sendKeys("ABCD");
WebElement save=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
save.click();
WebElement exp=driver.findElement(By.xpath("//h2[@class='topName']"));
String actual=exp.getText();
String expected="ABCD";
if(expected.equals(actual)) {
	System.out.println("Test case is pass");
}else {
	System.out.println("Test case is fail");}}


	

		private static void TodaysLead() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement lead=driver.findElement(By.id("Lead_Tab"));
			lead.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement view=driver.findElement(By.id("fcf"));
			view.click();
			Select menu=new Select(view);
			menu.selectByIndex(3);
			String actual=view.getText();
			String expected="Today's Leads";
			if(expected.equals(actual)) {
				System.out.println("Test case is pass");
			}else {
				System.out.println("Test case is fail");}}

		
			
		
	

		private static void defaultview() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement lead=driver.findElement(By.id("Lead_Tab"));
			lead.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement view=driver.findElement(By.id("fcf"));
			view.click();
			Select menu=new Select(view);
			menu.selectByIndex(1);
			WebElement usermenu=driver.findElement(By.id("userNavLabel"));
			usermenu.click();
			WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
			logout.click();
			correctlogin();
			WebElement lead1=driver.findElement(By.id("Lead_Tab"));
			lead1.click();
			Thread.sleep(3000);
			WebElement close1=driver.findElement(By.id("tryLexDialogX"));
			close1.click();
			WebElement go=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/input"));
			go.click();
			String expected="Leads ~ Salesforce - Developer Edition\r\n";
			String actual=driver.getTitle();
			System.out.println(actual);
			if(expected.equals(actual)) {
				System.out.println("Test case is pass");
			}else {
				System.out.println("Test case is fail");}}
		
			

			
			
	

		private static void leadSelectView() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement lead=driver.findElement(By.id("Lead_Tab"));
			lead.click();
			Thread.sleep(3000);
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement view=driver.findElement(By.id("fcf"));
view.click();
Select menu=new Select(view);
List<WebElement>actual=menu.getOptions();
for(WebElement ele:actual) {
	String s="null";
	s=ele.getText();
	System.out.println(s);
}
String expeted[]= {"All Open Leads","My Unread Leads","Recently Viewed Leads","Today's Leads","View - Custom 1","View - Custom 2"};
for(int i=0; i<actual.size(); i++) {
	if(actual.get(i).getText().equals(expeted[i])) {
		System.out.println("Test case is pass");
	}else {
		System.out.println("Test case is fail");}}

}
	
		
		private static void lead() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
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
			String Actual= driver.getTitle();
			 String Expected ="Login | Salesforce";
			 if(Expected.equals(Actual)) {
					System.out.println("Test case is pass");
				}else {
					System.out.println("Test case is fail");}}
			
			
	

		private static void opportunitiesdropdown() {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement opportunities=driver.findElement(By.xpath("//a[@title='Opportunities Tab']"));
			opportunities.click();
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement view=driver.findElement(By.id("fcf"));
			view.click();
			Select menu=new Select(view);
			List<WebElement> Actual =menu.getOptions();
			for(WebElement element:Actual){
			String s="null";
				s=element.getText();
				System.out.println(s);
			}
			
			String expected[]= {"All Opportunities", "Closing Next Month", "Closing This Month","My Opportunities","New Last Week",
 "New This Week","Opportunity Pipeline","Private", "Recently Viewed Opportunities","Won"};
			if(expected.equals(Actual)) {
				System.out.println("Test case is pass");
			}else {
				System.out.println("Test case is fail");}}
		
					
	
		private static void accountReport() {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement account=driver.findElement(By.id("Account_Tab"));
			account.click();
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
	}

		private static void mergeaccount() {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement account=driver.findElement(By.id("Account_Tab"));
			account.click();
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement mergeaccount=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
			mergeaccount.click();
WebElement button=driver.findElement(By.id("srch"));
button.click();
button.sendKeys("de");
WebElement search=driver.findElement(By.xpath("//input[@name='srchbutton']"));
search.click();
WebElement next=driver.findElement(By.xpath("//input[@name='goNext']"));
next.click();
WebElement merge=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[5]/div/input[2]"));
merge.click();
Alert alert=driver.switchTo().alert();
alert.accept();
	}

		private static void uploadphoto() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
			correctlogin();			
			WebElement usermenu=driver.findElement(By.id("userNavLabel"));
			usermenu.click();
			WebElement profile=driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
			profile.click();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement addphoto=driver.findElement(By.id("displayBadge"));
			Thread.sleep(3000);
			addphoto.click();
			WebElement frame2=driver.findElement(By.id("uploadPhotoContentId"));
			driver.switchTo().frame(frame2);
			Thread.sleep(3000);
			JavascriptExecutor Js=(JavascriptExecutor)driver;
			Js.executeScript("document.getElementById('j_id0').click();");
			//Thread.sleep(3000);
			StringSelection selection= new StringSelection("C:\\Users\\sathy\\Downloads\\PXL_20220729_005950878.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			//Thread.sleep(3000);
			//WebElement uploadphoto=driver.findElement(By.id("j_id0"));
			//uploadphoto.sendKeys("C:\\Users\\sathy\\Downloads\\PXL_20220729_005950878.jpg");
			System.out.println("The upload page is opened");
			WebElement save1=driver.findElement(By.id("j_id0:uploadFileForm:save"));
			save1.click();
			
	}

		private static void createnewview() {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement account=driver.findElement(By.id("Account_Tab"));
			account.click();
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
			WebElement createview=driver.findElement(By.xpath("//span/span[2]/a[2]"));
			createview.click();	
			WebElement viewname=driver.findElement(By.id("fname"));
			viewname.click();
			viewname.sendKeys("ji");
			WebElement uniquename=driver.findElement(By.id("devname"));
			uniquename.click();
			uniquename.clear();
			uniquename.sendKeys("ji");
			WebElement save=driver.findElement(By.xpath("//input[@data-uidsfdc=\"3\"]"));
			//input[@data-uidsfdc="3"]
			save.click();
	}

		private static void createAccount() throws InterruptedException {
		// TODO Auto-generated method stub
			correctlogin();
			WebElement account=driver.findElement(By.id("Account_Tab"));
			account.click();
			//Thread.sleep(4000);
			//driver.switchTo().alert();
			WebElement close=driver.findElement(By.id("tryLexDialogX"));
			close.click();
		WebElement newaccount=driver.findElement(By.xpath("//input[@name='new']"));
		newaccount.click();
		WebElement accountname=driver.findElement(By.id("acc2"));
		accountname.sendKeys("xyc");
		WebElement type=driver.findElement(By.id("acc6"));
		type.click();
		Select ob=new Select(type);
		ob.selectByIndex(6);
		WebElement priority=driver.findElement(By.id("00NDn00000SjSNm"));
		priority.click();
		Select ob1=new Select(priority);
		ob1.selectByIndex(1);}
		
		
		
			

		private static void logout() {
		// TODO Auto-generated method stub
			correctlogin();
			/*getDriverInstance("chrome");
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
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
			WebElement usermenu=driver.findElement(By.id("userNavLabel"));
			usermenu.click();
			WebElement logout=driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[5]"));
			logout.click();}
			
		
	
	

		private static void Developerconsole() throws InterruptedException {
		// TODO Auto-generated method stub
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
WebElement usermenu=driver.findElement(By.id("userNavLabel"));
usermenu.click();
WebElement console=driver.findElement(By.xpath("//*[@class='debugLogLink menuButtonMenuLink']"));
console.click();
String baseHandle=driver.getWindowHandle();
Set<String>handles=driver.getWindowHandles();
for(String handle:handles) {
	if(!baseHandle.equals(handle)) {
		driver.switchTo().window(handle);
		driver.close();}}}
	
	





	

		private static void MyProfile() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
correctlogin();			
WebElement usermenu=driver.findElement(By.id("userNavLabel"));
usermenu.click();
WebElement profile=driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
profile.click();
Thread.sleep(5000);
//WebElement edit=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[2]/div[2]/div[1]/h3/div/div/a/img"));
//edit.click();
//Thread.sleep(5000);
//WebElement frame1=driver.findElement(By.id("contactInfoContentId"));
//driver.switchTo().frame(frame1);
//WebElement about=driver.findElement(By.xpath("/html/body/div/div/div/div[1]/ul/li[1]/a"));
//about.click();
//WebElement lastname=driver.findElement(By.id("lastName"));
//lastname.clear();
//lastname.sendKeys("ram");
//WebElement saveall=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/input[1]"));
//saveall.click();
/*WebElement post=driver.findElement(By.id("publisherAttachTextPost"));
post.click();
Thread.sleep(4000);
WebElement frame2=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
driver.switchTo().frame(frame2);
//WebElement postbox=driver.findElement(By.xpath("//html[@style='overflow-y: hidden;']"));
WebElement postbody=driver.findElement(By.xpath("//body[@style=\"height: auto; min-height: auto;\"]"));
postbody.click();
postbody.sendKeys("hello");
Thread.sleep(4000);
driver.switchTo().parentFrame();
WebElement share=driver.findElement(By.id("publishersharebutton"));
share.click();*/
//Thread.sleep(5000);
WebElement file=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[1]/ul/li[2]/a/span[1]"));
file.click();
Thread.sleep(5000);
WebElement uploadfile=driver.findElement(By.id("chatterUploadFileAction"));
uploadfile.click();
//WebElement choosefile=driver.findElement(By.id("chatterFile")).sendKeys("C:\\Users\\sathy\\OneDrive\\Documents\\Java Hackathan\\New Text Document.txt");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('chatterFile').click()");
Thread.sleep(3000);
StringSelection selection= new StringSelection("C:\\Users\\sathy\\OneDrive\\Documents\\Java Hackathan\\programs.pdf");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
WebElement share=driver.findElement(By.id("publishersharebutton"));
share.click();


	}

		private static void selectusermenuDropdown() throws InterruptedException {
		// TODO Auto-generated method stub
			getDriverInstance("chrome");
			driver.get("https://login.salesforce.com/");
			Thread.sleep(5000);
			WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("hi@tekarch.com");
		WebElement password=driver.findElement(By.id("password"));
password.sendKeys("Tryhard2work");
By ob1=By.id("Login");
WebElement login=driver.findElement(ob1);
login.click();
WebElement usermenu=driver.findElement(By.id("userNavLabel"));
usermenu.click();

if(usermenu.isEnabled()&&usermenu.isDisplayed()) {
	System.out.println("Test case is pass");
}else {
	System.out.println("Test case is failed");
}
//Select ob=new Select(username);
//ob.isMultiple();
		}

			
			
	

		public static void missedpassword() throws InterruptedException {
		String expected="Please enter your password.";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);
		By ob=By.id("username");
		WebElement username=driver.findElement(ob);
	username.sendKeys("User@gmail.com");
		By ob1=By.id("Login");
		WebElement login=driver.findElement(ob1);
		login.click();
		WebElement text=driver.findElement(By.id("error"));
		String actual=text.getText();
		if(expected.equalsIgnoreCase(actual)) {
			System.out.println("Test case is pass");
		}else {
			System.out.println("Test case is fail");}}
			
		public static void correctlogin1() throws InterruptedException {
			// TODO Auto-generated method stub
			String expected="content";
			//WebDriverManager.chromedriver().setup();
			//WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
getDriverInstance("chrome");
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
Thread.sleep(5000);
WebElement title=driver.findElement(By.id("tsidLabel"));
String actual=title.getText();
if(expected.equalsIgnoreCase(actual)) {
	System.out.println("Test case is pass");
}else {
	System.out.println("Test case is fail");}}

		}	

	

