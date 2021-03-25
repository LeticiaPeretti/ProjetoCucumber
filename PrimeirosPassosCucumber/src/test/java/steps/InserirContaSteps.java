package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;



public class InserirContaSteps {
  private WebDriver driver;
  

  @Dado("que estou acessando a aplicacao")
  public void queEstouAcessandoAAplicacao() {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  this.driver.get("https://seubarriga.wcaquino.me/logout"); 
 
}
  @Quando("informo o usuario {string}")
  public void informoOUsuario(String usuario) {
    this.driver.findElement(By.id("email")).sendKeys(usuario);
  }
  @Quando("a senha {string}")
  public void aSenha(String senha) {
    this.driver.findElement(By.id("senha")).sendKeys(senha);
  }
  @Quando("seleciono entrar")
  public void selecionoEntrar() {
      
  }
  @Entao("visualizo a pagina inicial")
  public void visualizoAPaginaInicial() {
      
  }
  @Quando("seleciono Contas")
  public void selecionoContas() {
      
  }
  @Quando("seleciono Adicionar")
  public void selecionoAdicionar() {
    
  }
  @Quando("informo a conta {string}")
  public void informoAConta(String string) {
      
  }
  @Quando("seleciono Salvar")
  public void selecionoSalvar() {
    
  }
  @Entao("a conta e inserida com sucesso")
  public void aContaEInseridaComSucesso() {
    
  }
  
}
