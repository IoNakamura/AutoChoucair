package com.choucair.certificacion.retoChoucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/entrar_preparar_para_aplicar.feature"},
        glue = {"com.choucair.certificacion.retoChoucair.stepDefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class EntrarPreparParaAplicar {
}
