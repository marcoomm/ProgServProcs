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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FP
 */
public class HiloServidor extends Thread{
    
    DataInputStream entrada;
    DataOutputStream salida;
    Socket socket = null;
    
    public HiloServidor(Socket cliente) throws IOException{
        this.socket = cliente;
 
        salida = new DataOutputStream(socket.getOutputStream());
        entrada = new DataInputStream(socket.getInputStream());      
    }
    
    public void run(){
        String cadena = "";
        System.out.println("COMUNICO CON: "+socket.toString());
        
        while(!cadena.trim().equals("*")){     
            try {
                cadena = entrada.readUTF();
                System.out.println(socket.toString()+": \t"+cadena.trim());
                salida.writeUTF(cadena.trim().toUpperCase());              
            } catch (IOException ex) {
            }
        }

        System.out.println("FIN CON: "+socket.toString());
       
        try {
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            entrada.close();
        } catch (IOException ex) {
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
