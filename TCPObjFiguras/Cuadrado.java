/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCPObjFiguras;

import java.io.Serializable;

/**
 *
 * @author FP
 */
public class Cuadrado implements Serializable{
    
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
    
}
