
package JardinesConSincronizacion;

import JardinesSinSincronizacion.*;

/**
 *
 * @author Cristina
 */
public class EntraJardin extends Thread{
    //clase derivada de Thread que define un hilo
    private RecursoJardin jardin;
    
    public EntraJardin(String nombre, RecursoJardin j){
        this.setName(nombre);
        this.jardin=j;
    }
    public void run(){
        //invoca al metodo que incrementa la entrada al jardin
        jardin.incremetnaCuenta();
    }
}
