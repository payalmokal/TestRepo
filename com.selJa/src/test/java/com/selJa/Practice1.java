package com.selJa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
//		driver.get("https://pvm.talentlms.com/index");
//		driver.findElement(By.name("login")).sendKeys("payal.mokal@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Swara@0910");
//		driver.findElement(By.name("submit")).click();
//		
		LoginPage logpage =new LoginPage(5);
		logpage.CommonLogin(driver);
	
//
////List and count of No of links on page		
//		List<WebElement> links= driver.findElements(By.tagName("a"));
//		int LinkCount= links.size();
//		System.out.println("No of links present "+LinkCount);
//		for(WebElement element: links) {
//			System.out.println(element.getText());
//		}
//		
//		System.out.println(logpage.add(2,4));
		
//		driver.navigate().to("https://pvm.talentlms.com/dashboard/index/role:learner");
//		List<WebElement> abc=driver.findElements(By.tagName("span"));
//		Thread.sleep(1000);
//		for(WebElement element:abc) {
//			System.out.println(element.getText());	
//		}
		driver.navigate().to("https://pvm.talentlms.com/dashboard/index/role:learner");
		//List<WebElement> abc=driver.findElements(By.tagName("span"));
		WebElement dropdown =driver.findElement(By.className("dynatree-expander"));
		Select sobj= new Select(dropdown);
		sobj.selectByValue("Introduction to TalentLMS");
		
		
driver.close();
	}

}
