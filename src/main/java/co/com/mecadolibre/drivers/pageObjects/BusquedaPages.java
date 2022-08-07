package co.com.mecadolibre.drivers.pageObjects;

import org.openqa.selenium.By;

public class BusquedaPages {

    private By txtBusqueda1 = By.id("cb1-edit");
    private By btnCookiesEntendido = By.xpath("//button[contains(.,'Entendido')]");

    public By getTxtBusqueda1() {return txtBusqueda1;}

    public By getBtnCookiesEntendido() {
        return btnCookiesEntendido;
    }
}
