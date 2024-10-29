
package Hilos2;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        Tarea tarea=new Tarea();
        Tarea tarea2=new Tarea();
        tarea.start();
        tarea2.start();
        System.out.println("Soy el hilo principal y sigo currando");
        System.out.println("Fin del hilo principal");
    }
}
