
package Runable;

/**
 *
 * @author FP
 */
public class Tarea extends AlgunaClaseAnterior implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
          System.out.println("Soy el hilo: "+i+" Esto es lo que hago.");  
        }
    }
}