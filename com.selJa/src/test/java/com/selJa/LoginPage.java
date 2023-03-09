package com.selJa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	int a;
	public void CommonLogin(WebDriver driver) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
		driver.get("https://pvm.talentlms.com/index");
		driver.findElement(By.name("login")).sendKeys("payal.mokal@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Swara@0910");
		driver.findElement(By.name("submit")).click();
			
	}
	public int add(int a,int b) {
		 int q= a+b;
		 return(q);
		}
	
	public LoginPage() {
		
	}
	public LoginPage(int a) {
		this.a=a+5;
		System.out.println(a);	
	}
}
