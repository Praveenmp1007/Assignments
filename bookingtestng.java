package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

/*mport com.google.common.base.Function;
import Projects.Utility;*/

public class bookingtestng
{
private WebDriver driver;
private Utility utility;

@DataProvider
public Object[][] getTestData() throws Exception {
utility = new  Utility ();

int totalRows = utility.getRowCount("D:\\contact1\\BikeExcel.xlsx","Sheet3");
int totalColumns = utility.getColumnCount("D:\\contact1\\BikeExcel.xlsx","Sheet3");
System.out.println("=> Total rows and columns is/are (" + totalRows + ", " + totalColumns + ")");

Object[][] data = new Object[totalRows][totalColumns];
for (int i = 0; i < totalRows; i++) {
for (int j = 0; j < totalColumns; j++) {
data[i][j] = new  Utility ()
.getData("D:\\contact1\\BikeExcel.xlsx", "Sheet3", i, j);
}
}
return data;
}

@BeforeMethod
public void setup() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
this.driver = new ChromeDriver();

driver.get("file:///C:/Users/itctesting24/Desktop/project/booking.html");
Thread.sleep(2000);

}

@Test(dataProvider = "getTestData")
public void test(String FirstName, String LastName, String Address, String Email, String PhNum, String date,String Minm,String  Maxm) throws InterruptedException {
driver.findElement(By.id("Fname")).sendKeys(FirstName);
Thread.sleep(1000);
driver.findElement(By.id("Lname")).sendKeys(LastName);
Thread.sleep(1000);
driver.findElement(By.id("Address")).sendKeys(Address);
Thread.sleep(1000);
driver.findElement(By.id("mail")).sendKeys(Email);
Thread.sleep(1000);
driver.findElement(By.id("Phno")).sendKeys(PhNum);
Thread.sleep(1000);
driver.findElement(By.id("DOB")).sendKeys(date);
Thread.sleep(1000);
Select se = new Select(driver.findElement(By.xpath("//*[@id='option']")));
se.selectByIndex(1);
Thread.sleep(2000);
WebElement checkboxSelect = driver.findElement(By.id("V1"));
Boolean isSelect = checkboxSelect.isSelected();
if (isSelect == false) 
{
checkboxSelect.click();
}
driver.findElement(By.id("Min")).sendKeys(String.valueOf(Minm));
Thread.sleep(1000);
driver.findElement(By.id("Max")).sendKeys(String.valueOf(Maxm));
Thread.sleep(1000);
driver.findElement(By.id("Submit")).click();
//driver.findElement(By.id("alert")).click();
driver.switchTo().alert().accept();
Thread.sleep(1000);
}
@AfterMethod
public void booking1()
{
	driver.quit();
}
}