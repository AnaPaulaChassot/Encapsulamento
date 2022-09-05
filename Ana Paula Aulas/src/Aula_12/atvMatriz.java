/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class atvMatriz {

    public static void main(String[] args) {

        int mA[][] = new int[3][3];
        
       
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro para cada posição da Matriz A: ");

        for (int l = 0; l < 3; l++) { //linha
            for (int c = 0; c < 3; c++) { //coluna

                System.out.println("Matriz A 3x3 [" + l + "] " + "[" + c + "]");
                mA[l][c] = leia.nextInt();//ler linha l e coluna c

            }
        }
       
        System.out.println("Matriz A: ");
        
        for (int l = 0; l < 3; l++) { //linha
            for (int c = 0; c < 3; c++) { //coluna

                System.out.print(mA[l][c]+"\t");//usar print, não println

            }
            
            System.out.println(""); //pula as linhas
        }
        
        
         System.out.println("Digite um valor para ser multiplicado por cada elemento da Matriz A: ");
         int  v = leia.nextInt();
               
         System.out.println("Matriz B: ");
         
            for (int l = 0; l < 3; l++) { 
            for (int c = 0; c < 3; c++) { 
      
                 
                 
                 System.out.print(mA[l][c]*v+"\t");

            }
            
            System.out.println(""); //pula as linhas      
                
                
                
            }
            }
        

    }

