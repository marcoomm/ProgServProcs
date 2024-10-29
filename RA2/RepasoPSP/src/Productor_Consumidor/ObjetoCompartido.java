package Productor_Consumidor;

/**
 *
 * @author Cristina
 */
public class ObjetoCompartido {

    int valor;
    boolean disponible = false;

    public synchronized int get() {
        while (disponible == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.disponible = false;
        notifyAll();
        return this.valor;
    }

    public synchronized void set(int vale) {
        while (disponible == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.valor = valor;
        this.disponible = true;
        notifyAll();
    }
}
