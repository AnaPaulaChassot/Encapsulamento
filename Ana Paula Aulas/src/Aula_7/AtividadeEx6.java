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
public class AtividadeEx6 {
    public static void main (String[] args) {
        
       Scanner leia = new Scanner(System.in);
          System.out.println("Digite o primeiro número: ");
          double n1 = leia.nextDouble(); 
          System.out.println("Digite o segundo número: ");
          double n2 = leia.nextDouble();       
          System.out.println("Digite 1 para soma, 2 para subtração, 3 para multiplicação ou 4 para divisão: ");
          int op = leia.nextInt();
          double r;


          
          
          if(op==1) {
              r = n1+n2;
              System.out.println("A soma é: "+r);
        
          }else{
              if(op==2){
                  r = n1-n2;
              System.out.println("A soma é: "+r);
              }else{
                  if(op==3){
                      r = n1*n2;
              System.out.println("A soma é: "+r);
                  }else{
                      if(op==4){
                          r = n1/n2;
              System.out.println("A soma é: "+r);
                      }
                  }
              }
          }
              
          
        
        
    }
}
