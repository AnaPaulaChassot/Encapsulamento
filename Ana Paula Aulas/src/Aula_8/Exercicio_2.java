/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_8;

import java.util.Scanner;

/**
 *
 * @author anapc
 */
public class Exercicio_2 {

    public static void main(String[] args) {

        int cont = 0;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = leia.nextInt();
        int op = n % 2;
        System.out.println("Os quatro números impares positivos próximos de " + n + " são: ");
        int x = n;

        if (n > 4) {
            while (cont <= 6) {

                cont = cont + 2;

                if (op == 0) {
                    x = (n - 5);
                    int y = x + cont;

                    System.out.println(y);

                } else if (op != 0) {
                    x = (n - 4);
                    int y = x + cont;
                    System.out.println(y);

                }
            }
        } else {
            System.out.println("1,3,5,7");
        }

    }
}
