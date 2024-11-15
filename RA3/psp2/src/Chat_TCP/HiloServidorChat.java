/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat_TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FP
 */
public class HiloServidorChat extends Thread{

    DataInputStream fentrada;
    Socket socket = null;
    ComunHilos comun;

    public HiloServidorChat(Socket s, ComunHilos comun) {
        this.socket = s;
        this.comun = comun;
        try{
            fentrada = new DataInputStream(socket.getInputStream());
        }catch(IOException e){
            System.out.println("ERROR DE E/S");
            e.printStackTrace();
        }
    }
    
    private void EnviarMensajesaTodos(String texto) throws IOException{
        for(int i=0;i<comun.getConexiones();i++){
            Socket s1 = comun.getElementoTabla(i);
            if(!s1.isClosed()){
                try{
                    DataOutputStream fsalida2 = new DataOutputStream(s1.getOutputStream());
                    fsalida2.writeUTF(texto);
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void run() {
        try {
            System.out.println("Numero de conexiones actuales: "+comun.getActuales());
            
            String texto = comun.getMensajes();
            EnviarMensajesaTodos(texto);
            
            while(true){
                String cadena = "";
                try{
                    cadena = fentrada.readUTF();
                    if(cadena.trim().equals("*")){
                        comun.setActuales(comun.getActuales()-1);
                        System.out.println("Numero maximo de conexiones actuales"+
                                comun.getActuales());
                        break;
                    }
                    comun.setMensajes(comun.getMensajes()+cadena+"\n");
                    EnviarMensajesaTodos(comun.getMensajes());
                    
                }catch(Exception e){
                    e.printStackTrace();
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(HiloServidorChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
