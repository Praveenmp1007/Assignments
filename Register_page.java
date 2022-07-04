package Project1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Register_page
{
	public static void main(String args[])
	{
		//TODO Auto-generated method stub
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/itctesting24/Desktop/project/register.html");
		driver.findElement(By.id("text1")).sendKeys("PeterPraveen");
		driver.findElement(By.id("text2")).sendKeys("Praveenmp");
		driver.findElement(By.id("mail")).sendKeys("peterpraveen10@gmail.com");
		driver.findElement(By.id("Phno")).sendKeys("8147652002");
		driver.findElement(By.id("password")).sendKeys("Welcome@123");
		driver.findElement(By.id("conpassword")).sendKeys("Welcome@123");
		WebElement radioboxSelect=driver.findElement(By.id("radio")); 
		Boolean isSelect=radioboxSelect.isSelected();
		if(isSelect==false)
		{
			radioboxSelect.click();
		}
		driver.findElement(By.id("submit")).click();
		driver.close();
	}
}

