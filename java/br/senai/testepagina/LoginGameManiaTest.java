package br.senai.testepagina;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGameManiaTest {

	private WebDriver driver;
	
	@Before
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void LoginTest() throws InterruptedException {
		
		// ******************  CADASTRO DE USU�RIO ********************
		
		 //Acesso � url da p�gina hospedada no servidor local
		 driver.get("http://localhost:4200/");
		
		 //Clica no �cone de login na p�gina inicial
		 driver.findElement(By.className("login-icon")).click();
		 
		 //Clica no bot�o para cadastrar
		 driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/div[2]/div[2]/div/p[2]/a")).click();
		 
		 //Espera por 3 segundos
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
		 //Registra dados de um usu�rio fict�cio nos campos.
		 driver.findElement(By.name("cpf")).sendKeys("000.000.000-00");
		
		 
		 driver.findElement(By.name("nome")).sendKeys("Gleyce");
		
		 
		 driver.findElement(By.name("endereco")).sendKeys("Rua xxxxx, n� xxx");
		
		 
		 driver.findElement(By.name("email")).sendKeys("gleyce@gmail.com");
		
		 
		 driver.findElement(By.name("cel")).sendKeys("(xx)xxxxx-xxxx");
		 
		 
		 driver.findElement(By.name("senha")).sendKeys("1234");
		 
		 //Espera por 2 segundos
		 Thread.sleep(2000);
		  
		 //Rola a p�gina para baixo com a finalidade de achar o bot�o cadastrar
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("scroll(0, 350);");
		
		 //Clica no bot�o cadastrar para salvar
		 driver.findElement(By.xpath("/html/body/app-root/app-cadastro-create/section/form/div/div[7]/div/div[1]")).click();
		
		 //Espera por 4 segundos
		 Thread.sleep(4000);
		
		 
		// ******************  LOGIN DE USU�RIO ********************
		 
		//Insere o email de usu�rio cadastrado 
		driver.findElement(By.id("email-field")).sendKeys("gleyce@gmail.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Insere a senha de usu�rio cadastrado
		driver.findElement(By.id("password-field")).sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Clica no bot�o continuar para fazer o login
		driver.findElement(By.id("go-button")).click();
		
		//Localiza elemento mensagem de sucesso
		WebElement mensagemSucesso = driver.findElement(By.id("message-success"));
		
		//Exibe mensagem no console
		System.out.println(mensagemSucesso.getText());
		
		
	}
	
	@After
	public void quit() throws InterruptedException {
		
		//Espera por 5 segundos para fazer o logout
		Thread.sleep(5000);

		//Clica no bot�o logout
		driver.findElement(By.xpath("/html/body/app-root/app-header/header/div/div[2]/div[2]/div/p[2]/a")).click();
		
		//Clica no bot�o de login da p�gina inicial para mostrar que usu�rio n�o est� mais logado
		driver.findElement(By.className("login-icon")).click();
		
	}
}
