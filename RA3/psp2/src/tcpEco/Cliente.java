/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcpEco;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author FP
 */
public class Cliente {

    public static void main(String[] args) throws IOException {

        String host = "10.1.9.114";
        int puerto = 6000;
        Socket cliente = new Socket(host, puerto);
        
        //flujo de salida
        DataOutputStream fsalida = new DataOutputStream(cliente.getOutputStream());
        //fsalida.writeUTF("Saludos al servidor DESDE EL CLIENTE");
        fsalida.writeUTF("agüita");

        //
        DataInputStream fentrada = new DataInputStream(cliente.getInputStream());

        System.out.println("Recibiendo del SERVIDOR: \n\t" + fentrada.readUTF());
                
        fentrada.close();
        fsalida.close();
        cliente.close();

    }
}
