/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package URLConnection1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        URL url = null;
        URLConnection urlCon = null;
        try{
            url = new URL("https:/damiansu.com");
            urlCon = url.openConnection();
            
            BufferedReader in;
            InputStream inputStream = urlCon.getInputStream();
            in = new BufferedReader(new InputStreamReader(inputStream));
            
            String inputLine;
            while((inputLine = in.readLine()) != null){
                System.out.println(inputLine);
            }
            in.close();
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
