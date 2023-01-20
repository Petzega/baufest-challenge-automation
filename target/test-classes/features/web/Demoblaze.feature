#language: es
Característica: Compras en demoblaze.com
  Como usuario
  Quiero acceder a demoblaze.com
  Para realizar compras

  Antecedentes:
    Dado que ingreso a la web de demoblaze.com

#  @registroDemoblaze
#  Esquema del escenario: Registro de usuario en demoblaze.com
#    Cuando me registre con el usuario "<usuario>" con clave "<clave>" valida
#    Entonces se realiza el registro correctamente
#      Ejemplos:
#        | usuario                   | clave                 |
#        | baufest_usuario   | user_clave        |

  @registroDemoblaze
  Esquema del escenario: Agregar un producto al carrito
    Cuando inicie sesion con el usuario "<usuario>" con clave "<clave>"
    Y consulte la categoria "<categoriaProducto>" para agregar el producto "<producto>"
    Y agregue el producto al carrito de compras
    Entonces se agrega correctamente el producto "<producto>"
    Ejemplos:
      | usuario                  | clave            | categoriaProducto | producto        |
      | baufest_usuario   | user_clave   |Laptops                     | MacBook Pro |