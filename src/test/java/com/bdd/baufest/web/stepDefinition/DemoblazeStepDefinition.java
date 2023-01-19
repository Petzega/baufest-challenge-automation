package com.bdd.baufest.web.stepDefinition;

import com.bdd.baufest.utils.DriverFactory;
import com.bdd.baufest.web.step.DemoblazeStep;
import io.cucumber.java.es.*;

public class DemoblazeStepDefinition {

    DemoblazeStep demoblazeStep = new DemoblazeStep();

    @Dado("que ingreso a la web de demoblaze.com")
    public void queIngresoALaWebDeDemoblazeCom() {
        DriverFactory.startWeb();
    }
    @Cuando("me registre con el usuario {string} con clave {string} valida")
    public void meRegistreConUsuarioBaufestUserConUserPassValida(String usuario, String clave) {
        demoblazeStep.registrarUsuario(usuario, clave);
    }
    @Entonces("se realiza el registro correctamente")
    public void seRealizaElRegistroCorrectamente() {
        demoblazeStep.validarRegistro();
    }

    @Cuando("inicie sesion con el usuario {string} con clave {string}")
    public void inicieSesionCon(String usuario, String clave) {
        demoblazeStep.iniciarSesion(usuario, clave);
        demoblazeStep.validarInicioSesion();
    }

    @Y("consulte la categoria {string} para agregar el producto {string}")
    public void consulteLaCategoriaParaAgregarElProducto(String categoriaProducto, String producto) {
        demoblazeStep.consultarProducto(categoriaProducto, producto);
    }

    @Y("agregue el producto al carrito de compras")
    public void agregueElProductoAlCarritoDeCompras() {
        demoblazeStep.agregarCarrito();
    }

    @Entonces("se agrega correctamente el producto {string}")
    public void seAgregaCorrectamenteElProducto(String producto) {
        demoblazeStep.validarProductoAgregado(producto);
    }
}
