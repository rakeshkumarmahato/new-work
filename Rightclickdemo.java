package rightclickdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickdemo {

	public static void main(String[] args)  {
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement Button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act=new Actions(driver);
		act.contextClick(Button).build().perform();
		*/
		
		

		//input[@id='field1']
		//input[@id='field2']
		//button[normalize-space()='Copy Text']
		
		
		/*
		
		//Double click action
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement Box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement Box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement Button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Box1.clear();
		Box1.sendKeys("hello mexample");
		
		Actions act=new Actions(driver);
		act.doubleClick(Button).build().perform();
		
		Thread.sleep(5000);
		
		
		String text=Box2.getAttribute("id");
		if(text.equals("hello mexample"))
		{
			
		System.out.println("copied");
		}
		else {
			System.out.println("not copied");
			}
		
		*/
		

		//p[normalize-space()='Drag me to my target']
		//p[normalize-space()='Drop here']
	/*	
		//Drag and Drop code
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		
		WebElement destination=driver.findElement(By.xpath("//p[normalize-space()='Drop here']"));
		
		act.dragAndDrop(source, destination).perform();
		
		*/
		/*
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover ui-state-focus ui-state-active']"));
		System.out.println("The coordinate is" +slider.getLocation());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 739, 1081).perform();
		
		*/
		
		
					// Keyboard actions 
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("hey i am here");
		
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
		}
		


		}

