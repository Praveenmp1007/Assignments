package Project1;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Booking_page 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting24/Desktop/project/booking.html");
		driver.findElement(By.id("Fname")).sendKeys("Peter");
		Thread.sleep(1000);
		driver.findElement(By.id("Lname")).sendKeys("Praveen");
		Thread.sleep(1000);
		driver.findElement(By.id("Address")).sendKeys("Rajkumar road 1st cross Siddhartha nagar Mysore");
		Thread.sleep(1000);
		driver.findElement(By.id("mail")).sendKeys("peterpraveen10@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Phno")).sendKeys("8147652002");
		Thread.sleep(1000);
		WebElement DOB=driver.findElement(By.xpath("//input[@id=\"DOB\"]"));
		DOB.sendKeys("10072000");		
		Thread.sleep(1000);
		Select se =new Select(driver.findElement(By.xpath("//*[@id='option']")));
		se.selectByIndex(2);
		Thread.sleep(2000);
		WebElement checkboxSelect=driver.findElement(By.id("V1"));
		Boolean isSelect=checkboxSelect.isSelected();
		if(isSelect==false)
		{
			checkboxSelect.click();
		}
		driver.findElement(By.id("Min")).sendKeys("100000");
		Thread.sleep(1000);
		driver.findElement(By.id("Max")).sendKeys("500000");
		Thread.sleep(1000);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("alert")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
}
