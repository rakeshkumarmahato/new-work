package secondday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.daraz.com.np/?spm=a2a0e.11779170.header.dhome.287d2d2bLvk5na");
		WebElement logo=driver.findElement(By.xpath("//*[@id='topActionHeader']/div/div[2]/div/div[1]/a/img"));
		System.out.println("displayed"+logo.isDisplayed());

	}

}
