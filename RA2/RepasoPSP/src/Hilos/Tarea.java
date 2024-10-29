
package Hilos;

/**
 *
 * @author FP
 */
public class Tarea extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
          System.out.println("Soy un hilo");  
        }
    }
}
