package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GreenFramePage {
    public FirefoxDriver browser;
    public Actions actions;
    private final String url = "https://codepen.io/choskim/pen/RLYebL";
    private By mapSquare = By.className("square");
    public int webBrowserFrame = 0;
    public int timeLongClick = 1500;

    public void openPage() {
        System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\webdrivers\\geckodriver.exe");
        browser = new FirefoxDriver();
        actions = new Actions(browser);
        browser.get(url);
        browser.switchTo().frame(webBrowserFrame);
    }

    public void longClick() throws InterruptedException {
        WebElement element = browser.findElement(mapSquare);
        actions.clickAndHold(element).build().perform();
        Thread.sleep(timeLongClick);
        actions.moveToElement(element).release();
    }

    public int[] getSquareSize() {
        Dimension size = browser.findElement(mapSquare).getSize();
        return new int[]{size.height, size.width};
    }

    public void closePage() {
        browser.quit();
        browser = null;
    }
}