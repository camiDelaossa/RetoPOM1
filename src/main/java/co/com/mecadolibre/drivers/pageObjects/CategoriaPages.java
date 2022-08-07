package co.com.mecadolibre.drivers.pageObjects;

import org.openqa.selenium.By;

public class CategoriaPages {

    private  By logo = By.xpath("//a[contains(text(),'Mercado Libre Colombia - Donde comprar y vender de todo')]");
    private By btnCategoria1 = By.xpath("//a[@class='nav-menu-categories-link']");
    private By btnTecnologia = By.xpath("//a[contains(@data-order,'0')]");
    private By btnCelulares = By.xpath("//a[@href='https://celulares.mercadolibre.com.co/#menu=categories']");
    private By btnCelularXiaomi = By.xpath("(//a[@title='Xiaomi Pocophone M4 Pro 5G Dual SIM 128 GB power black 6 GB RAM'])[1]");
    private By btnCookiesEntendido = By.xpath("//button[contains(.,'Entendido')]");
    private By lblCelularXiaomi = By.xpath("//h1[contains(text(),'Xiaomi Pocophone M4 Pro 5G Dual SIM 128 GB power black 6 GB RAM')]");

    public By getLogo() {
        return logo;
    }

    public By getBtnCategoria1() {
        return btnCategoria1;
    }

    public By getBtnTecnologia() {
        return btnTecnologia;
    }

    public By getBtnCelulares() {
        return btnCelulares;
    }

    public By getBtnCelularXiaomi() {
        return btnCelularXiaomi;
    }

    public By getBtnCookiesEntendido() {
        return btnCookiesEntendido;
    }

    public By getLblCelularXiaomi() {
        return lblCelularXiaomi;
    }
}