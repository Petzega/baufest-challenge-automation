package com.bdd.baufest.web.page;

import com.bdd.baufest.utils.PublicVariables;
import com.bdd.baufest.utils.WebUtils;
import com.bdd.baufest.web.locator.DemoblazeLocators;
import org.testng.Assert;

public class DemoblazePage extends WebUtils {

    public void registrarUsuarioPage(String usuario, String clave) {
        doClickElement(10, DemoblazeLocators.OPTION_SIGN_UP);
        setTextElement(10, DemoblazeLocators.INPUT_SIGN_UP_USERNAME, usuario);
        setTextElement(10, DemoblazeLocators.INPUT_SIGN_UP_PASSWORD, clave);
        doClickElement(10, DemoblazeLocators.BUTTON_SIGN_UP);
        doSleep(1500);
    }

    public void validarRegistroPage() {
        Assert.assertEquals(handleAlert().getText(), "Sign up successful.");
        handleAlert().accept();
    }

    public void iniciarSesionPage(String usuario, String clave) {
        PublicVariables.USUARIO = usuario;
        doClickElement(10, DemoblazeLocators.OPTION_LOG_IN);
        setTextElement(10, DemoblazeLocators.INPUT_LOG_IN_USERNAME, usuario);
        setTextElement(10, DemoblazeLocators.INPUT_LOG_IN_PASSWORD, clave);
        doClickElement(10, DemoblazeLocators.BUTTON_LOG_IN);
    }

    public void validarInicioSesionPage() {
        Assert.assertEquals(getTextElement(10, DemoblazeLocators.LABEL_USER_LOG_IN), "Welcome " + PublicVariables.USUARIO);
    }

    public void consultarProductoPage(String categoriaProducto, String producto) {
        PublicVariables.setCategoriaProducto(producto);
        doClickElement(10, DemoblazeLocators.OPTION_CATEGORY(categoriaProducto));
        doScrollToElement(10, DemoblazeLocators.OPTION_PRODUCT(producto));
        doClickElement(10, DemoblazeLocators.OPTION_PRODUCT(producto));
    }

    public void agregarCarritoPage() {
        doClickElement(10, DemoblazeLocators.BUTTON_ADD_TO_CART);
        doSleep(1500);
        Assert.assertEquals(handleAlert().getText(), "Product added.");
        handleAlert().accept();
    }

    public void validarProductoAgregadoPage(String producto) {
        doClickElement(10, DemoblazeLocators.OPTION_CART);
        doSleep(1500);
        System.out.println(PublicVariables.getCategoriaProducto());
        Assert.assertEquals(getTextElement(10, DemoblazeLocators.LABEL_PRODUCT_ADDED(producto)), producto);
    }
}
