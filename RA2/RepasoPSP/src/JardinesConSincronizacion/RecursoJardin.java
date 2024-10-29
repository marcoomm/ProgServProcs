
package JardinesConSincronizacion;

import JardinesSinSincronizacion.*;

/**
 *
 * @author Cristina
 */
public class RecursoJardin {
    //clase que dimula las entradas y las salidas
    private int cuenta;
    public RecursoJardin(){
        cuenta=100;
    }
    public synchronized void incremetnaCuenta(){
        //metodo que incrementa en uno la variable cuenta
            System.out.println("hilo"+Thread.currentThread().getName()+"----Entra en jardin");
        //Muestra el hilo que entra en el metodo
        cuenta++;
            System.out.println(cuenta +" en jardin");
    }
    public synchronized void decrementaCuenta(){
        //metodo que incrementa en uno la variable cuenta
            System.out.println("hilo"+Thread.currentThread().getName()+"----Sale del jardin");
        //Muestra el hilo que entra en el metodo
        cuenta--;
            System.out.println(cuenta +" en jardin");
    }
    
    
}
