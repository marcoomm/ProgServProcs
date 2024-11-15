/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat_TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author FP
 */
public class Servidor {
    static final int maximo = 10;
    public static void main(String[] args) throws IOException {
        
        int puerto = 44444;
        ServerSocket servidor = new ServerSocket(puerto);
        System.out.println("Servidor iniciando ...");
        
        Socket tabla[] = new Socket[maximo];
        ComunHilos comun = new ComunHilos(0,0,maximo,tabla);
        
        while(comun.getConexiones()<maximo){
            Socket socket = new Socket();
            socket = servidor.accept();
            
            comun.addTabla(socket, comun.getConexiones());
            comun.setActuales(comun.getActuales()+1);
            comun.setConexiones(comun.getConexiones()+1);
            
            HiloServidorChat hilo = new HiloServidorChat(socket, comun);
            hilo.start();
            
            servidor.close();
        }
    }
}
