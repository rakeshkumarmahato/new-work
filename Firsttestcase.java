package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttestcase {

	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	//driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary'] and Device Support']")).click();
	
	
	//driver.navigate().to("https://www.youtube.com/watch?v=ow77NqggH-0&list=RDGMEM916WJxafRUGgOvd6dVJkeQVMW8J6H92FS88&index=4");
	//driver.navigate().back();
	//Thread.sleep(3000);
	//driver.navigate().forward();
	
	driver.get("https://www.opencart.com/index.php?route=cms/demo");
	driver.findElement(By.xpath("//a[@class='btn btn-link navbar-btn']")).click();
	//String act_title=driver.getTitle();
	
	//if(act_title.equals("your store"))
	//{
	//System.out.println("test is passed");
	//}
	//else
	//{
	//	System.out.println("test is failed");
	//}
	//driver.close();
	//driver.findElement(By.name("newsletter")).sendKeys("abc");
	//boolean logoDisplayStatus=driver.findElement(By.id("copyright")).isDisplayed();
	//System.out.println(logoDisplayStatus);
	//driver.findElement(By.linkText("Daraz Logistics Partner")).click();
	//driver.findElement(By.cssSelector("input#q")).sendKeys("laptop");
	//driver.findElement(By.cssSelector("input.search-box__input--O34g")).sendKeys("laptop");
	//driver.findElement(By.cssSelector("input[Placeholder='Search in Daraz']")).sendKeys("mobile");
	
	

}
}
