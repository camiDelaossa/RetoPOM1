package co.com.mercadolibre.stepDefinitions;

import co.com.mecadolibre.Steps.BusquedaHomeStep;
import co.com.mecadolibre.Util.Excel;
import co.com.mecadolibre.drivers.SeleniumWebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.ArrayList;
import java.util.Map;

public class HomeStepDefinition {

    @Steps
    BusquedaHomeStep busquedaHomeStep = new BusquedaHomeStep();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Given("^que estoy en el home de mercado libre$")
    public void que_estoy_en_el_home_de_mercado_libre() {
        try {
            leerExcel = Excel.readExcel("BusquedaLibro.xlsx","url");
            String url = leerExcel.get(0).get("Link");
            SeleniumWebDriver.chromeDriver(url);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    @When("^selecciono un producto de la categoria$")
    public void selecciono_un_producto_de_la_categoria()  {
        busquedaHomeStep.Home();
    }

    @Then("^valido que corresponda el nombre del producto y regreso a la pagina principal$")
    public void valido_que_corresponda_el_nombre_del_producto_y_regreso_a_la_pagina_principal() {
        SeleniumWebDriver.driver.close();

    }
}
