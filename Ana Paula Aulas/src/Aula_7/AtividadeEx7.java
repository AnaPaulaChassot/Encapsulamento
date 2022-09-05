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
public class AtividadeEx7 {
    public static void main (String[] args) {
        
       Scanner leia = new Scanner(System.in);
          System.out.println("Digite o primeiro número: ");
          int n1 = leia.nextInt(); 
          System.out.println("Digite o segundo número: ");
          int n2 = leia.nextInt();
          System.out.println("Digite o terceiro número: ");
          int n3 = leia.nextInt();
            
          
          if(n1>n2) {
              if(n1>n3){
                  System.out.println("O maior é: "+n1);
              }
        
          }else{if(n1<n2) {
              if(n2>n3){
                  System.out.println("O maior é: "+n2);
             
              }else{if(n3>n1) {
              if(n3>n2){
                  System.out.println("O maior é: "+n3);
                  
                  }
              }
          }
              
          
        
        
    }
          }
    }
}

