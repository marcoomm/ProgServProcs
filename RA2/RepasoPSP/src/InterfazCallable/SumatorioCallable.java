
package InterfazCallable;

import java.util.concurrent.Callable;

/**
 *
 * @author Cristina
 */
public class SumatorioCallable implements Callable<Integer> {
    private int inicio;
    private int fin;

    public SumatorioCallable(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public Integer call() throws Exception {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += i;
        }
        return suma;
    }

}
