package princ;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FP
 */
public class Tarea extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Soy el hilo "+ i + " esto es lo que hago");
        }
    }
}