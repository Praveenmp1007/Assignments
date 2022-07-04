package Project1;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class login_page 
{
	public static void main(String args[]) throws InterruptedException
	{
		//TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1);
		driver.get("file:///C:/Users/itctesting24/Desktop/project/login.html");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Praveenmp");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Welcome@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.close();
	}
}

