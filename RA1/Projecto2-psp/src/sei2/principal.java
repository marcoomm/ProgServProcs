/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sei2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author FP
 */
public class principal {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner teclado = new Scanner (System.in);
        ProcessBuilder proceso = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        proceso.start();
        Thread.sleep(3000);
        ProcessBuilder proceso2 = new ProcessBuilder("\"C:\\Program Files\\Microsoft Office\\root\\Office16\\POWERPNT.EXE\"");
        proceso2.start();
        System.out.println("Introduce la ruta del ejecutable");
        String ruta = teclado.next();
        ProcessBuilder proceso3 = new ProcessBuilder(ruta);
        proceso3.start();
        
    }
}
