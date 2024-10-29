
package InterfazCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Cristina
 */
public class Principal {
    public static void main(String[] args) throws ExecutionException {
        int inicio = 1; 
        int fin = 10;   

        // Crear un ExecutorService
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        // Crear la tarea Callable
        SumatorioCallable tarea = new SumatorioCallable(inicio, fin);

        try {
            // Ejecutar la tarea y obtener el resultado
            Future<Integer> resultado = executor.submit(tarea);
            System.out.println("El sumatorio de " + inicio + " a " + fin + " es: " + resultado.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Cerrar el ExecutorService
            executor.shutdown();
        }
    }
}
