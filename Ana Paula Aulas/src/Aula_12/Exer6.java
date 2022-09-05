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
public class Exer6 {

    public static void main(String[] args) {

        int m4x4[][] = new int[4][4];

        Scanner leia = new Scanner(System.in);

        for (int l = 0; l < 4; l++) { //linha
            for (int c = 0; c < 4; c++) { //coluna

                System.out.println("Matriz 4x4 [" + l + "] " + "[" + c + "]");
                m4x4[l][c] = leia.nextInt();//ler linha l e coluna c

            }
        }
        for (int l = 0; l < 4; l++) { //linha
            for (int c = 0; c < 4; c++) { //coluna
                
                

                System.out.print(m4x4[l][c]+"\t");//usar print, não println

            }
            
            System.out.println(""); //pula as linhas
        }
            for (int l = 0; l < 4; l++) { //linha
                int s=0;
            for (int c = 0; c < 4; c++) { //coluna
                
            s=s+m4x4[l][c];    


            }
            
            System.out.println(s); 
        }

        }
    }

