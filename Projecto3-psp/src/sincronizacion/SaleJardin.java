/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacion;

/**
 *
 * @author marke
 */
public class SaleJardin extends Thread{
    
    private RecursoJardin jardin;
    
    public SaleJardin(String nombre, RecursoJardin j){
        this.setName(nombre);
        this.jardin=j;
    }
    
    @Override
    public void run(){
        jardin.decrementaCuenta();
    }

    private void setName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
