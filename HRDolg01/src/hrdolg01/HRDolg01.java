/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrdolg01;

/**
 *
 * @author hegyi.roland
 */
public class HRDolg01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] tomb  = {1,7,2,9,3,1,7};
        Kivalasztas(tomb);
        Rendezes(tomb);
        
        
    }

    private static void Kivalasztas(int[] tomb) {
        int kiv = 3;
        int i = 0;
        while (i<tomb.length && tomb[i]!=kiv){
            i++;
        }
        System.out.println("Elem a "+(i+1)+". helyen");
        
        
        
    }

    private static void Rendezes(int[] tomb) {
        for (int i = tomb.length-2; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (tomb[j]<tomb[j+1]) {
                    int temp = tomb[j];
                    tomb[j] = tomb[j+1];
                    tomb[j+1] = temp ;
                
                }
                
                
            }
            
        }
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i]+" ");
        }
    }
    
}
