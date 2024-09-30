/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto.consumidor;

/**
 *
 * @author FP
 */
public class Consumidor implements Runnable{

    private ObjetoCompartido compartido;

    Consumidor(ObjetoCompartido compartido) {
        this.compartido = compartido;
    }

    @Override
    public void run() {
        for(int y=0; y<5;y++){
            System.out.println("El consumidor consume: "+this.compartido.get());
        try{
            Thread.currentThread().sleep(500);
        }catch(InterruptedException e){
            
        }
        }
    }
    
}
