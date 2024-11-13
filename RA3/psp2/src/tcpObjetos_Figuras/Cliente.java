/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcpObjetos_Figuras;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author FP
 */
public class Cliente {

    public static void main(String[] args) throws IOException {

        String host = "localhost";
        int puerto = 6000;
        System.out.println("PROGRAMA CLIENTE INICIADO...");
        Socket cliente = new Socket(host, puerto);

        Scanner teclado = new Scanner(System.in);
        System.out.println("1 es para Cuadrado");
        System.out.println("2 es para Rectangulo");
        System.out.println("3 es para Circulo");
        System.out.println("Introduce tu eleccion:"); 
        
        private int opcion = teclado.nextInt();        
        public void enviarOpcion(int opcion) {
            this.opcion = opcion;
        }
        public int getOpcion(){
            return opcion;
        }
        
    switch (opcion) {
        case 1:

            ObjectOutputStream cuad = new ObjectOutputStream(cliente.getOutputStream());
            Cuadrado cuadrado = new Cuadrado();
            System.out.println("Introduce el lado:");
            double lado = teclado.nextDouble();
            cuadrado.setLado(lado);

            cuad.writeObject(cuadrado);
            System.out.println("Enviando un cuadrado de lado: " + lado);

            cuad.close();
            break;
        case 2:

            ObjectOutputStream rect = new ObjectOutputStream(cliente.getOutputStream());
            Rectangulo rectangulo = new Rectangulo();
            System.out.println("Introduce el lado mayor y despues el menor");
            double ladoG = teclado.nextDouble();
            double ladoP = teclado.nextDouble();
            rectangulo.setLadoG(ladoG);
            rectangulo.setLadoP(ladoP);

            rect.writeObject(rectangulo);
            System.out.println("Enviando un rectangulo de lados: " + ladoG + " y " + ladoP);

            rect.close();
            break;
        case 3:

            ObjectOutputStream circ = new ObjectOutputStream(cliente.getOutputStream());
            Circulo circulo = new Circulo();
            System.out.println("Introduce el radio: ");
            double radio = teclado.nextDouble();
            circulo.setRadio(radio);

            circ.writeObject(circulo);
            System.out.println("Enviando un circulo de radio: " + radio);

            circ.close();
            break;
    } 
               

     cliente.close();

}

