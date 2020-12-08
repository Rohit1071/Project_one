package Test_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tesst {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbishoyi\\OneDrive - DXC Production\\Desktop\\New folder (3)\\New folder (2)\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.facebook.com/");
    WebElement e=driver.findElement(By.xpath("//input[@id='email']"));
    e.sendKeys("Noname");
    WebElement f=driver.findElement(By.xpath("//input[@id='pass']"));
    f.sendKeys("Nothing");
    driver.close();
	} 

}
