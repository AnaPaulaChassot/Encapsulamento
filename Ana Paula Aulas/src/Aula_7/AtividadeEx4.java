/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_7;
import java.util.Scanner;
/**
 *
 * @author anapc
 */
public class AtividadeEx4 {
     public static void main (String[] args) {
         Scanner leia = new Scanner(System.in);
         System.out.println("Digite um número e indique com"
                 + " + se ele for positivo, ou - se ele for negativo: ");
         double n1 = leia.nextDouble();
         
         if (n1>0) {
             System.out.println("O valor é positivo");
             
         }else {
             System.out.println("O valor é negativo");
         }
     }
    
}
