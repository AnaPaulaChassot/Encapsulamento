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
public class Atv04 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o número correspondente ao prato principal: "
                + "\n1 - Vegetariano"
                 + "\n2 - Carne"
                + "\n3 - Frango"
                + "\n3 - Peixe");
        int p = leia.nextInt();
                System.out.println("Digite o número correspondente à sobremesa: "
                + "\n1 - Morango"
                 + "\n2 - Sorvete"
                + "\n3 - Mouse chocolate"
                + "\n3 - Sagu");
        int s = leia.nextInt();
          
        System.out.println("Digite o número correspondente à bebida: "
                + "\n1 - Cerveja"
                 + "\n2 - Suco"
                + "\n3 - Refrigerante"
                + "\n3 - Refri Diet");
        int b = leia.nextInt();
        
        switch (p) {
            case 1: {
                p=180;
                break;
            }
            case 2:{
                p=360;
                break;
            }
            case 3:{
                p=230;
                break;
            }
            case 4:{
                p=200;
                break;
            }default: {
                System.out.println("Inválido");
            }
        }
             switch (s) {
            case 1: {
                s=30;
                break;
            }
            case 2:{
                s=180;
                break;
            }
            case 3:{
                s=210;
                break;
            }
            case 4:{
                s=75;
                break;
            }default: {
                System.out.println("Inválido");
            }
        }
         switch (b) {
            case 1: {
                b=140;
                break;
            }
            case 2:{
                b=100;
                break;
            }
            case 3:{
                b=600;
                break;
            }
            case 4:{
                b=50;
                break;
            }default: {
                System.out.println("Inválido");
            }
        }
         
         int t = p+s+b;
         System.out.println("Total de calorias: "+t+ " calorias");
                 
    }
}
