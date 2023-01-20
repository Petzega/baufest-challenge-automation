package com.bdd.baufest.mobile.page;

import com.bdd.baufest.mobile.locator.MobileLocators;
import com.bdd.baufest.utils.AndroidUtils;
import com.bdd.baufest.utils.DriverFactory;
import com.bdd.baufest.utils.PublicVariables;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MobilePage extends AndroidUtils {

    public void registrarUsuarioPage(String usuario, String clave) {
        doClickElement(10, MobileLocators.NAV_OPTION_LOGIN);
        doClickElement(10, MobileLocators.OPTION_SIGN_UP);
        setTextElement(10, MobileLocators.INPUT_SIGN_UP_EMAIL, usuario);
        setTextElement(10, MobileLocators.INPUT_SIGN_UP_PASSWORD, clave);
        setTextElement(10, MobileLocators.INPUT_SIGN_UP_PASSWORD_CONFIRM, clave);
        doClickElement(10, MobileLocators.BUTTON_SIGN_UP);
    }

    public void validarRegistroPage() {
        assertText(10, MobileLocators.LABEL_SIGNED_UP, "Signed Up!");
        doClickElement(10, MobileLocators.BUTTON_SIGNED_UP);
    }

    public void iniciarSesionPage(String usuario, String clave) {
        doClickElement(10, MobileLocators.NAV_OPTION_LOGIN);
        doClickElement(10, MobileLocators.OPTION_LOGIN);
        setTextElement(10, MobileLocators.INPUT_LOGIN_EMAIL, usuario);
        setTextElement(10, MobileLocators.INPUT_LOGIN_PASSWORD, clave);
        doClickElement(10, MobileLocators.BUTTON_LOGIN);
    }

    public void validarInicioSesionPage() {
        assertText(10, MobileLocators.LABEL_LOGGED_IN, "Success");
        doClickElement(10, MobileLocators.BUTTON_LOGGED_IN);
    }

    public void completarFormularioPage(DataTable dataTable) {
        doClickElement(10, MobileLocators.NAV_OPTION_FORMS);
        setTextElement(10, MobileLocators.INPUT_TYPE_SOMETHING, getDataTable(dataTable, "type"));
        assertText(10, MobileLocators.TEXTVIEW_TYPED, getDataTable(dataTable, "type"));
        doClickElement(10, MobileLocators.SWITCH);
        assertContainsText(10, MobileLocators.SWITCH_STATUS, getDataTable(dataTable, "switch"));
        doClickElement(10, MobileLocators.DROPDOWN);
        doClickElement(10, MobileLocators.DROPDOWN_ELEMENT(getDataTable(dataTable, "dropdownElement")));
        doClickElement(10, MobileLocators.BUTTON_ACTIVE);
    }

    public void validarBotonPage(String estado) {
        assertContainsText(10, MobileLocators.BUTTON_STATUS, estado);
        doClickElement(10, MobileLocators.BUTTON_ACTIVATED);
    }

    public void interactuarWebviewPage(String busqueda) {
        doClickElement(10, MobileLocators.NAV_OPTION_WEBVIEW);
        doWaitVisibiliTyOfElementLocated(10, MobileLocators.WEBVIEW);
        contextWebview();
        doClickElement(10, MobileLocators.BUTTON_SEARCH);
        setTextElement(10, MobileLocators.INPUT_SEARCH, busqueda);
        doClickElement(10, MobileLocators.BUTTON_CANCEL);
    }

    public void elementosWebViewPage() {
        doClickElement(10, MobileLocators.NAV_BAR);
        doClickElement(10, MobileLocators.OPTION_DOCS);
        doClickElement(10, MobileLocators.NAV_BAR);
        doClickElement(10, MobileLocators.BACK_TO_MENU);
        doClickElement(10, MobileLocators.OPTION_API);
        doClickElement(10, MobileLocators.NAV_BAR);
        doSleep(1000);
        doClickElement(10, MobileLocators.BACK_TO_MENU);
        doClickElement(10, MobileLocators.HOME_APK);
    }

    public void elementosFooterWebViewPage() {
        doVerticalSwipeToElement(doWaitVisibiliTyOfElementLocated(10, MobileLocators.P_TEXT), doWaitVisibiliTyOfElementLocated(10, MobileLocators.NAV_BAR));
        doVerticalSwipeToElement(doWaitVisibiliTyOfElementLocated(10, MobileLocators.H3_TEXT), doWaitVisibiliTyOfElementLocated(10, MobileLocators.NAV_BAR));
        doVerticalSwipeToElement(doWaitVisibiliTyOfElementLocated(10, MobileLocators.H3_TEXT_1), doWaitVisibiliTyOfElementLocated(10, MobileLocators.NAV_BAR));
        doVerticalSwipeToElement(doWaitVisibiliTyOfElementLocated(10, MobileLocators.H3_TEXT_2), doWaitVisibiliTyOfElementLocated(10, MobileLocators.NAV_BAR));
    }
}
