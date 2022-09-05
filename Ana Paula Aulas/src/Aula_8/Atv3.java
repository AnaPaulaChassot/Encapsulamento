/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_8;
import java.util.Scanner;
/**
 *
 * @author Suporte
 */
public class Atv3 {
    public static void main (String[] args){
        
         /*
        int n=1;
        while (n<10){
            System.out.println(n);
            n=n+1;
        }
*/
         
         int cont = 1;
         Scanner leia = new Scanner(System.in);
         System.out.println("Digite um número inteiro: ");
         int n = leia.nextInt();
         
         while (cont<=10) {
             System.out.println(n+ "x"+cont+" = "+n*cont);
             cont=cont+1;
         }
         
         
         

}
}
