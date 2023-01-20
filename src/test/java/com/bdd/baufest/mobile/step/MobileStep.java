package com.bdd.baufest.mobile.step;

import com.bdd.baufest.mobile.page.MobilePage;
import io.cucumber.datatable.DataTable;

public class MobileStep {

    MobilePage mobilePage = new MobilePage();
    public void registrarUsuario(String usuario, String clave) {
        mobilePage.registrarUsuarioPage(usuario, clave);
    }

    public void iniciarSesion(String usuario, String clave) {
        mobilePage.iniciarSesionPage(usuario, clave);
    }

    public void completarFormulario(DataTable dataTable) {
        mobilePage.completarFormularioPage(dataTable);
    }

    public void validarRegistro() {
        mobilePage.validarRegistroPage();
    }

    public void validarInicioSesion() {
        mobilePage.validarInicioSesionPage();
    }

    public void validarBoton(String estado) {
        mobilePage.validarBotonPage(estado);
    }

    public void interactuarWebview(String busqueda) {
        mobilePage.interactuarWebviewPage(busqueda);
    }

    public void consultarDocsApis() {
        mobilePage.elementosWebViewPage();
    }

    public void redireccionFooter() {
        mobilePage.elementosFooterWebViewPage();
    }
}
