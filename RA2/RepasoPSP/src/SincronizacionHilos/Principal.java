
package SincronizacionHilos;

import Runnable2.*;


/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        Tarea tarea=new Tarea();
        Tarea2 tarea2 =new Tarea2();
        Thread htarea= new Thread(tarea);
        Thread htarea2 =new Thread(tarea2);
        htarea.start();
        htarea2.start();
        try{
            htarea.join();
            htarea2.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Soy el hilo principal y sigo currando");
        System.out.println("Fin del hilo principal");
        
    }
}
