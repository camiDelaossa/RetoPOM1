package co.com.mecadolibre.Steps;

import co.com.mecadolibre.Util.EsperaImplicita;
import co.com.mecadolibre.Util.Excel;
import co.com.mecadolibre.drivers.pageObjects.CategoriaPages;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;
import java.util.Map;

public class CategoriaStep extends MetodosMercadoLibre{

    CategoriaPages categoriaPages = new CategoriaPages();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Step
    public void categoria()  {

        try {
            leerExcel = Excel.readExcel("BusquedaLibro.xlsx","Validacion categoria");
        }catch (Exception e) {
            e.printStackTrace();
        }

        EsperaImplicita.espera(2);
        clickear(categoriaPages.getBtnCookiesEntendido());
        moverCursor(categoriaPages.getLogo(),categoriaPages.getBtnCategoria1());
        moverCursor(categoriaPages.getBtnCategoria1(),categoriaPages.getBtnTecnologia());
        EsperaImplicita.espera(4);
        clickear(categoriaPages.getBtnCelulares());
        EsperaImplicita.espera(2);
        clickear(categoriaPages.getBtnCelularXiaomi());
        validation(categoriaPages.getLblCelularXiaomi(),leerExcel.get(0).get("nombre articulo"));
    }

}
