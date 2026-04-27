package com.automatizacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Dependencias necesarias para desarrollar nuestro método de prueba con Junit

public class TextosIgualesTest {

    @Test                               //anotación que indica que el siguiente método es de prueba
    public void testTextosIguales() {   //declaración y nombre del método de prueba
        String texto1 = "Prueba";       //operación atómica para la prueba 
        String texto2 = "Prueba";       
        assertEquals(texto1, texto2);   //Ocupamos la función assertEquals correspondiente a Junit para valiar que ambos valores sean iguales
    }

    
}
