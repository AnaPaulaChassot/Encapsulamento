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
public class Atv10 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 1 a 6: ");
        int n = leia.nextInt();
        
        switch (n){
            case 1:{
                System.out.println("SEG");
                break;
            }
             case 2:{
                System.out.println("TER");
                break;
            }
              case 3:{
                System.out.println("TER");
                break;
            }
               case 4:{
                System.out.println("QUA");
                break;
            }
                case 5:{
                System.out.println("QUI");
                break;
            }
                 case 6:{
                System.out.println("SEX");
                break;
            }
                 default: {
                     System.out.println("Número inválido");
                 }
        }
    }
    
}
