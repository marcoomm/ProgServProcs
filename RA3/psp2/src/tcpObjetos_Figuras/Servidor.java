/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcpObjetos_Figuras;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author FP
 */
public class Servidor {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner teclado = new Scanner(System.in);
        int numeroPuerto = 6000;
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        System.out.println("SOY EL SERVIDOR");
        System.out.println("Esperando al cliente....");
        Socket cliente = servidor.accept();

        
        System.out.println("1 es para Cuadrado");
        System.out.println("2 es para Rectangulo");
        System.out.println("3 es para Circulo");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:

                ObjectInputStream inObjeto1
                        = new ObjectInputStream(cliente.getInputStream());

                Cuadrado cuadrado = (Cuadrado) inObjeto1.readObject();

                System.out.println("Area del cuadrado: " + cuadrado.calArea(cuadrado.getLado()));
                System.out.println("Perimetro del cuadrado: " + cuadrado.calPerimetro(cuadrado.getLado()));
                
                inObjeto1.close();
                break;
            case 2:

                ObjectInputStream inObjeto2
                        = new ObjectInputStream(cliente.getInputStream());

                Rectangulo rectangulo = (Rectangulo) inObjeto2.readObject();

                System.out.println("Area del cuadrado: " + rectangulo.calArea(rectangulo.getLadoG(), rectangulo.getLadoP()));
                System.out.println("Perimetro del cuadrado: " + rectangulo.calPerimetro(rectangulo.getLadoG(), rectangulo.getLadoP()));

                inObjeto2.close();
                break;
            case 3:

                ObjectInputStream inObjeto3
                        = new ObjectInputStream(cliente.getInputStream());

                Circulo circulo = (Circulo) inObjeto3.readObject();

                System.out.println("Area del cuadrado: " + circulo.calArea(circulo.getRadio()));
                System.out.println("Perimetro del cuadrado: " + circulo.calPerimetro(circulo.getRadio()));

                inObjeto3.close();
                break;

        }
        cliente.close();
        servidor.close();

    }
}
