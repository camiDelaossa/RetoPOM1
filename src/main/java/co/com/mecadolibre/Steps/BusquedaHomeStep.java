package co.com.mecadolibre.Steps;

import co.com.mecadolibre.Util.EsperaImplicita;
import co.com.mecadolibre.Util.Excel;
import co.com.mecadolibre.drivers.pageObjects.BusquedaHomePages;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;
import java.util.Map;

public class BusquedaHomeStep extends MetodosMercadoLibre{

    BusquedaHomePages pages = new BusquedaHomePages();

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Step
    public void Home(){

        try {
            leerExcel = Excel.readExcel("BusquedaLibro.xlsx","validacion home");
        }catch (Exception e) {
            e.printStackTrace();
        }

        EsperaImplicita.espera(2);
        clickear(pages.getBtnCookiesEntendido());

        moverCursor(pages.getLogo(),pages.getBtnCategoria());
        moverCursor(pages.getBtnCategoria(),pages.getBtnTecnologia());
        EsperaImplicita.espera(4);
        clickear(pages.getBtnPortatiles());
        clickear(pages.getLogoDell());
        clickear(pages.getBtnPortatilDell());
        validation(pages.getLblPortatilDell(),leerExcel.get(0).get("nombre articulo"));

        clickear(pages.getBtnHome());
        moverCursor(pages.getLogo(),pages.getBtnCategoria());
        moverCursor(pages.getBtnCategoria(),pages.getBtnTecnologia());
        EsperaImplicita.espera(4);
        clickear(pages.getBtnPortatiles());
        clickear(pages.getLogoAcer());
        clickear(pages.getBtnAcer());
        validation(pages.getLblAcer(),leerExcel.get(1).get("nombre articulo"));

        clickear(pages.getBtnHome());
        moverCursor(pages.getLogo(),pages.getBtnCategoria());
        moverCursor(pages.getBtnCategoria(),pages.getBtnTecnologia());
        EsperaImplicita.espera(4);
        clickear(pages.getBtnPortatiles());
        clickear(pages.getLogoLenovo());
        clickear(pages.getBtnLenovo());
        validation(pages.getLblLenovo(),leerExcel.get(2).get("nombre articulo"));


        clickear(pages.getBtnHome());
        moverCursor(pages.getLogo(),pages.getBtnCategoria());
        moverCursor(pages.getBtnCategoria(),pages.getBtnTecnologia());
        EsperaImplicita.espera(4);
        clickear(pages.getBtnPortatiles());
        clickear(pages.getLogoAsus());
        clickear(pages.getBtnAsus());
        validation(pages.getLblAsus(),leerExcel.get(3).get("nombre articulo"));

        clickear(pages.getBtnHome());
        moverCursor(pages.getLogo(),pages.getBtnCategoria());
        moverCursor(pages.getBtnCategoria(),pages.getBtnTecnologia());
        EsperaImplicita.espera(4);
        clickear(pages.getBtnPortatiles());
        clickear(pages.getLogoApple());
        clickear(pages.getBtnApple());
        validation(pages.getLblApple(),leerExcel.get(4).get("nombre articulo"));

    }

}
