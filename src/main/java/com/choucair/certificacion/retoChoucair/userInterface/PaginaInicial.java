package com.choucair.certificacion.retoChoucair.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial {

    public static final Target BTN_EMPLEOS =
        Target.the("Boton Empleos del baner superior de la pagina").located(By.id("menu-item-550"));

    public static final Target BTN_ACEPTAR =
        Target.the("Boton aceptar del cookie").located(By.id("cookie_action_close_header"));
}
