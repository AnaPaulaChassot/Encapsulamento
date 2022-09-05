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
public class classMatriz {

    public static void main(String[] args) {

        int m3x4[][] = new int[3][4];

        Scanner leia = new Scanner(System.in);

        for (int l = 0; l < 3; l++) { //linha
            for (int c = 0; c < 4; c++) { //coluna

                System.out.println("Matriz 3x4 [" + l + "] " + "[" + c + "]");
                m3x4[l][c] = leia.nextInt();//ler linha l e coluna c

            }
        }
        for (int l = 0; l < 3; l++) { //linha
            for (int c = 0; c < 4; c++) { //coluna

                System.out.print(m3x4[l][c]+"\t");//usar print, não println

            }
            
            System.out.println(""); //pula as linhas
        }
        

    }
}
