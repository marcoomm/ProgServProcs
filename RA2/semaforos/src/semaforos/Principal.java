/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        
        final int numPhilosophers = 5;
        Semaphore[] forks = new Semaphore[numPhilosophers];
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        
        for(int i = 0; i<numPhilosophers; i++){
            forks[i] = new Semaphore(1);
        }
        
        for(int i =0; i<numPhilosophers;i++){
            Semaphore leftFork = forks[i];
            Semaphore rightFork = forks[(i+1)%numPhilosophers];
               
            philosophers[i] = new Philosopher(i, leftFork, rightFork);
            philosophers[i].start();
        }
    }
}
