
package Productor_Consumidor;

/**
 *
 * @author Cristina
 */
public class Principal {
    //Modelo productor consumidor
    public static void main(String[] args) {
        ObjetoCompartido compartido=new ObjetoCompartido();
        Thread p=new Thread(new Productor(compartido));
        Thread c=new Thread(new Consumidor(compartido));
        p.start();
        c.start();
    }
}
