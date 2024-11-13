/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasInsteadOf;

import TCPObjetos.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author FP
 */
public class TCPObjetoCliente {

    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int puerto = 6000;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa cliente iniciando");

        try (Socket cliente = new Socket(host, puerto);          
            ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream()); 
            ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream())) {

            System.out.println("Introduce tu opcion: ");
            System.out.println("1- Circulo");
            System.out.println("2- Cuadrado");
            System.out.println("3- Rectangulo");

            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el radio");
                    double radio = teclado.nextDouble();
                    Circulo cir = new Circulo(radio);
                    outObjeto.writeObject(cir);
                    System.out.println("Objeto enviado al servidor: " + cir.getClass().getSimpleName());
                    break;
                case 2:
                    System.out.println("Introduce el radio");
                    double lado = teclado.nextDouble();
                    Cuadrado cuad = new Cuadrado(lado);
                    outObjeto.writeObject(cuad);
                    System.out.println("Objeto enviado al servidor: " + cuad.getClass().getSimpleName());
                    break;

                case 3:
                    System.out.println("Introduce el radio");
                    double lado1 = teclado.nextDouble();
                    double lado2 = teclado.nextDouble();
                    Rectangulo rect = new Rectangulo(lado1, lado2);
                    outObjeto.writeObject(rect);
                    System.out.println("Objeto enviado al servidor: " + rect.getClass().getSimpleName());
                    break;
            }

            double area = inObjeto.readDouble();
            double perimetro = inObjeto.readDouble();

            System.out.println("�rea recibida: " + area);
            System.out.println("Per�metro recibido: " + perimetro);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
