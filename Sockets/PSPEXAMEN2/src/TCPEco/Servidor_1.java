/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCPEco;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author FP
 */
public class Servidor_1 {

    public static void main(String[] args) throws IOException {
        ServerSocket servidor;

        servidor = new ServerSocket(6000);
        System.out.println("Servidor iniciado");

        while (true) {
            Socket cliente = new Socket();
            cliente = servidor.accept();
            HiloServidor_1 hilo = new HiloServidor_1(cliente);
            //DataInputStream entrada = new DataInputStream(cliente.getInputStream());
            //String mensaje = entrada.readUTF();
            //System.out.println("Mensaje: "+mensaje);
            hilo.start();
        }
    }

}
