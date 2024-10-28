/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package callable;

import java.util.concurrent.Callable;

/**
 *
 * @author FP
 */
public class Suma implements Callable<Long> {

    private long n1;
    private long n2;

    public Suma(long n1, long n2) {
        this.n1=n1;
        this.n2=n2;
    }

    public long getN1() {
        return n1;
    }
    public void setN1(long n1) {
        this.n1 = n1;
    }
    public long getN2() {
        return n2;
    }
    public void setN2(long n2) {
        this.n2 = n2;
    }

    @Override
    public Long call() throws Exception {
        long result = 0;

        try {
            Thread hiloActual = Thread.currentThread();
            System.out.println("Iniciando el hilo " + hiloActual.getName()
                    + " : Suma (" + this.n1 + "," + this.n2 + " )");

            for (long y = this.n1; y <= this.n2; y++) {
                result = result + y;
            }
            
            
            Thread.sleep(500);
            System.out.println("Finalizando el hilo " + hiloActual);
            System.out.println("Resultado del hilo :" + result);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
