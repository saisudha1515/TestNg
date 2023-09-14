// Write a script for the below requirement. go to flipcart website and then go to Electronics and go to Gaming and then click on Games..
package com.qsp.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FlipcartAddresses {
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement cancleCross;

	@FindBy(xpath = "//div[text()='Electronics']")
	private WebElement moveToElectronics;

	@FindBy(xpath = "//a[text()='Gaming']")
	private WebElement moveTOGaming;

	@FindBy(xpath = "//a[text()='Games']")
	private WebElement moveTOGames;

	public FlipcartAddresses(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCancleCross() {
		return cancleCross;
	}

	public void setCancleCross(WebElement cancleCross) {
		this.cancleCross = cancleCross;
	}

	public WebElement getMoveToElectronics() {
		return moveToElectronics;
	}

	public void setMoveToElectronics(WebElement moveToElectronics) {
		this.moveToElectronics = moveToElectronics;
	}

	public WebElement getMoveTOGaming() {
		return moveTOGaming;
	}

	public void setMoveTOGaming(WebElement moveTOGaming) {
		this.moveTOGaming = moveTOGaming;
	}

	public WebElement getMoveTOGames() {
		return moveTOGames;
	}

	public void setMoveTOGames(WebElement moveTOGames) {
		this.moveTOGames = moveTOGames;
	}
}
