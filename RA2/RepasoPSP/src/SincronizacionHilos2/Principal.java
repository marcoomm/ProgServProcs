
package SincronizacionHilos2;

import Hilos2.*;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        Tarea tarea=new Tarea();
        Tarea2 tarea2=new Tarea2();
        tarea.start();
        try{
            tarea.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        tarea2.start();
        try{
            tarea2.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Soy el hilo principal y sigo currando");
        System.out.println("Fin del hilo principal");
    }
}
