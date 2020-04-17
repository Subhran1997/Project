package com.mavenprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://www.whitebox-learning.com/");
driver.findElement(By.xpath("/html/body/section[1]/div/div[1]/a[1]")).click();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//li[@class='divider']/a[@id='loginButton']")).click();
driver.quit();
	}

}
