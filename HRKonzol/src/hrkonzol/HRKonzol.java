/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrkonzol;

import java.util.Scanner;

/**
 *
 * @author hegyi.roland
 */
public class HRKonzol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ajdon meg egy számot");
        int szam1 = scan.nextInt();
        System.out.println("Adjom meg egy másik számot");
        int szam2 = scan.nextInt();
        scan.close();
        System.out.println("A két szám szorzata "+(szam1*szam2));
    }
    
}
