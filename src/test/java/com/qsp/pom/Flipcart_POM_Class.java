package com.qsp.pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipcart_POM_Class {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(" https://www.flipkart.com/");
		FlipcartAddresses fa = new FlipcartAddresses(driver);
		try {
			fa.getCancleCross().click();
		} catch (Exception e) {
			System.out.println("Cross is cancelled.. ");
		}
		Actions act = new Actions(driver);
		act.moveToElement(fa.getMoveToElectronics()).perform();
		act.moveToElement(fa.getMoveTOGaming()).perform();
		act.moveToElement(fa.getMoveTOGames()).click().build().perform();
		List<WebElement> allEle = driver.findElements(By.className("s1Q9rs"));
	}
}
