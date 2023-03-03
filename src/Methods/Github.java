package Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Github {
public WebDriver driver;
  @BeforeTest
 public void login() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://github.com/login");
	 driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("Dr.kwady@hotmail.com");
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1@2#3$5it.s!!??..");
	 driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[11]")).click();
 }
  //due to update we had to declare a test method (test case) to run as testng *_*
@Test(groups= "family") 
//when you use groups run as configuration and choose the one you want*-*
	public void testtitle() {
	String actual =driver.getTitle();
	Assert.assertEquals(actual, "GitHubn");
}
@Test()
public void print() {
	System.out.println("yes you doing well :)");
}

 
 
}
