package sampletest;

import java.awt.KeyboardFocusManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Hex;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.webdriven.commands.GetAllWindowNames;

public class Setclogin {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthickkm\\Desktop\\jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DesiredCapabilities capability = null;
		capability = DesiredCapabilities.chrome();
		
		//String Url= "http://www.tnstc.in/TNSTCOnline/";
		String Url="http://www.tnstc.in";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		

		driver.findElement(By.xpath("//a[@href='http://www.tnstc.in/TNSTCOnline/']")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int tabsize = tabs.size();
		System.out.println(tabsize);
		driver.switchTo().window(tabs.get(tabsize-1));
		System.out.println(tabs);
		String s1 = driver.getWindowHandle();
		System.out.println(s1);
		//driver.switchTo().window("15CFB881AD3B0DE27FB18DE6B6DD9FF8");
		
		/*KeyboardFocusManager currentManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();  
		Window activeWindow = (Window) currentManager.getActiveWindow();
				
		Window activeWindow = (Window) javax.swing.FocusManager.getCurrentManager().getActiveWindow();
		System.out.println(activeWindow);
		//String currentwindow = driver.getCurrentUrl();
		//System.out.println(currentwindow);
		//ArrayList<String> multipleTabs = new ArrayList<String>(robot.getWebDriver().getWindowHandles());
		
		
		//[CDwindow-(C2009F25E7A0B0A7BD32DA9F32B6B8D1), CDwindow-(15CFB881AD3B0DE27FB18DE6B6DD9FF8)]
		
		  WebElement c =driver.findElement(By.name("txtUserLoginID"));
		  c.click();
		  c.sendKeys(" dhanushjai");
		driver.findElement(By.xpath("//input[@name='txtUserLoginID']")).sendKeys("dhanushjai");
		driver.findElement(By.id("txtPassword")).click();*/
	
		
		WebElement ele =driver.findElement(By.xpath("//a[contains(text(),'Create an account ')]"));
		ele.click();
		WebElement ele1 =driver.findElement(By.xpath("//input[@name='txtUserLoginID']"));
		ele1.click();
		ele1.sendKeys("DhanushhJk");
		
		/*String myString=null;
		String hexString = Hex.encodeHexString(myString.getBytes(6a61696b756d61723237));
		*/
		
		WebElement ele2= driver.findElement(By.xpath("//input[@name='txtPassword']"));
		ele2.click();
		String passwd= "Jaikumar27";
		ele2.sendKeys(passwd);
		driver.findElement(By.xpath("//input[@name='txtConfirmPassword']")).sendKeys(passwd);
		driver.findElement(By.xpath("//select[@name='txtSecretQuestion']")).click();
		Select al = new Select(driver.findElement(By.xpath("//select[@name='txtSecretQuestion']")));
		al.selectByIndex(4);
		//al.set(4, (WebElement) driver.findElements(By.xpath("//select[@name='txtSecretQuestion']")));
	
		driver.findElement(By.xpath("//input[@name='txtSecretAnswer']")).sendKeys("SVM");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement ele3 = driver.findElement(By.xpath("//input[@name='txtUserFullName']"));
		ele3.sendKeys("DhanushhJk");
		driver.findElement(By.xpath("//input[@name='txtEmailId']")).sendKeys("DhanushJk@gmail.com");
		WebElement ele4 = driver.findElement(By.xpath("//input[@name='txtDateOfBirth']"));
		ele4.clear();
		ele4.sendKeys("27/06/1995");
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		Thread.sleep(6000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.accept();
		driver.findElement(By.xpath("//input[@name='chkRules']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	}
}

