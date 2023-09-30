package org.qamids.figura;

public class Rectanculo extends Figura{

    private double lado1;
    private double lado2;

    public Rectanculo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calculaArea() {
        return lado1 * lado2;
    }
}
