package br.com.aprendaSeleniumComThiago.page;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;
import br.com.aprendaSeleniumComThiago.core.CoreDriver;

public class PageAlert extends CoreBaseTest{
	protected WebDriver driver;
	public PageAlert() {
		this.driver = CoreDriver.getDriver();
		WebDriverWait driverWait = new WebDriverWait(this.driver, 10);
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	@FindBy(name="cusid")
	private WebElement customerid;
	
	@FindBy(name="submit")
	private WebElement buttunsubmit;
	
	
	public void preencher(String text) {
		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		wait.until(ExpectedConditions.visibilityOf(customerid));
		customerid.clear();
		customerid.sendKeys(text);
		buttunsubmit.click();
	}
	
	public void validarAlertas(String string1, String string2) {
		Assert.assertEquals(string1, getAlert());
		aceitarAlerta();
		Assert.assertEquals(string2, getAlert());
		aceitarAlerta();
		driver.quit();
	}
	public void aceitarAlerta() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public String getAlert() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
}
