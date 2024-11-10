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
public class Rectangulo implements Serializable{
    
    private int ladoCorto;
    private int ladoLargo;

    public int getLadoCorto() {
        return ladoCorto;
    }

    public void setLadoCorto(int ladoCorto) {
        this.ladoCorto = ladoCorto;
    }

    public int getLadoLargo() {
        return ladoLargo;
    }

    public void setLadoLargo(int ladoLargo) {
        this.ladoLargo = ladoLargo;
    }

    public Rectangulo(int ladoCorto, int ladoLargo) {
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
