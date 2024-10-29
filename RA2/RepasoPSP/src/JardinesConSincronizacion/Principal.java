
package JardinesConSincronizacion;

import JardinesSinSincronizacion.*;

/**
 *
 * @author Cristina
 */
public class Principal {
    public static void main(String[] args) {
        RecursoJardin jardin= new RecursoJardin();
        for (int i=1;i<=10;i++){
            (new EntraJardin("Entra el "+i,jardin)).start();
        }
                for (int i=1;i<=10;i++){
            (new SaleJardin("Entra el "+i,jardin)).start();
        }
    }
}
