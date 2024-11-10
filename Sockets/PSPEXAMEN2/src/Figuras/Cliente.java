/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import TCPObjetos.Persona;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author FP
 */
public class Cliente implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String host = "localhost";
        int puerto = 6000;
        System.out.println("PROGRAMA CLIENTE INICIADO...");
        Socket cliente = new Socket(host, puerto);

        Scanner teclado = new Scanner(System.in);

        ObjectOutputStream option = new ObjectOutputStream(cliente.getOutputStream());

        System.out.println("ELIGE QUE QUIERES INTRODUCIR :");
        System.out.println("1. CIRCULO");
        System.out.println("2. CUADRADO");
        System.out.println("3. RECTANGULO");
        int opcion = teclado.nextInt();

        Opcion valor = new Opcion(opcion);
        option.writeObject(valor);
        System.out.println("Enviando opcion");

        switch (opcion) {
            case 1:
                ObjectOutputStream objCir = new ObjectOutputStream(cliente.getOutputStream());
                Circulo circulo = new Circulo();
                System.out.println("Introduce el radio");
                int radio = teclado.nextInt();
                circulo.setRadio(radio);

                objCir.writeObject(circulo);
                System.out.println("---------------------------------------------------");
                System.out.println("Enviando un circulo de radio: " + radio);

                objCir.close();
                break;

            case 2:
                ObjectOutputStream objCuad = new ObjectOutputStream(cliente.getOutputStream());
                Cuadrado cuadrado = new Cuadrado();
                System.out.println("Introduce el lado");
                int lado = teclado.nextInt();
                cuadrado.setLado(lado);

                objCuad.writeObject(cuadrado);
                System.out.println("---------------------------------------------------");
                System.out.println("Enviando un cuadrado de lado: " + lado);

                objCuad.close();
                break;

            case 3:
                ObjectOutputStream objRect = new ObjectOutputStream(cliente.getOutputStream());

                Rectangulo rectangulo = new Rectangulo();

                System.out.println("Introduce un lado");
                int lado1 = teclado.nextInt();

                System.out.println("Introduce el otro lado");
                int lado2 = teclado.nextInt();

                rectangulo.setLadoG(lado1);
                rectangulo.setLadoP(lado2);

                objRect.writeObject(rectangulo);
                System.out.println("---------------------------------------------------");
                System.out.println("Enviando un cuadrado de lados: " + lado1 + " y altura: " + lado2);

                objRect.close();
                break;

        }
        cliente.close();
    }
}
