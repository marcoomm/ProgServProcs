/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasInsteadOf;

import java.io.Serializable;

/**
 *
 * @author FP
 */
public class Rectangulo implements Serializable{
    
    private double ladoCorto;
    private double ladoLargo;

    public double getLadoCorto() {
        return ladoCorto;
    }

    public void setLadoCorto(double ladoCorto) {
        this.ladoCorto = ladoCorto;
    }

    public double getLadoLargo() {
        return ladoLargo;
    }

    public void setLadoLargo(double ladoLargo) {
        this.ladoLargo = ladoLargo;
    }

    public Rectangulo(double ladoCorto, double ladoLargo) {
        this.ladoCorto = ladoCorto;
        this.ladoLargo = ladoLargo;
    }
    
    public double calcularArea() {
        return ladoLargo * ladoCorto;
    }

    public double calcularPerimetro() {
        return 2 * (ladoLargo + ladoCorto);
    }
    
}
