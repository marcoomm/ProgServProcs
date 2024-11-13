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
public class Cuadrado implements Serializable{
    
    double lado;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double calPerimetro(double lado){
        double perimetro = lado*lado;
        return perimetro;
    }
    public double calArea(double lado){
        double area = lado*lado;
        return area;
    }
    
}
