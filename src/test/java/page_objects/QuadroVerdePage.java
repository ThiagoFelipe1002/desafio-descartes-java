package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class QuadroVerdePage {

//  public ChromeDriver navegador;
    public FirefoxDriver navegador;
    public Actions actions;
    private String url = "https://codepen.io/choskim/pen/RLYebL";
    private By mapQuadroVerde = By.className("square");

    public void abrirPagina(){
//        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdrivers\\chromedriver.exe");
//        navegador = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver",  "src\\test\\resources\\webdrivers\\geckodriver.exe");
        navegador = new FirefoxDriver();
        actions = new Actions(navegador);
        navegador.get(url);
        navegador.switchTo().frame(0); //"sub-pagina"
    }

    public void fecharPagina(){
        navegador.quit();
        navegador = null;
    }

    public void longclick() throws InterruptedException {
        WebElement element = navegador.findElement(mapQuadroVerde);
        actions.clickAndHold(element).build().perform();
        Thread.sleep(1500);
        actions.moveToElement(element).release();
    }

    public int[] getSizeQuadroVerde(){
        Dimension tamanho = navegador.findElement(mapQuadroVerde).getSize();
        return new int[]{tamanho.height, tamanho.width};
    }
}
