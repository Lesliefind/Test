package com.test.kuick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\USEFUL\\chromedriver.exe");//chromedriver服务地址
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://deal-admin-test3.kuick.cn/user/passport#/accountLogin");
		
		driver.findElement(By.className("account")).sendKeys("18511015447");
		driver.findElement(By.className("password")).sendKeys("asd123");
		driver.findElement(By.className("content")).click();
		
		driver.findElement(By.linkText("企业成员")).click();
		
	}

}
