package gamemania;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLoginGameMania {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
	public void testeNavegador() {
		driver.get("http://localhost:4200/login");
		
				
		WebElement inputEmail = driver.findElement(By.id("login-site"));
		WebElement inputSenha = driver.findElement(By.id("login-site"));
		WebElement botaoLogin = driver.findElement(By.id("login-site"));
		
		
		String[] listaSenhas = 	{"senhaum", "outrasenha", "senhaerrada", "Johnny"};
		for(int tentativas = 0; tentativas < listaSenhas.length; tentativas ++) {
			
		
			try {
			inputEmail.clear();
			inputSenha.clear();
			
			inputEmail.sendKeys("afraniodimasdasilva@gmail.com");
			inputSenha.sendKeys("listaSenhas[tentativas]");
			botaoLogin.click();
			
			Thread.sleep(3000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
			
	}
}

		
	   	
 	
		
