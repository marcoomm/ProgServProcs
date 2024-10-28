/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto.consumidor;

/**
 *
 * @author FP
 */
public class Productor implements Runnable {

    ObjetoCompartido compartido;
    
    Productor(ObjetoCompartido compartido){
        this.compartido=compartido;
    }
    
    @Override
    public void run() {
        for(int y=0; y<5;y++){
            System.out.println("El productor produce: "+y);
        this.compartido.set(y);
        try{
            Thread.currentThread().sleep(100);
        }catch(InterruptedException e){
            
        }
        }
    }
    
}
