package co.com.mercadolibre.stepDefinitions;

import co.com.mecadolibre.Steps.MercadoLibreStep;
import co.com.mecadolibre.Util.Excel;
import co.com.mecadolibre.drivers.SeleniumWebDriver;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.ArrayList;
import java.util.Map;

public class BusquedaStepDefintion {

    @Steps
    MercadoLibreStep mercadoLibreStep = new MercadoLibreStep();

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Dado("^que estoy la pagina principal de mercadolibre$")
    public void que_estoy_la_pagina_principal_de_mercadolibre()  {
        try {
            leerExcel = Excel.readExcel("BusquedaLibro.xlsx","url");
            String url = leerExcel.get(0).get("Link");
            SeleniumWebDriver.chromeDriver(url);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Cuando("^ingreso los productos que deseo buscar$")
    public void ingreso_los_productos_que_deseo_buscar() {
        mercadoLibreStep.busquedaproducto();
    }

    @Entonces("^se muestra el resultado$")
    public void se_muestra_el_resultado() {
        SeleniumWebDriver.driver.close();
    }
}
