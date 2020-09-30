package br.com.aprendaSeleniumComThiago.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.aprendaSeleniumComThiago.core.CoreDriver;

public class PageDrangnDrop {
	
	protected WebDriver driver;
	public PageDrangnDrop(){
		this.driver = CoreDriver.getDriver();
		WebDriverWait driverWait = new WebDriverWait(this.driver, 10);
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id=\"credit2\"]")
	private WebElement bank;
	
	@FindBy(xpath = "//*[@id=\"bal3\"]/table/tbody/tr/td[1]")
	private WebElement debitMove;
	
	@FindBy(xpath = "//*[@id=\"bank\"]/li")
	private WebElement DSAccont;
	
	
	
	public void dragnDrop() {
		Actions acao =new Actions(driver);
		acao.dragAndDrop(bank, DSAccont).build().perform();
	}
	
	public void validar(String text) {
		Assert.assertEquals(text, debitMove.getText());
	}
}
