/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package URL;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author FP
 */
public class Principal {

    private static void Visualizar(URL url) {
        System.out.println("\tURL completa: " + url.toString());
        System.out.println("\tgetProtocol(): " + url.getProtocol());
        System.out.println("\tgetHost(): " + url.getHost());
        System.out.println("\tgetPort(): " + url.getPort());
        System.out.println("\tgetFile(): " + url.getFile());
        System.out.println("\tgetUserInfo(): " + url.getUserInfo());
        System.out.println("\tgetPath(): " + url.getPath());
        System.out.println("\tgetAuthority: " + url.getAuthority());
        System.out.println("\tgetQuery(): " + url.getQuery());
        System.out.println("\tgetDefaultPort(): " + url.getDefaultPort());
        System.out.println("==============================================");

    }

    public static void main(String[] args) {
        URL url;
        try {
            System.out.println("Constructor simple para una URL");
            url = new URL("http://docs.oracle.com/");
            Visualizar(url);

            System.out.println("Constructor simple para una URL");
            url = new URL("https://enkei.com/good-feeling-machines-part-2-alex-240sx/");
            Visualizar(url);

            System.out.println("Constructor para protocolo + URL + directorio: ");
            url = new URL("https", "enkei.com", "emelia-hartfords-s14-on-enkei-rs05rr/");
            Visualizar(url);

        } catch (MalformedURLException e) {
            System.out.println("Error: "+e);
        }
    }

}
