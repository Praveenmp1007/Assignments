package Project1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class booking_testng 
{
  @Test
  public void f1() throws InterruptedException 
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
		Boolean sel=checkboxSelect.isSelected();
		if(sel==false)
		{
			checkboxSelect.click();
		}
		driver.findElement(By.id("Min")).sendKeys("100000");
		Thread.sleep(1000);
		driver.findElement(By.id("Max")).sendKeys("500000");
		Thread.sleep(1000);
		driver.findElement(By.id("Submit")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
