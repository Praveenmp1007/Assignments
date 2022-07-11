package Projects;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class home 
{
public static void main(String[] args) throws InterruptedException 
{
String path1="D:\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path1);
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/itctesting24/Desktop/project/home.html");
driver.findElement(By.xpath("//*[@id='About']"));
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id='Product']"));
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id='Booking']"));
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id='Contact us']"));
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id='Team']"));
Thread.sleep(1000);
driver.switchTo().alert().accept();
Thread.sleep(1000);
//driver.close();
}
}

