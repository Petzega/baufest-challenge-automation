package com.bdd.baufest.mobile.stepDefinition;

import com.bdd.baufest.utils.DriverFactory;
import io.cucumber.java.es.*;

public class MobileStepDefinition {

    @Dado("ingreso a la aplicacion")
    public void ingresoALaAplicacion() {
        DriverFactory.startDriver();
    }
    @Cuando("me realice el registro con el usuario {string} con clave {string}")
    public void meRealiceElRegistroConElUsuarioConClave(String string, String string2) {
    }
    @Entonces("se realiza correctamente el registro")
    public void seRealizaCorrectamenteElRegistro() {
    }
}
