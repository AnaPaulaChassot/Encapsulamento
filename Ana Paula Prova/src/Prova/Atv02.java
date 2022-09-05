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
public class Atv02 {

    public static void main(String[] args) {

        int a=0;
       int vet[] = new int [5];
       int vet2[] = new int [5];
       Scanner leia = new Scanner(System.in);
        
       for (int c=0; c<5;c++){
          
           System.out.println("Digite a posição "+c+" do vetor: ");
           vet[c] = leia.nextInt(); 
           
          
           
       }
        for (int c=0; c<5;c++){
               System.out.print(vet[c]+", ");
         
              
                
        }
        System.out.print("\n");
             for (int c=0; c<5;c++){
                  vet2[c] = vet[c];
             
                if (vet2[c]<0){
               
               vet2[c] = 0;
                }
             }
                
                for (int c=0; c<5;c++){
             
             System.out.print(vet2[c]+", ");
             
           
           }
           
           
          
       }
        
       }
    
