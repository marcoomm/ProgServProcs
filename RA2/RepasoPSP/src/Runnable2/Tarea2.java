
package Runnable2;


/**
 *
 * @author FP
 */
public class Tarea2 extends AlgunaClaseAnterior implements Runnable{
    public void run() {
        for(int i=20;i<30;i++){
          System.out.println("Soy el hilo: "+i+" Esto es lo que hago.");  
        }
    }
}
