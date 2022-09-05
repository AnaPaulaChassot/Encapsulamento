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
public class Exercicio_3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int a = leia.nextInt();

        while (a <= 0) {
            System.out.println("O número deve ser posivivo e maior do que zero. ");
            System.out.println("Digite um novo número: ");
            a = leia.nextInt();

        }

        System.out.println("Digite um número inteiro positivo que seja maior do que o primeiro: ");
        int b = leia.nextInt();

        while (b < a) {
            System.out.println("O número deve ser maior do que o primeiro. ");
            System.out.println("Digite um novo número: ");
            b = leia.nextInt();
        }
        int op = a % 2;
        System.out.println("A média dos números pares compreendidos entre " + a + " e " + b + " é: ");

        int n = a;
        int z = 0;
        int x = 1;
        int y = 0;

        while (n < b) {

            n = n + 2;
            z = z + n;
            x = x + n;
            y = y + 1;

        }
        if (op == 0) {

            int media = z / y;

            System.out.println(media);

        } else if (op != 0) {

            int media = x / y;
            System.out.println(media);

        }
    }

}
