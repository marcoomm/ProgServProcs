
package Semaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Cristina
 */
public class Philosopher extends Thread {
    private Semaphore leftFork,rightFork;
    private int id;
    
    public Philosopher(int id,Semaphore leftFork,Semaphore rightFork){
        this.id=id;
        this.leftFork=leftFork;
        this.rightFork=rightFork;
    }
    public void run(){
        try{
            while(true){
                System.out.println("Filosofo "+id+" esta pensando");
                leftFork.acquire();
                System.out.println("Filosofo "+ id+" ha tomado el tenedor izquierdo");
                rightFork.acquire();
                System.out.println("Filosodo "+id+" ha tomado el tenedor derecho");
                System.out.println("Filosodo "+id+" esta comiendo");
                leftFork.release();
                System.out.println("Filosofo "+id+" deja el tenedor izquierdo");
                rightFork.release();
                System.out.println("Filosofo "+id+" deja el tenedor derecho");
            }
        }catch(InterruptedException e ){
            e.printStackTrace();
        }
    }
    
}
