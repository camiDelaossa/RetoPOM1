package co.com.mecadolibre.drivers.pageObjects;

import org.openqa.selenium.By;

public class BusquedaHomePages {

    private By btnCookiesEntendido = By.xpath("//button[contains(.,'Entendido')]");
    private By btnHome = By.className("nav-logo");

    private  By logo = By.xpath("//a[contains(text(),'Mercado Libre Colombia - Donde comprar y vender de todo')]");
    private By btnCategoria = By.xpath("//a[@class='nav-menu-categories-link']");
    private By btnTecnologia = By.xpath("//a[contains(@data-order,'0')]");
    private By btnPortatiles = By.xpath("//a[@href='https://computacion.mercadolibre.com.co/portatiles/#menu=categories']");

    private By logoDell = By.xpath("(//a[@aria-label='Dell'])[1]");
    private By btnPortatilDell = By.xpath("//h2[contains(text(),'Portátil Dell 3505 Ryzen 5 3450u 16gb Ssd 256+1tb 15.6 Win10')]");
    private By lblPortatilDell = By.xpath("//h1[contains(text(),'Portátil Dell 3505 Ryzen 5 3450u 16gb Ssd 256+1tb 15.6 Win10')]");

    private By logoAcer = By.xpath("(//a[@aria-label='Acer'])[1]");
    private By btnAcer = By.xpath("//h2[contains(text(),'Portátil Acer Nitro Ci5')]");
    private By lblAcer =By.xpath("//h1[contains(text(),'Portátil Acer Nitro Ci5')]");

    private By logoLenovo = By.xpath("(//a[@aria-label='Lenovo'])[1]");
    private By btnLenovo = By.xpath("//h2[contains(text(),'Portátil Lenovo E41-55 Ryzen 3-3250u  8gb Ssd 256gb 14')]");
    private By lblLenovo = By.xpath("//h1[contains(text(),'Portátil Lenovo E41-55 Ryzen 3-3250u  8gb Ssd 256gb 14')]");

    private By logoAsus =By.xpath("(//a[@aria-label='Asus'])[1]");
    private By btnAsus = By.xpath("//h2[contains(text(),'Portatil Asus Amd')]");
    private By lblAsus = By.xpath("//h1[contains(text(),'Portatil Asus Amd Ryzen 5')]");

    private By logoApple =By.xpath("(//a[@aria-label='Apple'])[1]");
    private By btnApple = By.xpath("//h2[contains(text(),'Apple MacBook Pro (13 pulgadas, 2020, Chip M1, 512 GB de SSD, 8 GB de RAM) - Gris espacial')]");
    private By lblApple = By.xpath("//h1[contains(text(),'Apple MacBook Pro (13 pulgadas, 2020, Chip M1, 512 GB de SSD, 8 GB de RAM) - Gris espacial')]");

    public By getBtnCookiesEntendido() {
        return btnCookiesEntendido;
    }

    public By getLogo() {
        return logo;
    }

    public By getBtnHome() {
        return btnHome;
    }

    public By getBtnCategoria() {
        return btnCategoria;
    }

    public By getBtnTecnologia() {
        return btnTecnologia;
    }

    public By getBtnPortatiles() {
        return btnPortatiles;
    }

    public By getLogoDell() {
        return logoDell;
    }

    public By getBtnPortatilDell() {
        return btnPortatilDell;
    }

    public By getLblPortatilDell() {
        return lblPortatilDell;
    }

    public By getLogoAcer() {
        return logoAcer;
    }

    public By getBtnAcer() {
        return btnAcer;
    }

    public By getLblAcer() {
        return lblAcer;
    }

    public By getLogoLenovo() {
        return logoLenovo;
    }

    public By getBtnLenovo() {
        return btnLenovo;
    }

    public By getLblLenovo() {
        return lblLenovo;
    }

    public By getLogoAsus() {
        return logoAsus;
    }

    public By getBtnAsus() {
        return btnAsus;
    }

    public By getLblAsus() {
        return lblAsus;
    }

    public By getLogoApple() {
        return logoApple;
    }

    public By getBtnApple() {
        return btnApple;
    }

    public By getLblApple() {
        return lblApple;
    }
}
