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
public class Switch {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double a = leia.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = leia.nextDouble();
        System.out.println("Ecolha: \n1 - Soma"
                + "\n2 - Subtração" + "\n3 - Multiplicação" + "\n4 - Divisão");

        int op = leia.nextInt();

        /* if (op==1) {
           double x = a+b;
            System.out.println(x);
        }else if (op==2){
            double x = a-b;
            System.out.println(x);
            }else if (op==3){
            double x = a*b;
            System.out.println(x);
            }else if (op==4){  
            double x = a/b;
            System.out.println(x);
        }
         */
        switch (op) {
            case 1: {
                double x = a + b;

                System.out.println("Soma: " + x);
                break; // Finaliza
            }
            case 2: {
                double y = a - b;
                System.out.println("Subtração: " + y);
                 break;
            }
            case 3: {
                double z = a * b;
                System.out.println("Multiplicação: " + z);
                 break;
            }
            case 4: {
                double m = a / b;
                System.out.println("Divisão: " + m);
                 break;
            }
           
            
            default: {
                System.out.println("Fora do intervalo!");
            }

        }
    }
}
