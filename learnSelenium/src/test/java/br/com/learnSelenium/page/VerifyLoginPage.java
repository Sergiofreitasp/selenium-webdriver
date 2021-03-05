package br.com.learnSelenium.page;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class VerifyLoginPage {

	protected WebDriver driver;
	
	
	
	public VerifyLoginPage() {
		super();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Documents\\workspace-spring-tool-suite-4-4.6.0.RELEASE\\learnSelenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(name="uid")
	private WebElement uid;
	
	@FindBy(name="password")
	private WebElement pw;
	
	@FindBy(name="btnLogin")
	private WebElement btnl;
	
	@FindBy(xpath="/html/body/div[2]/h2")
	private WebElement ttl;
	
	public void preencherForm(String user, String pass) {
		WebDriverWait wait = new WebDriverWait(this.driver, 5);
		wait.until(ExpectedConditions.visibilityOf(uid));
		uid.clear();
		uid.sendKeys(user);
		pw.clear();
		pw.sendKeys(pass);
		btnl.click();
	}
	
	//mngr307936
	//bAhugej
	//User or Password is not valid
	
	public void validarLogin(String title) {
		Assert.assertEquals(title, ttl.getText());
		driver.quit();
	}
	
	public void validarLoginIncorreto(String alerta) {
		Assert.assertEquals(alerta, getAlert());
		aceitarAlerta();
	}
	
	public String getAlert() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
	public void aceitarAlerta() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void navigate(String url) {
		driver.navigate().to(url);
	}
	
	public void afterTest() {
		if(driver != null){
//			driver.close();
			driver.quit();
		}
		driver = null;
	}
}
