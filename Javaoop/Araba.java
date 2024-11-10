package com.mycompany.main;

/**
 *
 * @author sadik
 */
public class Araba {
    String renk;
    String model;
    int yas;
    
    public Araba(String renk,String model,int yas){ // constructor
       this.renk=renk;
       this.model=model;
       this.yas=yas;
      
   }
    
    public void HaraketEt(){
        System.out.println(this.model +" hareket ediyor...");
        
    }
    
       public void dur(){
        System.out.println(this.model +"  duruyor...");
        
    }
       
          public void BilgileriYazdir(){
        System.out.println("arac modeli: "+this.model);
        System.out.println("arac rengi: "+this.renk);
        System.out.println("Araba yili: "+this.yas);
    }
      
    
    
}
