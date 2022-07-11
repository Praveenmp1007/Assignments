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

public class contacttestng {
private WebDriver driver;
private Utility utility;

@DataProvider
public Object[][] getTestData() throws Exception {
utility = new  Utility();

int totalRows = utility.getRowCount("D:\\contact1\\BikeExcel.xlsx","Sheet4");
int totalColumns = utility.getColumnCount("D:\\contact1\\BikeExcel.xlsx","Sheet4");
System.out.println("=> Total rows and columns is/are (" + totalRows + ", " + totalColumns + ")");

Object[][] data = new Object[totalRows][totalColumns];
for (int i = 0; i < totalRows; i++) {
for (int j = 0; j < totalColumns; j++) {
data[i][j] = new  Utility()
.getData("D:\\contact1\\BikeExcel.xlsx", "Sheet4", i, j);
}
}
return data;
}

@BeforeMethod
public void setup() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
this.driver = new ChromeDriver();

driver.get("file:///C:/Users/itctesting24/Desktop/project/contact.html");
Thread.sleep(2000);

}

@Test(dataProvider = "getTestData")
public void test(String FirstName, String LastName, String Email, String phone, String Message)
throws InterruptedException {
driver.findElement(By.id("fname")).sendKeys(FirstName);
driver.findElement(By.id("lname")).sendKeys(LastName);
Thread.sleep(1000);
driver.findElement(By.id("email")).sendKeys(Email);
driver.findElement(By.id("mobile")).sendKeys(phone);
Thread.sleep(1000);
driver.findElement(By.id("meg")).sendKeys(Message);
Thread.sleep(1000);
driver.findElement(By.id("submit")).click();
Thread.sleep(2000);
//driver.switchTo().alert().accept();
}
@AfterMethod
public void contact()
{
	driver.quit();
}
}


