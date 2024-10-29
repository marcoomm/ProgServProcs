
package Productor_Consumidor;

/**
 *
 * @author Cristina
 */
public class Productor implements Runnable{
    ObjetoCompartido compartido;

    public Productor(ObjetoCompartido compartido) {
        this.compartido = compartido;
    }
    public void run(){
        for (int y =0;y<5;y++){
            System.out.println("El productor produce "+y);
            this.compartido.set(y);
            try{
                Thread.currentThread().sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
