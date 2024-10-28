/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author FP
 */
public class ClientePrincipal {
    
        public static void main(String[] args) throws IOException {
        String host = "localhost";
        int puerto = 6000;

        Socket cliente = new Socket(host, puerto);
        System.out.println("Cliente 1 conectado");
        
        InetAddress i = cliente.getInetAddress();
        System.out.println("Puerto Local (cliente) :"+cliente.getLocalPort());
        System.out.println("Puerto remoto (servidor) :"+cliente.getPort());
        System.out.println("Nombre Host/ip (cliente) :"+cliente.getInetAddress());
        System.out.println("Host remoto (servidor) :"+i.getHostName().toString());
        System.out.println("ip host remoto (servidor) :"+i.getHostAddress().toString());;
        cliente.close();
        
        
        
        
    }
    
}
