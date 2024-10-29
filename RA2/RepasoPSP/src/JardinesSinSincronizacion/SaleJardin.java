
package JardinesSinSincronizacion;

/**
 *
 * @author Cristina
 */
public class SaleJardin extends Thread {
    //Clase threads que define la salida del jardin
    private RecursoJardin jardin;
    
   public SaleJardin(String nombre, RecursoJardin j){
        this.setName(nombre);
        this.jardin=j;
    }
    public void run(){
      //invoca al metodo que incrementa la entrada al jardin
        jardin.decrementaCuenta();
    }
}
