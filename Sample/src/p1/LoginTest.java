package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	static WebDriver driver;
	@Test(priority=1)
	public void Test_01()	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void Test_02()	{
		driver.get("http://www.amazon.in/");
	}
	@Test(priority=3)
	public void Test_03()	{
		driver.findElement(By.cssSelector("a[id=nav-link-yourAccount]")).click();
	}
	@Test(priority=4)
	public void Test_04()	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector('input[name=email]').value='vijaytamse@gmail.com'");
	}

}
