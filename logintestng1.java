package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebElement;
import com.google.common.base.Function;
import Projects.Utility;

public class logintestng1 {
private WebDriver driver;
private Utility utility;

@DataProvider
public Object[][] getTestData() throws Exception {
utility = new Utility();

int totalRows = utility.getRowCount("D:\\contact1\\BikeExcel.xlsx","Sheet1");
int totalColumns = utility.getColumnCount("D:\\contact1\\BikeExcel.xlsx","Sheet1");
System.out.println("=> Total rows and columns is/are (" + totalRows + ", " + totalColumns + ")");

Object[][] data = new Object[totalRows][totalColumns];
for (int i = 0; i < totalRows; i++) 
{
for (int j = 0; j < totalColumns; j++) 
{
data[i][j] = new Utility().getData("D:\\contact1\\BikeExcel.xlsx", "Sheet1", i, j);
}
}
return data;
}
@BeforeMethod
public void setup() throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
this.driver = new ChromeDriver();

driver.get("file:///C:/Users/itctesting24/Desktop/project/login.html");
Thread.sleep(2000);
}

@Test(dataProvider = "getTestData")
public void test(String UserName, String Password) throws InterruptedException {
driver.findElement(By.id("name")).sendKeys(UserName);
driver.findElement(By.id("password")).sendKeys(Password);
driver.findElement(By.id("login")).click();
Thread.sleep(2000);
driver.switchTo().alert().accept();
Thread.sleep(2000);
//driver.close();
}
@AfterMethod
public void login1()
{
	driver.quit();
}
}

