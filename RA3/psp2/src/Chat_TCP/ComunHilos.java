/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat_TCP;

import java.net.Socket;

/**
 *
 * @author FP
 */
public class ComunHilos{
  
    int conexiones;
    int actuales;
    int maximo;
    Socket tabla[] = new Socket[maximo];
    String mensajes;

    public ComunHilos(int conexiones, int actuales, int maximo, Socket[] tabla) {
        conexiones = conexiones;
        actuales = actuales;
        maximo = maximo;
        this.tabla=tabla;
        mensajes="";
    }

    public int getMaximo() {
        return maximo;
    }
    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getConexiones() {
        return conexiones;
    }
    public synchronized void setConexiones(int conexiones) {
        this.conexiones = conexiones;
    }

    public int getActuales() {
        return actuales;
    }
    public synchronized void setActuales(int actuales) {
        this.actuales = actuales;
    }
    
    public String getMensajes() {
        return mensajes;
    }
    public synchronized void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }
    
    public synchronized void addTabla(Socket s, int i){
        tabla[i]=s;
    }  
    public Socket getElementoTabla(int i) {
        return tabla[i];
    }



    
    
    
}
