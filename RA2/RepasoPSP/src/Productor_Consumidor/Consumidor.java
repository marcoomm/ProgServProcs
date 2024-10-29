
package Productor_Consumidor;

/**
 *
 * @author Cristina
 */
public class Consumidor implements Runnable {
    private ObjetoCompartido compartido;

    public Consumidor(ObjetoCompartido compartido) {
        this.compartido = compartido;
    }
    public void run(){
        for (int y =0;y<5;y++){
            System.out.println("El consumidor consume "+this.compartido.get());
            try{
                Thread.currentThread().sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
