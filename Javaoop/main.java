package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author sadik
 */
public class main {

    public static void main(String[] args) {
     Scanner ozellik=new Scanner(System.in);
     String a,b;
     int c;
     System.out.println("Lutfen rengini giriniz:"); 
     a=ozellik.nextLine(); // arac rengi
     System.out.println("Lutfen modelini giriniz:");
     b=ozellik.nextLine(); // arac modeli 
     System.out.println("Lutfen yasini giriniz:");
     c=ozellik.nextInt(); // arac yasi
     
        Araba araba1=new Araba(a,b,c);
        
        araba1.BilgileriYazdir();
        araba1.HaraketEt();
        araba1.dur();
    }
}
