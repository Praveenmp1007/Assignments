package Projects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class loginpage {
	WebDriver driver;
	@Test
  public void login() 
  {
		driver.get("file://C://Users//itctesting24//Desktop//project//login.html");
		driver.findElement(By.id("name")).sendKeys("Praveenmp");
		driver.findElement(By.id("password")).sendKeys("Welcome@123");
		driver.findElement(By.id("login")).click();
		driver.switchTo().alert().accept();
		driver.close();
  }
  @Test(priority=1)
   public void register() throws InterruptedException
	{
		//TODO Auto-generated method stub
		driver.get("file://C://Users//itctesting24//Desktop//project/register.html");
		driver.findElement(By.id("text1")).sendKeys("PeterPraveen");
		Thread.sleep(1000);
		driver.findElement(By.id("text2")).sendKeys("Praveenmp");
		Thread.sleep(1000);
		driver.findElement(By.id("mail")).sendKeys("peterpraveen10@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Phno")).sendKeys("8147652002");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Welcome@123");
		Thread.sleep(1000);
		driver.findElement(By.id("conpassword")).sendKeys("Welcome@123");
		Thread.sleep(1000);
		WebElement radioboxSelect=driver.findElement(By.id("radio")); 
		Thread.sleep(1000);
		Boolean isSelect=radioboxSelect.isSelected();
		if(isSelect==false)
		{
			radioboxSelect.click();
		}
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}
  @Test
  @BeforeMethod
  public void beforeMethod() 
  {
	  	String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver =new ChromeDriver();
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
  public void beforeSuite() 
  {
  }

  @AfterSuite
  public void afterSuite() 
  {
  }

}
