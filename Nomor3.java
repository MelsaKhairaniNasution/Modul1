/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;

/**
 *
 * @author Win8
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Nomor3 {
    public static void main(String[] args) throws UnknownHostException, java.lang.SecurityException {
        System.out.println("Looking Up Host Address");
        try {
            String host = "www.google.com";
            InetAddress[] ia = InetAddress.getAllByName(host);

            System.out.println("Nama Host: "+host);
            System.out.println("\nAlamat Host: ");

            for (int i = 0; i < ia.length; i++) {
                System.out.println(ia[i]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
