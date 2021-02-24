package com.choucair.certificacion.retoChoucair.tasks;

import static com.choucair.certificacion.retoChoucair.userInterface.PaginaInicial.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarEmpleos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_EMPLEOS));
    }

    public static SeleccionarEmpleos delBanerSuperiorDeLaPagina(){
        return Tasks.instrumented(SeleccionarEmpleos.class);
    }
}
