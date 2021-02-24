package com.choucair.certificacion.retoChoucair.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaEmpleos extends PageObject {

    public static final Target BTN_PREPARSE_PARA_APLICAR =
            Target.the("Boton PREPARSE PARA APLICAR").located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/div/div/h3/a"));

    public static final Target LBL_PREPARSE_PARA_APLICAR =
            Target.the("label para validar que el boton este realizando su correcto funcionamiento").located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[9]/div/div/div/div/div/div[3]/div/h2"));

}