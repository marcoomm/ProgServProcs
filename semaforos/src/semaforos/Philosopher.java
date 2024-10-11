/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author FP
 */
public class Philosopher extends Thread {

    private Semaphore leftFork, rightFork;
    private int id;

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.id = id;
    }
    
    public void run() {
        try {
            while (true) {
                System.out.println("Filosofo " + id + " esta pensando.");
                leftFork.acquire();

                System.out.println("Filosofo " + id + " ha tomado el tenedor izq.");
                rightFork.acquire();

                System.out.println("Filosofo " + id + " ha tomado el tenedor derecho.");

                System.out.println("Filosofo " + id + " esta comiendo.");
                leftFork.release();

                System.out.println("Filosofo " + id + " ha soltado el tenedor izq.");
                rightFork.release();
                System.out.println("Filosofo " + id + " ha soltado el tenedor der.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
