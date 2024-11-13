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
public class Rectangulo implements Serializable{
    
    double ladoG;
    double ladoP;

    public Rectangulo() {
        super();
    }
    public Rectangulo(double ladoG, double ladoP) {
        this.ladoG = ladoG;
        this.ladoP = ladoP;
    }
    public double getLadoG() {
        return ladoG;
    }
    public void setLadoG(double ladoG) {
        this.ladoG = ladoG;
    }
    public double getLadoP() {
        return ladoP;
    }
    public void setLadoP(double ladoP) {
        this.ladoP = ladoP;
    }
    
    public double calPerimetro(double ladoG,double ladoP){
        double perimetro = 2*(ladoG+ladoP);
        return perimetro;
    }
    public double calArea(double ladoG, double ladoP){
        double area = ladoG*ladoP;
        return area;
    }
}
