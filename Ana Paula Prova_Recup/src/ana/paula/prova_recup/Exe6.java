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
public class Exe6 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        System.out.println("Digite o preço de custo do produto: ");
        double c = leia.nextDouble();
        
        System.out.println("Digite a porcentagem em % que deve acrescentar ao custo: ");
        double p = leia.nextDouble();
        
        double op = (c*(p/100))+c;
        System.out.println("O novo preço é: "+op);
    }
    
}
