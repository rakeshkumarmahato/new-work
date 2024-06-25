package tablesh;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//String BookName=driver.findElements(By.xpath("//table[@name='BookTable']//td[6]//td[2]")).getText();
		//System.out.println(BookName);
		
		//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		
		
						//Date picker

		
		
		/*driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/10/2001");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year="2022";
		String month="February";
		String Days="21";
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		List<WebElement> Alldata=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		for(WebElement dt:Alldata)
		{
		if(dt.getText().equals(Days));
		{
			dt.click();
			break;
		}
		}*/
		
		String year="2022";
		String month="February";
		String Days="21";
		
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		

	}
}

