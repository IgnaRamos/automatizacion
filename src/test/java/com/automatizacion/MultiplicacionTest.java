package com.automatizacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Dependencias necesarias para desarrollar nuestro método de prueba con Junit

public class MultiplicacionTest {

    @Test                                   //anotación que indica que el siguiente método es de prueba
    public void testMultiplicacion() {      //declaración y nombre del método de prueba
        int multiplicacion = 5 * 2;         //operación atómica para la prueba 
        assertEquals(10, multiplicacion);   //Ocupamos la función assertEquals correspondiente a Junit para valiar que ambos valores sean iguales
    }

    
}
