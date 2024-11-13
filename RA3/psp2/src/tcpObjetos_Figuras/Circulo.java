/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcpObjetos_Figuras;

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
    
    public double calPerimetro(double radio){    
        double perimetro = Math.PI*2*radio;
        return perimetro;
    }
    public double calArea(double radio){
        double area = Math.PI*Math.pow(radio, 2);
        return area;
    }
    
}
