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
public class Rectangulo implements Serializable{

    double lagoG;
    double ladoP;

    public Rectangulo() {
        super();
    }

    public Rectangulo(double lagoG, double ladoP) {
        this.lagoG = lagoG;
        this.ladoP = ladoP;
    }

    public double getLadoG() {
        return lagoG;
    }

    public void setLadoG(double lagoG) {
        this.lagoG = lagoG;
    }

    public double getLadoP() {
        return ladoP;
    }

    public void setLadoP(double ladoP) {
        this.ladoP = ladoP;
    }

    public double calPer(double lagoG, double ladoP) {
        double perRectangulo = (ladoP * 2) + (lagoG * 2);
        return perRectangulo;
    }

    public double calArea(double lagoG, double ladoP) {
        double areaRectangulo = lagoG * ladoP;
        return areaRectangulo;
    }
}
