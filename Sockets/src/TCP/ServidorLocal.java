/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author FP
 */
public class ServidorLocal {
    public static void main(String[] args) throws IOException{
       
        int Puerto = 5080;
        ServerSocket servidor = new ServerSocket(Puerto);
        System.out.println("Escuchando en el puerto: "+servidor.getLocalPort());
        
        Socket cliente1 = servidor.accept();//esperando a un cliente
        System.out.println("Cliente 1 conectado y terminado");
        //se realizan acciones con el cliente
              
        Socket cliente2 = servidor.accept();//esperando a otro cliente
        System.out.println("Cliente 2 conectado y terminado");
        //se realizan las acciones con otro cliente
        
        servidor.close();//cierro el socket del servidor
        System.out.println("Programa Finalizado");
        
        
   
    }   
}
