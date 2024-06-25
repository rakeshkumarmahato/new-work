package mousehoveraction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoveraction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://qa.tech/?utm_term=website%20testing&utm_campaign=Website+Traffic+April+2024&utm_source=adwords&utm_medium=ppc&hsa_acc=9858954401&hsa_cam=21201290540&hsa_grp=161553473735&hsa_ad=696901958838&hsa_src=g&hsa_tgt=kwd-10641661&hsa_kw=website%20testing&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gad_source=1&gclid=CjwKCAjwmYCzBhA6EiwAxFwfgIBZYgKMC0FuPVMck9MDTeGzbaWxtelpOlN4ClRBZy145ij6mKBGphoCHxAQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement fashion=driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[2]/ul[1]/li[3]/span[1]/p[1]"));
		WebElement clothing=driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[4]/a[1]/p[1]"));
		
		Actions act=new Actions(driver);
		// mouse hover action
		act.moveToElement(fashion).perform();
		act.moveToElement(clothing).click().build().perform();
		
		
		/*
		
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://qa.tech/?utm_term=website%20testing&utm_campaign=Website+Traffic+April+2024&utm_source=adwords&utm_medium=ppc&hsa_acc=9858954401&hsa_cam=21201290540&hsa_grp=161553473735&hsa_ad=696901958838&hsa_src=g&hsa_tgt=kwd-10641661&hsa_kw=website%20testing&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gad_source=1&gclid=CjwKCAjwmYCzBhA6EiwAxFwfgIBZYgKMC0FuPVMck9MDTeGzbaWxtelpOlN4ClRBZy145ij6mKBGphoCHxAQAvD_BwE");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.manage().window().maximize();

		        // Initialize WebDriverWait
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		        // Locate and hover over the 'Resources' element
		        WebElement fashion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='menu-main-menu']//p[@class='item__title'][normalize-space()='Resources']")));
		        WebElement clothing = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='sub-menu sub-menu--active']//p[@class='item__title'][normalize-space()='About Us']")));
		        Actions act = new Actions(driver);
		        act.moveToElement(fashion).moveToElement(clothing).click().build().perform();

		        // Locate and click the 'About Us' element
		       // WebElement clothing = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='sub-menu sub-menu--active']//p[@class='item__title'][normalize-space()='About Us']")));
		       // act.moveToElement(clothing).click().build().perform();
		        
		    */
		

		
	}

}
