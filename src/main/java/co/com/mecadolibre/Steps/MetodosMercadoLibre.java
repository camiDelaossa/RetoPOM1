package co.com.mecadolibre.Steps;


import co.com.mecadolibre.drivers.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.assertEquals;

public class MetodosMercadoLibre {

    public void escribirMasEnter (By locator, String texto){
        SeleniumWebDriver.driver.findElement(locator).sendKeys(texto, Keys.ENTER);
    }

    public void limpiarCampos(By locator){
        SeleniumWebDriver.driver.findElement(locator).clear();
    }

    public void moverCursor(By locator1, By locator2){
        Actions action = new Actions(SeleniumWebDriver.driver);
        action.moveToElement(SeleniumWebDriver.driver.findElement(locator1)).
                moveToElement(SeleniumWebDriver.driver.findElement(locator2)).build().perform();
    }

    public void clickear(By locator){
        SeleniumWebDriver.driver.findElement(locator).click();
    }

    public void validation (By locator,String text){
        String textElement = SeleniumWebDriver.driver.findElement(locator).getText();
        assertEquals(text.trim(),textElement.trim());
    }

}
