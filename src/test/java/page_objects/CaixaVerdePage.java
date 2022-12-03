package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaixaVerdePage {
    public ChromeDriver navegador;
    public Actions actions;
    private String url = "https://codepen.io/choskim/pen/RLYebL";
    private By mapGreenBox = By.className("square");

    public void abrirPagina(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdrivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        actions = new Actions(navegador);
        navegador.get(url);
        navegador.switchTo().frame(0);
    }

    public void fecharPagina(){
        navegador.quit();
        navegador = null;
    }

    public void longclick() throws InterruptedException {
        WebElement element = navegador.findElement(mapGreenBox);
        actions.clickAndHold(element).build().perform();
        Thread.sleep(1500);
        actions.moveToElement(element).release();
    }

    public int[] getGreenBox(){
        return new int[]{225, 225};
    }
}
