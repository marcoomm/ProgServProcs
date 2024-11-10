/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import java.io.Serializable;

/**
 *
 * @author FP
 */
public class Circulo implements Serializable{

    double radio;

    public Circulo() {
        super();
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calPer(double radio) {
        double perCirculo = 2 * Math.PI * radio;
        return perCirculo;
    }

    public double calArea(double radio) {
        double areaCirculo = Math.PI * (radio * radio);
        return areaCirculo;
    }
}
