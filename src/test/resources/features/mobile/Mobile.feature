#language: es
@registroDemoblaze
Característica: Interactuar con la aplicacion
  Como usuario
  Quiero a NativeDemoApp
  Para interactuar con la aplicacion

  Antecedentes:
    Dado ingreso a la aplicacion movil


  Esquema del escenario: Registro y login en la aplicacion movil
    Cuando realice el registro con el usuario "<usuario>" con clave "<clave>"
    Entonces se realiza correctamente el registro
    Cuando inicie sesion en la aplicacion con el usuario "<usuario>" con clave "<clave>"
    Entonces se inicia sesion correctamente en la aplicacion
    Ejemplos:
      | usuario                                       | clave                  |
      | baufest_user_01@test.com   | user_clave_01   |


  Escenario:  Completar formulario
    Cuando complete el formulario con los datos
      | type                            | switch | dropdownElement   |
      | prueba con appium | OFF     | Appium is awesome |
    Entonces se valida que el boton tenga el estado "active"

  @nativeDemoApp
  Escenario: Probar webview
    Cuando ingrese a la webview para buscar "browser"
    Y consulte los docs y apis
    Y me dirija hacia el footer