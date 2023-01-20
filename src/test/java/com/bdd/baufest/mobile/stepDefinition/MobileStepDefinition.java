package com.bdd.baufest.mobile.stepDefinition;

import com.bdd.baufest.mobile.step.MobileStep;
import com.bdd.baufest.utils.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;

public class MobileStepDefinition {

    MobileStep mobileStep = new MobileStep();

    @Dado("ingreso a la aplicacion movil")
    public void ingresoALaAplicacionMovil() {
        DriverFactory.startDriver();
    }
    @Cuando("realice el registro con el usuario {string} con clave {string}")
    public void realiceElRegistroConElUsuarioConClave(String usuario, String clave) {
        mobileStep.registrarUsuario(usuario, clave);
    }
    @Entonces("se realiza correctamente el registro")
    public void seRealizaCorrectamenteElRegistro() {
        mobileStep.validarRegistro();
    }

    @Cuando("inicie sesion en la aplicacion con el usuario {string} con clave {string}")
    public void inicieSesionEnLaAplicacionConElUsuarioConClave(String usuario, String clave) {
        mobileStep.iniciarSesion(usuario, clave);
    }
    @Entonces("se inicia sesion correctamente en la aplicacion")
    public void seIniciaSesionCorrectamenteEnLaAplicacion() {
        mobileStep.validarInicioSesion();
    }

    @Cuando("complete el formulario con los datos")
    public void completeElFormularioConLosDatos(DataTable dataTable) {
        mobileStep.completarFormulario(dataTable);
    }
    @Entonces("se valida que el boton tenga el estado {string}")
    public void seValidaQueElBotonTengaElEstado(String estado) {
        mobileStep.validarBoton(estado);
    }
}
