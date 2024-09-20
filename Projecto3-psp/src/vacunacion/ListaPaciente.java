/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacunacion;

/**
 *
 * @author FP
 */
public class ListaPaciente{
 
    private String nombre;
    private int[] tiempoPaciente;

    public ListaPaciente(String nombre, int[] tiempoPaciente) {
        this.nombre = nombre;
        this.tiempoPaciente = tiempoPaciente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int[] getTiempoPaciente() {
        return tiempoPaciente;
    }
    public void setTiempoPaciente(int[] tiempoPaciente) {
        this.tiempoPaciente = tiempoPaciente;
    }
    
    
}
