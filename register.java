package Projects;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver; 

public class register 
{
	public static void main(String args[]) throws InterruptedException
	{
		//TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting24/Desktop/project/register.html");
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
}

