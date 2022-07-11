package Projects;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import com.google.common.base.Function;
import Projects.Utility;

public class registertestng12 {
private WebDriver driver;
private Utility utility;

@DataProvider
public Object[][] getTestData() throws Exception {
utility = new Utility();

int totalRows = utility.getRowCount("D:\\contact1\\BikeExcel.xlsx","Sheet2");
int totalColumns = utility.getColumnCount("D:\\contact1\\BikeExcel.xlsx","Sheet2");
System.out.println("=> Total rows and columns is/are (" + totalRows + ", " + totalColumns + ")");

Object[][] data = new Object[totalRows][totalColumns];
for (int i = 0; i < totalRows; i++) {
for (int j = 0; j < totalColumns; j++) {
data[i][j] = new Utility()
.getData("D:\\contact1\\BikeExcel.xlsx","Sheet2", i, j);
}
}
return data;
}

@BeforeMethod
public void setup() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
this.driver = new ChromeDriver();

driver.get("file:///C:/Users/itctesting24/Desktop/project/register.html");
Thread.sleep(2000);

}

@Test(dataProvider = "getTestData")
public void test(String FullName, String Username, String Email, String PhoneNum, String Paswrd, String ConPass)
throws InterruptedException {
driver.findElement(By.id("text1")).sendKeys(FullName);
Thread.sleep(1000);
driver.findElement(By.id("text2")).sendKeys(Username);
Thread.sleep(1000);
driver.findElement(By.id("mail")).sendKeys(Email);
Thread.sleep(1000);
driver.findElement(By.id("Phno")).sendKeys(PhoneNum);
Thread.sleep(1000);
driver.findElement(By.id("password")).sendKeys(Paswrd);
Thread.sleep(1000);
driver.findElement(By.id("conpassword")).sendKeys(ConPass);
Thread.sleep(1000);
WebElement radioboxSelect = driver.findElement(By.id("radio"));
Boolean isSelect = radioboxSelect.isSelected();
if (isSelect == false) 
{
radioboxSelect.click();
}
driver.findElement(By.id("submit")).click();
Thread.sleep(2000);
driver.switchTo().alert().accept();
driver.close();
}
@AfterMethod
public void register1()
{
	driver.quit();
}
}
