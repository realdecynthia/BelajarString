/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajarstring;

/**
 *
 * @author USER
 */
public class BelajarString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x = "hello world";
        
        String belajar = new String();
        System.out.println(x.length ());
        System.out.println(x.equals("hell0 world")); //equals menyamakan kalimat yang hello world pertama
        System.out.println(x.isEmpty());
        
       String data1 = "a" + "b";
       data1 = data1 + "c";
       String data2 = "abc";
        if (data1 == data2) {
        System.out.println(data1 + " sama dengan " + data2);
        } else {
        System.out.println(data1 + " tidak sama dengan " + data2);
    }
        
        
       }
    
}
