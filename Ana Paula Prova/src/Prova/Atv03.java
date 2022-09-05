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
public class Atv03 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Nome do(a) funcionário(a)");
        String nome = leia.nextLine();
        System.out.println("Salário atual do(a) funcionário(a)");
        Double salario = leia.nextDouble();
         System.out.println("Tempo na empresa (em anos): ");
        int tempo = leia.nextInt();
        
        switch (tempo){
            case 1:
            case 2:
            case 3:
            case 4: {
                
                double reajuste = (salario*1.1);
                System.out.println("funcionário(a): "+nome
                        + "\nsalário antigo: " +salario
                        + "\nnovo salário:  "+reajuste);
                break;
            }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:{
                
                double reajuste = (salario*1.15);
                System.out.println("funcionário(a): "+nome
                        + "\nsalário antigo: " +salario
                        + "\nnovo salário:  "+reajuste);
                break;
            }
             case 10:
            case 11:
            case 12:
            case 13:
            case 14:{
                
                double reajuste = (salario*1.2);
                System.out.println("funcionário(a): "+nome
                        + "\nsalário antigo: " +salario
                        + "\nnovo salário:  "+reajuste);
                break;
                
        }
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:{
                
                double reajuste = (salario*1.25);
                System.out.println("funcionário(a): "+nome
                        + "\nsalário antigo: " +salario
                        + "\nnovo salário:  "+reajuste);
                break;
    }
            default: {
                double reajuste = (salario*1.3);
                System.out.println("funcionário(a): "+nome
                        + "\nsalário antigo: " +salario
                        + "\nnovo salário:  "+reajuste);
    }
            }
    }
}
