/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas_10;

import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class ClassFor {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número positivo inteiro: ");
        
        int n = leia.nextInt();
        
        
        for (int c = 1; c <= 10; c++) {
            System.out.println(n + " x " + c + " = " + (c * n));

        }
    }
}
