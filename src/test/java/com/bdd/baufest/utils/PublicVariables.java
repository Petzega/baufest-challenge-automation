package com.bdd.baufest.utils;

public class PublicVariables {

    public static String USUARIO = "";
    public static String CATEGORIA_PRODUCTO;

    public static String getCategoriaProducto() {
        return CATEGORIA_PRODUCTO;
    }

    public static void setCategoriaProducto(String categoriaProducto) {
        CATEGORIA_PRODUCTO = categoriaProducto;
    }
}
