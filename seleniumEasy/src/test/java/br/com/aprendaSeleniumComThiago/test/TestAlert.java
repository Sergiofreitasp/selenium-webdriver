package br.com.aprendaSeleniumComThiago.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;
import br.com.aprendaSeleniumComThiago.page.PageAlert;

public class TestAlert extends CoreBaseTest{
	
	@Ignore
	@Test
	public void desafioTest() {
		PageAlert vamo = new PageAlert();
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		vamo.preencher("1234");
		vamo.validarAlertas("Do you really want to delete this Customer?", "Customer Successfully Delete!");
		
		
	}
	
}
