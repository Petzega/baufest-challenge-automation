package com.bdd.baufest.web.step;

import com.bdd.baufest.web.page.DemoblazePage;

public class DemoblazeStep {

    DemoblazePage demoblazePage = new DemoblazePage();

    public void registrarUsuario(String usuario, String clave) {
        demoblazePage.registrarUsuarioPage(usuario, clave);
    }

    public void validarRegistro() {
        demoblazePage.validarRegistroPage();
    }

    public void iniciarSesion(String usuario, String clave) {
        demoblazePage.iniciarSesionPage(usuario, clave);
    }

    public void validarInicioSesion() {
        demoblazePage.validarInicioSesionPage();
    }

    public void consultarProducto(String categoriaProducto, String producto) {
        demoblazePage.consultarProductoPage(categoriaProducto, producto);
    }

    public void agregarCarrito() {
        demoblazePage.agregarCarritoPage();
    }
    
    public void validarProductoAgregado(String producto) {
        demoblazePage.validarProductoAgregadoPage(producto);
    }
}
