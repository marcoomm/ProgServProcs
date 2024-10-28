/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package callable;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 *
 * @author FP
 */
public class SumatorioFutureTask {
    public static void main(String[] args) {
        
        //Long index1 = Long.parseLong(args[0]);
        //Long index2 = Long.parseLong(args[1]);
        
        
        Long index1 = 1L;
        Long index2 = 100L;
        
        try{
            Runtime runtime = Runtime.getRuntime();
            int num_procesadores = runtime.availableProcessors();
            System.out.println("Dividiendo la tarea: "+num_procesadores+" hilos");
            
            Long incremento = index2/num_procesadores;
            System.out.println(incremento);
            
            //sumas parciales
            
            ArrayList<FutureTask<Long>> sumaFuture = new ArrayList<FutureTask<Long>>();
            
            Thread vectorHilos[]=new Thread[num_procesadores];
            for(int i=0; i<num_procesadores; i++){
                
                long ini = index1+incremento*i;
                long fin = index1+incremento * (i+1)-1;
                if(fin>index2)
                    fin = index2;
                    
                //creamos suma que es callable
                    Suma sumaParcial = new Suma(ini, fin);
                   
                //futuretask encapsula para que sae runnable    
                    sumaFuture.add(new FutureTask<Long>(sumaParcial));
                    
                //creamos y lanzamos el hilo a partir de 1
                    vectorHilos[i] = new Thread(sumaFuture.get(i));
                    vectorHilos[i].setName("Hilo "+i);
                    vectorHilos[i].start();
                
            }
            
            long ac=0;
            
            for(int i=0;i<num_procesadores;i++){
                vectorHilos[i].join();
                ac=ac+sumaFuture.get(i).get();
            }
            
            System.out.println("Suma total: "+ac);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
