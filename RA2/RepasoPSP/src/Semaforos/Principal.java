package Semaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Cristina
 */
public class Principal {

    public static void main(String[] args) {
        final int numPhilosopher = 5;
        Semaphore[] forks = new Semaphore[numPhilosopher];
        Philosopher[] filosofo = new Philosopher[numPhilosopher];

        for (int i = 0; i < numPhilosopher; i++) {
            forks[i] = new Semaphore(1);
        }
        for (int i = 0; i < numPhilosopher; i++) {
            Semaphore leftFork = forks[i];
            Semaphore rightFork = forks[(i + 1) % numPhilosopher];
            filosofo[i] = new Philosopher(i, leftFork, rightFork);
            filosofo[i].start();
        }
    }
}
