package br.com.aprendaSeleniumComThiago.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;
import br.com.aprendaSeleniumComThiago.page.PageBasicFormDemo;
import br.com.aprendaSeleniumComThiago.page.PageHomeSeleniumEasy;
import br.com.aprendaSeleniumComThiago.page.PageSimpleBasicForm;
import br.com.aprendaSeleniumComThiago.util.Property;
import br.com.aprendaSeleniumComThiago.util.Utils;

public class TestSimpleBasicForm extends CoreBaseTest{
	
	@Ignore
	@Test
	public void realizarPrimeiroTest() {
		//PageHomeSeleniumEasy homeSeleniumEasy = new PageHomeSeleniumEasy();
		//PageBasicFormDemo basicFormDemo = new PageBasicFormDemo();
		//--- GOOGLE ---
		driver.navigate().to("https://www.google.com.br/");
		driver.findElement(By.name("q")).sendKeys("recursividade");
		driver.findElement(By.name("q")).submit();
		Assert.assertEquals("recursividades", driver.findElement(By.xpath("//*[@id=\"taw\"]/div[2]/div/p/a/b/i")).getText());
		
		
		//("recursividade", driver.findElement(By.className("gL9Hy")));
		
//		homeSeleniumEasy.acessarTestSelenium("BASIC EXAMPLES TO START WITH SELENIUM");
//		Utils.takeScreenshot(driver, "realizarPrimeiroTeste", "1 - Acesso Pagina SimpleForm");
//		basicFormDemo.preencherMensagem("Thiago");
//		Utils.takeScreenshot(driver, "realizarPrimeiroTeste", "2 - preechendo texto");
//		basicFormDemo.clickEnviarMensagem();
//		Utils.takeScreenshot(driver, "realizarPrimeiroTeste", "3 - click");
//		basicFormDemo.validaMensagem("Thiago");
//		Utils.takeScreenshot(driver, "realizarPrimeiroTeste", "4 - validacao");
	}
	
	@Test
	public void desafioTest() {
		driver.navigate().to("http://demo.guru99.com/test/login.html");
		/*driver.findElement(By.id("email")).sendKeys("sergio@me.com");
		driver.findElement(By.id("passwd")).sendKeys("1234");
		driver.findElement(By.id("SubmitLogin")).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("site-name")));
		Assert.assertEquals(Successfully Logged in..., driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText());
	*/
		PageSimpleBasicForm vamo = new PageSimpleBasicForm();
		vamo.preencher("sergio@me.com", "1234");
		vamo.validar("Successfully Logged in...");
	}
	
}


