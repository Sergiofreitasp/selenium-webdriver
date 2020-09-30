package br.com.aprendaSeleniumComThiago.test;

import org.junit.Test;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;
import br.com.aprendaSeleniumComThiago.page.PageDrangnDrop;

public class TestDragnDrop extends CoreBaseTest{

	@Test
	public void dragnDrop() {
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		PageDrangnDrop vamo = new PageDrangnDrop();
		vamo.dragnDrop();
		vamo.validar("Debit Movement"); 
	}
		
}
