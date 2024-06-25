package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class alertsabc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// Alert with ok button only
		
		//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		//driver.switchTo().alert().accept();
		//Alert Myalert=driver.switchTo().alert();
		//System.out.println(Myalert.getText());
		//Myalert.accept();
		// 2 conformation alert
		//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert Myalert=driver.switchTo().alert();
		Myalert.sendKeys("hello");
		//Myalert.accept();
		Myalert.dismiss();

	}

}
