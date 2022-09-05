/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;
import java.util.Scanner;
/**
 *
 * @author Suporte
 */
public class Atv09 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
       
      int v[] = new int [7];
        
       
        
        for (int i = 0; i < 7; i++) {
            
            System.out.println("Digite a posição "+i);
            v[i] = leia.nextInt();
        }
         System.out.println("Digite um número: ");
       int n = leia.nextInt();
       
         for (int i = 0; i < 7; i++) {
       if(n==v[i]){
           System.out.println("Contém no vetor");
       }
         }
        
    }
    
}
