package page_objects;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaixaVerdePage {
    public ChromeDriver navegador;
    public String url = "https://codepen.io/choskim/pen/RLYebL";
    public String mapGreenBox;

    public void abrirPagina(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdrivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.get(url);
    }

    public void fecharPagina(){
        navegador.quit();
        navegador = null;
    }

    public void longclick() {

    }

    public int[] getGreenBox(){
        return new int[]{225, 225};
    }
}
