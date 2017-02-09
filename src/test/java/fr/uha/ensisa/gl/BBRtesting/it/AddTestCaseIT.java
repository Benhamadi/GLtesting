package fr.uha.ensisa.gl.BBRtesting.it;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class AddTestCaseIT extends TestCase {
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://localhost:9899/BBR-testing/AjoutTest.jsp");
	}
	
	@Test
	public void testInsertEtape()
	{
		driver.findElement(By.name("titre")).clear();
		driver.findElement(By.name("titre")).sendKeys("Operateur 1");
		driver.findElement(By.name("describe")).clear();
		driver.findElement(By.name("describe")).sendKeys("appuyer sur +");
		driver.findElement(By.name("id")).clear();
		driver.findElement(By.name("id")).sendKeys("1");
		driver.findElement(By.name("Envoyer")).click();
		assertEquals(2,driver.findElement(By.id("etapes")).findElements(By.tagName("tr")).size());	
		driver.close();
	}
	
	@Test
	public void testDeleteEtape()
	{
		driver.findElement(By.name("titre")).clear();
		driver.findElement(By.name("titre")).sendKeys("Operateur 1");
		driver.findElement(By.name("describe")).clear();
		driver.findElement(By.name("describe")).sendKeys("appuyer sur +");
		driver.findElement(By.name("id")).clear();
		driver.findElement(By.name("id")).sendKeys("1");
		System.out.println(driver.findElement(By.id("etapes")).findElements(By.tagName("tr")).size());
		driver.findElement(By.name("Envoyer")).click();
		driver.findElement(By.id("delete")).click();
		driver.get("http://localhost:9899/BBR-testing/AjoutTest.jsp");
		System.out.println(driver.findElement(By.id("etapes")).findElements(By.tagName("tr")).size());
		assertEquals(1, driver.findElement(By.id("etapes")).findElements(By.tagName("tr")).size());
	}

}
