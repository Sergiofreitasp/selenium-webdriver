package br.com.learnSelenium.test;





import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;


import br.com.learnSelenium.page.VerifyLoginPage;

public class VerifyLoginTest {
	
	public static String baseURL = "http://www.demo.guru99.com/V4/";

	VerifyLoginPage vlp = new VerifyLoginPage();
	
	@Rule
	public TestName nameTest = new TestName();
	
	
	@Before
	public void setUp() throws Exception {
		
	}
	//mngr307936
	//bAhugej

	@After
	public void after(){
		vlp.afterTest();
	}

	@Test
	public void testSS1() {
		vlp.navigate(baseURL);
		vlp.preencherForm("mngr307936", "bAhugej");
		vlp.validarLogin("Guru99 Bank");
	}
	
	@Test
	public void testSS2() {
		vlp.navigate(baseURL);
		vlp.preencherForm("mngr3036", "bAhugej");
		vlp.validarLoginIncorreto("User or Password is not valid");
	}
	
	@Test
	public void testSS3() {
		vlp.navigate(baseURL);
		vlp.preencherForm("mngr307936", "bAhj");
		vlp.validarLoginIncorreto("User or Password is not valid");
	}
	
	@Test
	public void testSS4() {
		vlp.navigate(baseURL);
		vlp.preencherForm("mngr3036", "bAhj");
		vlp.validarLoginIncorreto("User or Password is not valid");
	}



}
