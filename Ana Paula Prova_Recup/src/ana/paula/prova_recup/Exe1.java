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
public class Exe1 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o primeiro valor: ");
        double a = leia.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double b = leia.nextDouble();
        System.out.println("Escolha a operação desejada: "
        + "\n(Digite 1 para soma, 2 para subtração, 3 para multiplicação e 4 para divisão)");
        int op = leia.nextInt();
        
        if(op==4 && (a==0 || b==0)){
            while(a==0 || b==0){
            System.out.println("Para divisão nenhum dos valores deve ser zero");
            System.out.println("Digite o primeiro valor: ");
             a = leia.nextDouble();
             System.out.println("Digite o segundo valor: ");
             b = leia.nextDouble();
          
             
            }
            
             
       }else if(op==1){
           double x=a+b;
            System.out.println("A soma de "+a+" e "+b+ " é: "+x);
       }else if(op==2){
           double x=a-b;
            System.out.println("A subtração de "+a+" e "+b+ " é: "+x);
       }else if(op==3){
           double x=a*b;
            System.out.println("A multiplicação de "+a+" e "+b+ " é: "+x);
       }else if(op==4){
           double x=a/b;
            System.out.println("A divisão de "+a+" e "+b+ " é: "+x);
       }
    }
    
}
