/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ana.paula.prova_recup;
import java.util.Scanner;
/**
 *
 * @author Suporte
 */
public class Exe8 {
    public static void main(String[] args) {
       
        int a=0;
        
       int v[] = new int[16];
       Scanner leia=new Scanner (System.in);
       
       for(int c=0;c < 16;c++){
           System.out.println("A primeira questão está: "
           +"\nDigite 1 para correta ou 2 para errada");
           v[c]=leia.nextInt();
           if(v[c]==1){
               a++;
           }
                   
       }
       
       double m = a+0.625;
       if(m>=7){
           System.out.println("Atingido");
       }else if(m>=5){
           System.out.println("Parcialmente Atingido");
       }else {
           System.out.println("Não Atingido");
       }
    }
    
}
