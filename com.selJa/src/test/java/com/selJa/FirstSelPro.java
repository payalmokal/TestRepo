package com.selJa;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSelPro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://pvm.talentlms.com/index");
driver.navigate().to("https://pvm.talentlms.com/index");

System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

driver.switchTo().newWindow(WindowType.TAB);

driver.manage().window().maximize();
driver.manage().window().minimize();
driver.manage().window().fullscreen();

//typecasting to take screenshots

File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshot, new File("./image.png"));
driver.close();


	}

}
