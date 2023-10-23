package mytrip01;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trip01 {

	WebDriver driver;
	String url="https://www.makemytrip.com/";
	@BeforeTest
	public  void mytrip() throws InterruptedException
	{
	 WebDriverManager.chromedriver().setup();
     ChromeOptions op=new ChromeOptions();
     op.addArguments("--remote-allow-origin=*");
     driver = new ChromeDriver(op);
     driver.get(url);     
     driver.manage().window().maximize();
     driver.getTitle();
     Thread.sleep(3000);
	}
	@Test
	public void location() throws AWTException, InterruptedException
	{	
		driver.findElement(By.id("username")).sendKeys("gnanasoundharya.s@moolyaed.com");//mailid
		Thread.sleep(3000);
		driver.findElement(By.className("capText font16")).click();//continue button 
		Thread.sleep(3000);		
		driver.findElement((By.linkText("Holiday Packages"))).click();//holidaypackage
		Thread.sleep(3000);
		//driver.findElement(By.className("citypicker_input")).sendKeys("Bangalore");
		Robot ro =new Robot();
	    ro.keyPress(KeyEvent.VK_B);
	    ro.keyPress(KeyEvent.VK_A);
		ro.keyPress(KeyEvent.VK_N);
		ro.keyPress(KeyEvent.VK_G);
		ro.keyPress(KeyEvent.VK_A);
		ro.keyPress(KeyEvent.VK_L);
		ro.keyPress(KeyEvent.VK_O);
		ro.keyPress(KeyEvent.VK_R);
		ro.keyPress(KeyEvent.VK_E);
		ro.keyPress(KeyEvent.VK_DOWN);		
		ro.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
   	 	driver.findElement(By.xpath("//*[@class='dest-search-input']")).sendKeys("Singapore");
		Thread.sleep(3000);
		}
	
		@Test
		public void date()
		{
			driver.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();//search
			driver.findElement(By.xpath("//*[@class='bgProperties icon20 overlayCrossIcon']")).click();//close
			driver.findElement(By.xpath("//*[@class='blackFont fontSize12 appendBottom3'][1]"));//startdate
			driver.findElement(By.xpath("//*[@class='blackFont fontSize12 appendBottom3'][3]"));//enddate	
			
		}
	
		
		
	}
	

	

