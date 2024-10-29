package Hilos;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) {
        Tarea tarea = new Tarea();
        tarea.start();
        System.out.println("Soy el hilo principal y sigo currando");
        System.out.println("Fin del hilo principal");
    }
}
