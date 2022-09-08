/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrstring;

import java.util.Random;


/**
 *
 * @author hegyi.roland
 */
public class HRString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer szo = new StringBuffer("✔😊❤😍"); 
        System.out.println(szo); //✔😊❤😍
        char[] betuk = {'a','b','c'};
        String s1 = new String(betuk); //abc
        String s2 = new String(betuk,1,2); //bc
        System.out.println(s1); //✔
        System.out.println(s2); //❤
        char ch = szo.charAt(0);
        char ch2 = szo.charAt(3);
        System.out.println(ch);
        System.out.println(ch2);
        boolean tof = false;
        float f = 1.16f;
        String fa = "majom";
        System.out.println(String.valueOf(tof)+String.valueOf(fa)+String.valueOf(f)); //falsemajom1.16
        boolean b1 = "Banán".equals("banán"); //false 
        boolean b2 = "Banán".equalsIgnoreCase("BANÁN"); //true
        
        int index1 = "Ubuntu".indexOf('u');         // 0
        int index2 = "Ubuntu".indexOf('u', 2);      // 5
        // a 2. indexű elemtől indul a keresés
        int index3 = "Ubuntu".indexOf("Ub");        // 0
        int index4 = "Ubuntu".indexOf("Nu");        // -1
        //Keresés hátulról: lastIndexOf metódus
        int index5 = "Ubuntu".lastIndexOf("tu");    // 4
        //startsWith metódus
        boolean start = "file.java".startsWith("fi"); // true
        //endsWith metódus
        boolean vege = "file.java".endsWith(".jav"); 
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println(index5);
        System.out.println(start);
        System.out.println(vege);
   
        int len = "Sopron".length();  // len = 6
        
        String vegyes = "Kicsi És nAgYbEtŰk Vegyesen";
        String small = vegyes.toLowerCase();
        String nagy = vegyes.toUpperCase();
   
        String kacsa = small.substring(0, 5).replace('i', 'a');
       
        String s = "    abcd    ";
        String lenyeg = s.trim();  // lenyeg = "abcd"
        System.out.println(vegyes);
        System.out.println(small);
        System.out.println(nagy);
        System.out.println(kacsa);
        System.out.println(s);
        System.out.println(lenyeg);
       
        StringBuffer sb1= new StringBuffer();   // L:0  C:16
        System.out.println(sb1.length()+ " " + sb1.capacity());
        StringBuffer sb2= new StringBuffer(10); // L:0  C:10
        System.out.println(sb2.length()+ " " + sb2.capacity());
        String varos = "Sopron";
        StringBuffer sb3= new StringBuffer(s);
        System.out.println(sb3.length()+ " " + sb3.capacity());
        //append
        StringBuffer szov = new StringBuffer("Szám=");
        float f3=34.6f;
        szov.append(f3);
        szov.append("*");
        System.out.println(szov);
        //insert
        StringBuffer szovi = new StringBuffer("Osszesen  Ft");
        float f2=34.6f;
        szovi.insert(9,f2);
        System.out.println(szovi);
        //törlés
        StringBuffer szovt = new StringBuffer("Fradika");
        szovt.delete(2, 4);
        System.out.println(szovt);
        szovt.deleteCharAt(1);
        System.out.println(szovt);
        
        //egyéb
        StringBuffer szoveg = new StringBuffer("bolha");
        szoveg.delete(2,4);
        System.out.println(szoveg);
        
        
        
        /*
        Random rnd = new Random();
        
        System.out.println(rnd.nextInt(99));
        */
        
        
        
    }
    
}
