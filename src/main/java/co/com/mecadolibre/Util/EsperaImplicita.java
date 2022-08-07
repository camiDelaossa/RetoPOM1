package co.com.mecadolibre.Util;

import co.com.mecadolibre.drivers.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;


public class EsperaImplicita {

    public static void espera(int segundos){
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
    }

}
