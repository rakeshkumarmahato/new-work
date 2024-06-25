package checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://productbuilder.rednao.com/product/checkbox-demo/");
		//driver.findElement(By.xpath("//input[@id='field_1_1']")).click();
		WebElementCheckboxes=driver.findElement(By.xpath("//input[@class='rnOptionItem']"));
		for(int i=0;i<Checkboxes.size();i++)
		{
			Checkboxes.get(i);
		}
		
	}

}
