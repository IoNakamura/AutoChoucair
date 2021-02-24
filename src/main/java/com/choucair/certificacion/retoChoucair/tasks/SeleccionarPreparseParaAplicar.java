package com.choucair.certificacion.retoChoucair.tasks;

import com.choucair.certificacion.retoChoucair.userInterface.PaginaEmpleos;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleccionarPreparseParaAplicar implements Task {

    private WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/div/div/h3/a"));
        new Actions(driver).moveToElement(element).click().perform();
    }

    public static SeleccionarPreparseParaAplicar enLaPaginaEmpleos(){
        return Tasks.instrumented(SeleccionarPreparseParaAplicar.class);
    }
}
