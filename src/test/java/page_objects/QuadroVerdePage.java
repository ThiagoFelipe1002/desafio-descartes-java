package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class QuadroVerdePage {

    public FirefoxDriver navegador;
    public Actions actions;
    private String url = "https://codepen.io/choskim/pen/RLYebL";
    private By mapQuadroVerde = By.className("square");
    public int TimeLongClick = 1500;
    public int WebBrowserFrame = 0;


    public void abrirPagina() {
        System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\webdrivers\\geckodriver.exe");
        navegador = new FirefoxDriver();
        actions = new Actions(navegador);
        navegador.get(url);
        navegador.switchTo().frame(WebBrowserFrame);
    }

    public void fecharPagina() {
        navegador.quit();
        navegador = null;
    }

    public void longclick() throws InterruptedException {
        WebElement element = navegador.findElement(mapQuadroVerde);
        actions.clickAndHold(element).build().perform();
        Thread.sleep(TimeLongClick);
        actions.moveToElement(element).release();
    }

    public int[] getSizeQuadroVerde() {
        Dimension tamanho = navegador.findElement(mapQuadroVerde).getSize();
        return new int[]{tamanho.height, tamanho.width};
    }
}