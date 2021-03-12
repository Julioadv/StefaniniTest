package br.com.Julio.Projeto.Stefanini;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StefaniniTest {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://prova.stefanini-jgr.com.br/teste/qa/");

		driver.manage().window().maximize();

	}

	@Test
	public void test1() throws InterruptedException {

		driver.findElement(By.id("name")).sendKeys("João da Silva");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();

		Thread.sleep(2000);

	}

	@After
	public void tearDown() throws Exception {

		Thread.sleep(2000);
	}

	@Test
	public void validarnome2() throws InterruptedException {

		driver.findElement(By.id("name")).sendKeys("J.u.d=+");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();

		Thread.sleep(2000);
	}

	@Test
	public void validaremail3() throws InterruptedException {

		driver.findElement(By.id("name")).sendKeys("João da Silva");

		driver.findElement(By.id("email")).sendKeys("@erro.er");

		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();

		Thread.sleep(2000);
		
		driver.quit();

	}

	@Test
	public void validarSenha4() throws InterruptedException {

		driver.findElement(By.id("name")).sendKeys("João da Silva");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("*******");

		driver.findElement(By.id("register")).click();

		Thread.sleep(2000);
	}

	@Test
	public void novemaisdez5() throws InterruptedException {

		driver.findElement(By.id("name")).sendKeys("João da Silva");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys("João da Silva");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();

		Thread.sleep(2000);
	}

	@Test
	public void ecluirExcluir6() throws InterruptedException {

		driver.findElement(By.id("name")).sendKeys("Jose da Silva");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();

		driver.findElement(By.id("name")).sendKeys("Joaquim da Silva");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();

		driver.findElement(By.id("name")).sendKeys("Josefa da Silva");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();

		driver.findElement(By.id("name")).sendKeys("Joas da Silva");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();	

		driver.findElement(By.id("name")).sendKeys("Janio da Silva");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();

		driver.findElement(By.id("name")).sendKeys("Jesus da Silva");

		driver.findElement(By.id("email")).sendKeys("joaosilva@gmail.com");

		driver.findElement(By.id("password")).sendKeys("********");

		driver.findElement(By.id("register")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#removeUser1")).click();
		
		driver.quit();

	}

}
