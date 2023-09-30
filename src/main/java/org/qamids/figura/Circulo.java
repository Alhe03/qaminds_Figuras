package org.qamids.figura;

public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }


    @Override
    public double calculaArea() {
        return Math.PI * radio* radio;
    }
}
