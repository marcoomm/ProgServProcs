/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCPObjFiguras;

import TCPObjetos.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author FP
 */




public class TCPObjetosServidor {
    public static void main(String[] args) {
        int numeroPuerto = 6000;

        try (ServerSocket servidor = new ServerSocket(numeroPuerto)) {
            System.out.println("Servidor iniciado y esperando conexión...");

            
            try (Socket cliente = servidor.accept();
                 ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
                 ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream())) {

                System.out.println("Cliente conectado.");

                
                Object objetoRecibido = inObjeto.readObject();

                double area = 0;
                double perimetro = 0;

                
                if (objetoRecibido instanceof Circulo circulo) {
                    area = circulo.calcularArea();
                    perimetro = circulo.calcularPerimetro();
                    System.out.println("Recibido un Circulo con radio: " + circulo.getRadio());

                } else if (objetoRecibido instanceof Cuadrado cuadrado) {
                    area = cuadrado.calcularArea();
                    perimetro = cuadrado.calcularPerimetro();
                    System.out.println("Recibido un Cuadrado con lado: " + cuadrado.getLado());

                } else if (objetoRecibido instanceof Rectangulo rectangulo) {
                    area = rectangulo.calcularArea();
                    perimetro = rectangulo.calcularPerimetro();
                    System.out.println("Recibido un Rectángulo con largo: " + rectangulo.getLadoLargo() + " y ancho: " + rectangulo.getLadoCorto());
                }

                
                outObjeto.writeDouble(area);
                outObjeto.writeDouble(perimetro);
              //  outObjeto.reset();
                System.out.println("Área y perímetro enviados al cliente.");

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}



