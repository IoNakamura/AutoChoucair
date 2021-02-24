package com.choucair.certificacion.retoChoucair.stepDefinitions;

import com.choucair.certificacion.retoChoucair.questions.VerificarPaginaEmpleos;
import com.choucair.certificacion.retoChoucair.tasks.AbrirPagina;
import com.choucair.certificacion.retoChoucair.tasks.SeleccionarEmpleos;
import com.choucair.certificacion.retoChoucair.tasks.SeleccionarPreparseParaAplicar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class EntrarPreparParaAplicarStepDefinition {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Carlos");
    }

    @Dado("^que Carlos ingreso a la página de Choucair$")
    public void queCarlosIngresoALaPáginaDeChoucair() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AbrirPagina.enChrome());
    }

    @Cuando ("^el intenta entrar a la pagina de Empleos$")
    public void elIntentaEntrarALaPaginaDeEmpleos() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarEmpleos.delBanerSuperiorDeLaPagina());
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPreparseParaAplicar.enLaPaginaEmpleos());
    }

    @Entonces("^el debera ver el texto (.*)$")
    public void elDeberaVerElTextoPREPARARSEPARAAPLICAR(String elMensajeEsperado) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarPaginaEmpleos.deLaPaginaChoucair(elMensajeEsperado)));
    }

}
