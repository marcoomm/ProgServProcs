/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCPObjFiguras;

import TCPObjetos.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author FP
 */




public class TCPObjetoCliente {
    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 6000;

        System.out.println("Programa cliente iniciando");

        try (Socket cliente = new Socket(host, puerto);
             ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());
             ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream())) {

            
            Circulo cir = new Circulo(10); 
            Cuadrado cua = new Cuadrado(10);
            Rectangulo rec = new Rectangulo(10,20);
            outObjeto.writeObject(rec); 
            System.out.println("Objeto enviado al servidor: " + rec.getClass().getSimpleName());

           
            double area = inObjeto.readDouble();
            double perimetro = inObjeto.readDouble();

            System.out.println("Área recibida: " + area);
            System.out.println("Perímetro recibido: " + perimetro);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



