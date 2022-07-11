package Projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact_us
{
public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
String path1="D:\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path1);
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/itctesting24/Desktop/project/contact.html");
Thread.sleep(2000);
driver.findElement(By.id( "fname")).sendKeys("Ellur");
driver.findElement(By.id( "lname")).sendKeys("Nayana");
Thread.sleep(2000);
driver.findElement(By.id( "email")).sendKeys("Nayana@gmail.com");
driver.findElement(By.id( "mobile")).sendKeys("8296503388");
Thread.sleep(2000);
driver.findElement(By.id( "meg")).sendKeys("Happy to visit your website");
Thread.sleep(2000);
driver.findElement(By.id( "sub")).click();
Thread.sleep(1000);
driver.switchTo().alert().accept();
driver.close();

}
}
