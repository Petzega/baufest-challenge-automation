#language: es
@registroDemoblaze
Característica: Interactuar con la aplicacion
  Como usuario
  Quiero a NativeDemoApp
  Para interactuar con la aplicacion

  @nativeDemoApp
  Esquema del escenario: Registro y login en la aplicacion
    Dado ingreso a la aplicacion
    Cuando me realice el registro con el usuario "<usuario>" con clave "<clave>"
    Entonces se realiza correctamente el registro
    Ejemplos:
      | usuario                                       | clave              | categoriaProducto | producto        |
      | baufest_user_01@test.com   | user_clave_01   |Laptops                     | MacBook Pro |