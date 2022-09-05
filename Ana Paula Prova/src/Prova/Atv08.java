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
public class Atv08 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Escolha a fruta conforme a tabela:"
        + "\n1 - Banana"
                + "\n2 - Maçã"
                + "\n3 - Laranja"
                + "\n4 - Kiwi"
                + "\n5 - Pêssego");
        
        int v = leia.nextInt();
        
        switch(v){
            case 1: {
               double m = 1.1;
               System.out.println("o valor do KG é: "+ m );
               System.out.println("Quantos KG deseja comprar?: ");
               double kg = leia.nextDouble();
               System.out.println("O valor total da compra é: "+kg*m);
               
               break;
                
            }
             
        
            case 2: {
               double m = 1.2;
                System.out.println("o valor do KG é: "+ m );
               System.out.println("Quantos KG deseja comprar?: ");
               double kg = leia.nextDouble();
               System.out.println("O valor total da compra é: "+kg*m);
               break;
            } 
        
            case 3: {
               double m = 1.3;
                System.out.println("o valor do KG é: "+ m );
               System.out.println("Quantos KG deseja comprar?: ");
               double kg = leia.nextDouble();
               System.out.println("O valor total da compra é: "+kg*m);
               break;
            } 
        
            case 4: {
               double m = 1.4;
                System.out.println("o valor do KG é: "+ m );
               System.out.println("Quantos KG deseja comprar?: ");
               double kg = leia.nextDouble();
               System.out.println("O valor total da compra é: "+kg*m);
               break;
            } 
        
            case 5: {
               double m = 1.5;
                System.out.println("o valor do KG é: "+ m );
               System.out.println("Quantos KG deseja comprar?: ");
               double kg = leia.nextDouble();
               System.out.println("O valor total da compra é: "+kg*m);
               break;
            }
        }
             
        
    }
    
}
