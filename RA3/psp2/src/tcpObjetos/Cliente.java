/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcpObjetos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author FP
 */
public class Cliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {    
        
        String host = "localhost";
        int puerto = 6000;
        System.out.println("PROGRAMA CLIENTE INICIANDO ...");
        
        Socket cliente = new Socket(host,puerto);
        
        //flujo de entrada para objetos
        ObjectInputStream perEnt = new ObjectInputStream(cliente.getInputStream());
        
        //se recibe un objeto
        Persona dato = (Persona) perEnt.readObject();
        System.out.println("Recibo: "+dato.getNombre()+"*"+dato.getEdad());
        
        //modifico el objeto
        dato.setNombre("Ricardo F.");
        dato.setEdad(51);
        
        //flujo de salida para objetos
        ObjectOutputStream perSal = new ObjectOutputStream(cliente.getOutputStream());
        perSal.writeObject(dato);
        System.out.println("Envio"+dato.getNombre()+"*"+dato.getEdad());
        
        //cerrar streams y socket
        perEnt.close();
        perSal.close();
        cliente.close();
    }
}
