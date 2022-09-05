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
public class Exe3 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de pães desejada: ");
        int qt = leia.nextInt();
        
        double op = (qt*0.05)*12;
                
        
        System.out.println("O valor dos pães é: "+op);
    }
    
}
