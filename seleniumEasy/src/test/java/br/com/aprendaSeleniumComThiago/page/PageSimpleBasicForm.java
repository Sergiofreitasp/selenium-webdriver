package br.com.aprendaSeleniumComThiago.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;
import br.com.aprendaSeleniumComThiago.core.CoreDriver;

public class PageSimpleBasicForm{
	protected WebDriver driver;
	
	public PageSimpleBasicForm() {
		this.driver = CoreDriver.getDriver();
		WebDriverWait driverWait = new WebDriverWait(this.driver, 10);
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	@FindBy(name="email")
	private WebElement campoemail;
	
	@FindBy(name="passwd")
	private WebElement camposenha;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	private WebElement bttsingin;
	
	@FindBy(xpath="/html/body/div[2]/div/div/h3")
	private WebElement labellogin;
	
	
	public void preencher(String email, String senha) {
		WebDriverWait driverWait = new WebDriverWait(this.driver, 10);
		driverWait.until(ExpectedConditions.visibilityOf(campoemail));
		campoemail.clear();
		campoemail.sendKeys("email");
		camposenha.clear();
		camposenha.sendKeys(senha);
		bttsingin.click();
	}
	
	public void validar(String validacao) {
		WebDriverWait driverWait = new WebDriverWait(this.driver, 10);
		driverWait.until(ExpectedConditions.visibilityOf(labellogin));
		Assert.assertEquals(validacao, labellogin.getText());
	}
	
	
}
