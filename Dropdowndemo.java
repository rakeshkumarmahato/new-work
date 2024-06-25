package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo {

	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement drpcountry=driver.findElement(By.xpath("//select[@id='country']"));
		//Select drpcountry1= new Select(drpcountry);
		//drpcountry1.selectByVisibleText("France");
		//drpcountry1.selectByValue("japan");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
}
