package org.qaminds.test;

import org.qamids.figura.Circulo;
import org.qamids.figura.Rectanculo;
import org.qamids.figura.Triangulo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiguraTest {

    @Test (description = "Validar Ciruclo")
    public void validarCacularAreaCirculo(){
        double radio =5;
        Circulo circulo = new Circulo(radio);
        double resultadoEsperado = Math.PI * radio * radio;
        Assert.assertEquals(circulo.calculaArea(), resultadoEsperado);
    }

   @Test (description = "Validar Rectangulo")
    public void validarCalcularAreaRectagulo(){
        double lado1 = 10;
        double lado2 =5;
       Rectanculo rectanculo = new Rectanculo(lado1, lado2);
       double resultadoEsperado = lado1 * lado2;
       Assert.assertEquals(rectanculo.calculaArea(), resultadoEsperado);

   }

    @Test (description = "Validar Triangulo")
    public void validarCalcularAreaTriangulo(){
        double base = 5;
        double altura =10;
        Triangulo triangulo = new Triangulo(base, altura);
        double resultadoEsperado = (base * altura) / 2;
        Assert.assertEquals(triangulo.calculaArea(), resultadoEsperado);

    }



}
