package co.com.mecadolibre.Steps;

import co.com.mecadolibre.Util.EsperaImplicita;
import co.com.mecadolibre.Util.Excel;
import co.com.mecadolibre.drivers.pageObjects.BusquedaPages;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;
import java.util.Map;

public class MercadoLibreStep extends MetodosMercadoLibre {

    BusquedaPages busquedaPages = new BusquedaPages();

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Step
    public void busquedaproducto(){
        try {
            leerExcel = Excel.readExcel("BusquedaLibro.xlsx","Buscar");
        }catch (Exception e){e.printStackTrace();
        }
        clickear(busquedaPages.getBtnCookiesEntendido());
        for (int i = 0; i< leerExcel.size(); i++){
            escribirMasEnter(busquedaPages.getTxtBusqueda1(),leerExcel.get(i).get("Buscar"));
            limpiarCampos(busquedaPages.getTxtBusqueda1());
        }
    }

}
