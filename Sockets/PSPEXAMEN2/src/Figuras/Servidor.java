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

/**
 *
 * @author FP
 */
public class Servidor implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int numeroPuerto = 6000; //puertoRemoto
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        System.out.println("SOY EL SERVIDOR");
        System.out.println("Esperando al cliente...");
        Socket cliente = servidor.accept();

        ObjectInputStream opcionEntrada = new ObjectInputStream(cliente.getInputStream());
        Opcion opcion = (Opcion) opcionEntrada.readObject();

        int value = opcion.getValue();
        System.out.println("Opcion escogida: " + value);

        double area = 0;
        double perimetro = 0;

        switch (value) {
            case 1:

                ObjectInputStream inObjeto1 = new ObjectInputStream(cliente.getInputStream());
                Circulo cir = (Circulo) inObjeto1.readObject();

                area = cir.calArea(cir.getRadio());
                perimetro = cir.calPer(cir.getRadio());
                
                System.out.println("---------------------------------------------------");

                System.out.println("El area del circulo es: " + area);
                System.out.println("El perimetro del circulo es: " + perimetro);

                inObjeto1.close();
                break;

            case 2:

                ObjectInputStream inObjeto2 = new ObjectInputStream(cliente.getInputStream());
                Cuadrado cuad = (Cuadrado) inObjeto2.readObject();

                area = cuad.calArea(cuad.getLado());
                perimetro = cuad.calPer(cuad.getLado());
                
                System.out.println("---------------------------------------------------");

                System.out.println("El area del circulo es: " + area);
                System.out.println("El perimetro del circulo es: " + perimetro);

                inObjeto2.close();
                break;

            case 3:

                ObjectInputStream inObjeto3 = new ObjectInputStream(cliente.getInputStream());
                Rectangulo rect = (Rectangulo) inObjeto3.readObject();

                area = rect.calArea(rect.getLadoG(), rect.getLadoP());
                perimetro = rect.calPer(rect.getLadoG(), rect.getLadoP());
                
                System.out.println("---------------------------------------------------");

                System.out.println("El area del circulo es: " + area);
                System.out.println("El perimetro del circulo es: " + perimetro);

                inObjeto3.close();
                break;

        }
        System.out.println("---------------------------------------------------");

        System.out.println("PROCESO FINALIZADO");

        opcionEntrada.close();
        cliente.close();
        servidor.close();

    }
}
