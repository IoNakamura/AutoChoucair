package com.choucair.certificacion.retoChoucair.questions;

import com.choucair.certificacion.retoChoucair.userInterface.PaginaEmpleos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerificarPaginaEmpleos implements Question<Boolean> {

    private String elMensajeEsperado;

    public VerificarPaginaEmpleos(String elMensajeEsperado) {
        this.elMensajeEsperado = elMensajeEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Visibility.of(PaginaEmpleos.LBL_PREPARSE_PARA_APLICAR).viewedBy(actor);
        String laRespuestaEs = PaginaEmpleos.LBL_PREPARSE_PARA_APLICAR.resolveFor(actor).getText();
        return laRespuestaEs.contains(elMensajeEsperado);
    }

    public static VerificarPaginaEmpleos deLaPaginaChoucair(String laRespuestaEs){
        return new VerificarPaginaEmpleos(laRespuestaEs);
    }
}
