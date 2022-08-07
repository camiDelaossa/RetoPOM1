package co.com.mercadolibre.stepDefinitions;

import co.com.mecadolibre.Steps.CategoriaStep;
import co.com.mecadolibre.Util.Excel;
import co.com.mecadolibre.drivers.SeleniumWebDriver;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.ArrayList;
import java.util.Map;

public class CategoriaStepDefinition {

    @Steps
    CategoriaStep categoriaStep=new CategoriaStep();

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Dado("^que me encuentro sobre el boton categorias en la pagina principal$")
    public void que_me_encuentro_sobre_el_boton_categorias_en_la_pagina_principal() {
        try {
            leerExcel = Excel.readExcel("BusquedaLibro.xlsx","url");
            String url = leerExcel.get(0).get("Link");
            SeleniumWebDriver.chromeDriver(url);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Cuando("^me dirijo a tecnologia selecciono un producto$")
    public void me_dirijo_a_tecnologia_selecciono_un_producto() {
        categoriaStep.categoria();
    }

    @Entonces("^valido que corresponda el nombre del producto$")
    public void valido_que_corresponda_el_nombre_del_producto() {
        SeleniumWebDriver.driver.close();
    }

}
